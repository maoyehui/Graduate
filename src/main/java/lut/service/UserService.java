package lut.service;

import lut.models.CareerInfo;
import lut.models.User;
import lut.vo.UserCareerInfoVo;

/**
 * @ProjectName: Graduate
 * @Package: lut.service
 * @ClassName: UserService
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 17:26
 * @UpdateUser: yehui.mao
 */
public interface UserService {

    /**
     * 根据学号获取姓名和班级等基础信息
     * @param id
     * @return
     */
    User getBasicInfo(String id);

    /**
     * 设置毕业生就业信息
     * @param careerInfo
     * @return
     */
    int setCareerInfo(CareerInfo careerInfo);

    /**
     * 根据学号获取所有信息
     * @param id
     * @return
     */
    UserCareerInfoVo getAllInfo(String id);

}
