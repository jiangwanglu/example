package com.kjc.dao.impl;

import com.kjc.dao.UserDao;
import com.kjc.entity.User;
import com.kjc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Kjc
 * @Description:
 * @Date: Create in 16:01 2017-12-06
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper mapper;

    @Transactional
    public void insert(User user){
        if(user.getCreateTime()<=0){
            user.setCreateTime((int)(System.currentTimeMillis()/1000));
        }
        mapper.insert(user);
    }

    public int update(User user, List<String> columns) throws Exception{
        Map<String,Object> dataMap = new HashMap<String,Object>();
        Class<?> clazz =  user.getClass();
        for(String column:columns){
            String oldColumn = column;
            char[] array = column.toCharArray();
            array[0] -= 32;
            column =  String.valueOf(array);
            Method m1 = clazz.getDeclaredMethod("get"+column);
            dataMap.put(oldColumn, m1.invoke(user));
        }
        return mapper.update(user,dataMap);
    }
    @Override
    public User get(int id){
        return mapper.get(id);
    }
    @Override
    public List<User> search(User user, int limit, int offset){
        return mapper.search(user,limit, offset);
    }
    @Override
    public int searchCount(User user){
        return mapper.searchCount(user);
    }
    
    //是否存在账号
	@Override
	public User login(String userName, String password) {
		return mapper.login(userName,password);
	}
}
