package lut.repository;


import lut.models.CareerInfo;
import lut.vo.UserCareerInfoVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @ProjectName: Graduate
 * @Package: lut.repository
 * @ClassName: CareerInfoRepository
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 17:54
 * @UpdateUser: yehui.mao
 */
@Repository
public interface CareerInfoRepository extends JpaRepository<CareerInfo, Long> {

    /**
     * 根据学号查找
     * @param id
     * @return
     */
    CareerInfo findById(String id);

    /**
     * 根据学号查找全部信息
     * @param id
     * @return
     */
    @Query(value = "select new lut.vo.UserCareerInfoVo ( " +
            "a.id, " +
            "a.name, " +
            "a.clazz, " +
            "b.nativeLocal, " +
            "b.cellphone, " +
            "b.corporation, " +
            "b.nature, " +
            "b.address, " +
            "b.province, " +
            "b.business, " +
            "b.position, " +
            "b.category, " +
            "b.stock, " +
            "b.top100, " +
            "b.title, " +
            "b.salary, " +
            "b.annual " +
            ") " +
            "from User a " +
            "left join CareerInfo b on a.id = b.id " +
            "where a.id = :id")
    UserCareerInfoVo getAllInfo(@Param("id") String id);

    @Transactional
    @Modifying
    @Query(value = "insert into career_info( " +
            "id, " +
            "native_local, " +
            "cellphone, " +
            "corporation, " +
            "nature, " +
            "address, " +
            "province, " +
            "business, " +
            "position, " +
            "category, " +
            "stock, " +
            "top100, " +
            "title, " +
            "salary, " +
            "annual " +
            ") " +
            "values( " +
            ":#{#careerInfo.getId()}, " +
            ":#{#careerInfo.getNativeLocal()}, " +
            ":#{#careerInfo.getCellphone()}, " +
            ":#{#careerInfo.getCorporation()}, " +
            ":#{#careerInfo.getNature()}, " +
            ":#{#careerInfo.getAddress()}, " +
            ":#{#careerInfo.getProvince()}, " +
            ":#{#careerInfo.getBusiness()}, " +
            ":#{#careerInfo.getPosition()}, " +
            ":#{#careerInfo.getCategory()}, " +
            ":#{#careerInfo.getStock()}, " +
            ":#{#careerInfo.getTop100()}, " +
            ":#{#careerInfo.getTitle()}, " +
            ":#{#careerInfo.getSalary()}, " +
            ":#{#careerInfo.getAnnual()} " +
            ") ", nativeQuery = true)
    int setCareerInfo(@Param("careerInfo") CareerInfo careerInfo);

}
