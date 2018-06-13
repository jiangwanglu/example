package com.kjc.mapper;

import com.kjc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: Kjc
 * @Description:
 * @Date: Create in 15:36 2017-12-06
 */
@Repository
public interface UserMapper {

    @SelectKey(before = false, keyProperty = "user.id", resultType = int.class, statement = {"SELECT @@IDENTITY as id"})
    @Insert("insert into [user] (userName,createTime) values (#{user.userName},${user.createTime})")
    public void insert(@Param("user") User user);

    int update(@Param("user")User user,@Param("data") Map<String, Object> data);

    @Select("SELECT * FROM [user] WHERE id = #{id}")
    public User get(@Param("id") int id);

    public List<User> search(@Param("user")User user,int limit,int offset);

    public int searchCount(@Param("user")User user);

	public User login(@Param("userName")String userName,@Param("password") String password);
    
}