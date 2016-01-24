package cn.com.mapper;

import cn.com.domain.User;
import cn.com.log.LogPerformance;
import org.apache.ibatis.annotations.*;

/**
 * Created by xiaxuan on 16/1/6.
 */
public interface UserMapper {

    @LogPerformance
    @Insert("insert into user(username,password,age,job,address,email) values(#{username},#{password},#{age},#{job},#{address},#{email})")
    void addUser(User user);

    @LogPerformance
    @ResultMap("BaseResultMap")
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(@Param("username") String username,
              @Param("password") String password);

    @LogPerformance
    @Select("select * from user where username = #{username}")
    User load(@Param("username") String username);

    @LogPerformance
    @Select("select count(1) from user where username = #{username}")
    int checkUser(@Param("username") String username);

    @LogPerformance
    @Update("update user set username = #{username}, address = #{address}, age = {age}," +
            "email = #{email}, password= #{password} ")
    void updateUser(User user);
}
