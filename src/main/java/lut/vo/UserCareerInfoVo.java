package lut.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ProjectName: Graduate
 * @Package: lut.vo
 * @ClassName: UserCareerInfo
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 18:01
 * @UpdateUser: yehui.mao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCareerInfoVo {

    private String id;

    private String name;

    private String clazz;

    private String nativeLocal;

    private String cellphone;

    private String corporation;

    private String nature;

    private String address;

    private String province;

    private String business;

    private String position;

    private String category;

    private String stock;

    private String top100;

    private String title;

    private String salary;

    private String annual;

}
