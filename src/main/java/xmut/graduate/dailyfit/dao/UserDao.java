package xmut.graduate.dailyfit.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import xmut.graduate.dailyfit.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    //查询User表所有数据
    List<User> findByAllUser();

    User adminLogin(String username,String password);
}
