package lut.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: Graduate
 * @Package: lut.models
 * @ClassName: User
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 17:39
 * @UpdateUser: yehui.mao
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id", nullable = false, updatable = false, columnDefinition="varchar(10) COMMENT '学号'")
    private String id;

    @Column(name = "name", columnDefinition="varchar(10) COMMENT '姓名'")
    private String name;

    @Column(name = "clazz", columnDefinition="varchar(10) COMMENT '班级'")
    private String clazz;

}
