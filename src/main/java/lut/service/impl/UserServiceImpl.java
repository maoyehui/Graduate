package lut.service.impl;

import lut.models.CareerInfo;
import lut.models.User;
import lut.repository.CareerInfoRepository;
import lut.repository.UserRepository;
import lut.service.UserService;
import lut.vo.UserCareerInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ProjectName: Graduate
 * @Package: lut.service.impl
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 17:30
 * @UpdateUser: yehui.mao
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CareerInfoRepository careerInfoRepository;

    @Override
    public User getBasicInfo(String id) {
        User user = userRepository.findById(id);
        return user;
    }

    @Override
    public int setCareerInfo(CareerInfo careerInfo) {
        int count = careerInfoRepository.setCareerInfo(careerInfo);
        return count;
    }

    @Override
    public UserCareerInfoVo getAllInfo(String id) {
        UserCareerInfoVo allInfo = careerInfoRepository.getAllInfo(id);
        return allInfo;
    }
}
