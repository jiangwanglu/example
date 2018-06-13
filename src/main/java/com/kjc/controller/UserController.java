package com.kjc.controller;

import com.kjc.constant.MsgCode;
import com.kjc.entity.User;
import com.kjc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Kjc
 * @Description:
 * @Date: Create in 16:15 2017-12-06
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/add.do")
    public Map<String,Object> addUser(@RequestBody User user){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("result", false);
        result.put("msgCode", MsgCode.FAIL.getValue());
        result.put("info", "");
        service.insert(user);
        if(user.getId()>0){
            result.put("result", true);
            result.put("msgCode", MsgCode.SUCCESS.getValue());
        }
        return result;
    }

    @RequestMapping("/edit.do")
    public Map<String,Object> edit(@RequestBody User user) throws Exception{
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("result", false);
        result.put("msgCode", MsgCode.FAIL.getValue());
        result.put("info", "");
        List<String> columns = new ArrayList<String>(Arrays.asList(new String[]{"userName"}));
        int r=service.update(user, columns);
        if(r>0){
            result.put("result", true);
            result.put("msgCode", MsgCode.SUCCESS.getValue());
        }
        return result;
    }

    @RequestMapping("/get.do")
    public  Map<String,Object> getUserById(@RequestParam("uid") int uid){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("data", service.get(uid));
        result.put("msgCode", MsgCode.SUCCESS.getValue());
        return result;
    }

    @RequestMapping("/search.do")
    public Map<String,Object> search(@RequestBody User user,int page,int per_page){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("result", true);
        result.put("msgCode", MsgCode.SUCCESS.getValue());
        List<User> datas = service.search(user, page, per_page);
        result.put("datas", datas);
        result.put("count", service.searchCount(user));
        return result;
    }

    
    //判断账号密码
    @RequestMapping("/login")
    public ModelAndView login(String userName,String password, ModelAndView mv,ModelMap map){
		User user = this.service.login(userName, password);
    	if(user != null){
    		map.addAttribute("name",user.getUserName());
    		mv.setViewName("MyHtml");
    	}else{
    		mv.setViewName("login");
    	}
    	return mv;
    }
    
}
