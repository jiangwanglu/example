package com.kjc.dao;

import com.kjc.entity.User;

import java.util.List;

/**
 * @Author: Kjc
 * @Description:
 * @Date: Create in 15:53 2017-12-06
 */
public interface UserDao {

    public void insert(User user);

    public int update(User user, List<String> columns) throws Exception;

    public User get(int id);

    public List<User> search(User user, int limit, int offset);

    public int searchCount(User user);

    //是否存在账号
    public User login(String userName,String password);
}
