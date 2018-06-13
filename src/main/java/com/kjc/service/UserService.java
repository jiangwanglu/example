package com.kjc.service;

import com.kjc.dao.UserDao;
import com.kjc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Kjc
 * @Description:
 * @Date: Create in 16:14 2017-12-06
 */
@Service
public class UserService {
    @Autowired
    private UserDao dao;

    public void insert(User user){
        dao.insert(user);
    }

    public int update(User user, List<String> columns) throws Exception {
        return dao.update(user, columns);
    }

    public User get(int id) {
        return dao.get(id);
    }

    public List<User> search(User user,int limit,int offset){
        return dao.search(user,limit,offset);
    }

    public int searchCount(User user){
        return dao.searchCount(user);
    }
    
    //判断是否存在账号
    public User login(String userName,String password){
    	return dao.login(userName, password);
    }
}
