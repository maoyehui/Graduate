# docker login --username=277684799@qq.com registry.cn-shanghai.aliyuncs.com
# docker build -t registry.cn-shanghai.aliyuncs.com/expr/lut/graduate .
# docker push registry.cn-shanghai.aliyuncs.com/expr/lut/graduate:latest
# docker run --name edu.lut.graduate -p 127.0.0.1:8888:8080 registry.cn-shanghai.aliyuncs.com/expr/lut/graduate

FROM java:8
MAINTAINER YEHUI MAO "maoyehui94@gmail.com"

ADD build/libs/Graduate-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-Xms512M -Xmx2G"
RUN sh -c 'mkdir /logs'

ENTRYPOINT java $JAVA_OPTS -jar /app.jar
