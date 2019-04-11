package lut.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: Graduate
 * @Package: lut.models
 * @ClassName: basicInfo
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 17:46
 * @UpdateUser: yehui.mao
 */
@Data
@Entity
@Table(name = "career_info")
public class CareerInfo {

    @Id
    @Column(name = "id", nullable = false, updatable = false, columnDefinition="varchar(10) COMMENT '学号'")
    private String id;

    @Column(name = "native_local", columnDefinition="varchar(255) COMMENT '籍贯'")
    private String nativeLocal;

    @Column(name = "cellphone", columnDefinition="varchar(255) COMMENT '手机'")
    private String cellphone;

    @Column(name = "corporation", columnDefinition="varchar(255) COMMENT '工作单位名称'")
    private String corporation;

    @Column(name = "nature", columnDefinition="varchar(255) COMMENT '工作单位性质'")
    private String nature;

    @Column(name = "address", columnDefinition="varchar(255) COMMENT '单位地址'")
    private String address;

    @Column(name = "province", columnDefinition="varchar(255) COMMENT '单位所在地'")
    private String province;

    @Column(name = "business", columnDefinition="varchar(255) COMMENT '单位所属行业'")
    private String business;

    @Column(name = "position", columnDefinition="varchar(255) COMMENT '从事职位名称'")
    private String position;

    @Column(name = "category", columnDefinition="varchar(255) COMMENT '工作职位类别'")
    private String category;

    @Column(name = "stock", columnDefinition="varchar(255) COMMENT '是否上市公司'")
    private String stock;

    @Column(name = "top100", columnDefinition="varchar(255) COMMENT '是否行业TOP100'")
    private String top100;

    @Column(name = "title", columnDefinition="varchar(255) COMMENT '职称'")
    private String title;

    @Column(name = "salary", columnDefinition="varchar(255) COMMENT '月薪'")
    private String salary;

    @Column(name = "annual", columnDefinition="varchar(255) COMMENT '年薪'")
    private String annual;

}
