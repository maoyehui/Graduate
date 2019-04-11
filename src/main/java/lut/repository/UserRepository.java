package lut.repository;

import lut.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: Graduate
 * @Package: lut.repository
 * @ClassName: UserRepository
 * @Description:
 * @Author: yehui.mao
 * @CreateDate: 2019/4/10 17:33
 * @UpdateUser: yehui.mao
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据学号获取姓名和班级等基础信息
     * @param id
     * @return
     */
    User findById(String id);

}
