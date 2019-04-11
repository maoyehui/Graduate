package lut.controllor;

import com.alibaba.fastjson.JSONObject;
import lut.common.ApiResponse;
import lut.models.CareerInfo;
import lut.models.User;
import lut.service.UserService;
import lut.vo.UserCareerInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ProjectName: GraduateStatistics
 * @Package: edu.lut.controllor
 * @ClassName: UserControllor
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 16:24
 * @UpdateUser: yehui.mao
 */
@RestController
@RequestMapping(value = "/api/v1/user")
public class UserControllor {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public ApiResponse<User> getData(@PathVariable String id) {

        User user = userService.getBasicInfo(id);

        ApiResponse<User> res = new ApiResponse<User>();

        if (user != null) {
            res.setMsg(ApiResponse.SUCCUSS);
            res.setCode(ApiResponse.OK);
        } else {
            res.setMsg("ID does not found!");
            res.setCode(ApiResponse.ERROR);
        }
        res.setData(user);

        return res;
    }

    @RequestMapping(value = "data/set/{id}", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ApiResponse<UserCareerInfoVo> setCareerInfo(@PathVariable String id, @RequestBody CareerInfo careerInfo) {

        int count = userService.setCareerInfo(careerInfo);

        ApiResponse<UserCareerInfoVo> res = new ApiResponse<>();

        if (count > 0) {
            res.setMsg(ApiResponse.SUCCUSS);
            res.setCode(ApiResponse.OK);
        } else {
            res.setMsg(ApiResponse.FAILED);
            res.setCode(ApiResponse.ERROR);
        }

        return res;
    }

    @RequestMapping(value = "data/get/{id}", method = RequestMethod.GET)
    public ApiResponse<UserCareerInfoVo> getAllInfo(@PathVariable String id) {

        UserCareerInfoVo allInfo = userService.getAllInfo(id);

        ApiResponse<UserCareerInfoVo> res = new ApiResponse<>();

        if (allInfo != null) {
            res.setMsg(ApiResponse.SUCCUSS);
            res.setCode(ApiResponse.OK);
        } else {
            res.setMsg("ID does not found!");
            res.setCode(ApiResponse.ERROR);
        }

        res.setData(allInfo);

        return res;
    }

}
