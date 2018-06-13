package com.kjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class HtmlController {
	
    //主页
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    //总表统计
    @RequestMapping("/right1")
    public String right() {
        return "Left/right1";
    }
    
    //单表统计
    @RequestMapping("/StatisticsA")
    public String StatisticsA() {
        return "Left/StatisticsLeft/a";
    }
    
    //用电监测统计
    @RequestMapping("/StatisticsC")
    public String StatisticsC() {
        return "Left/StatisticsLeft/c";
    }
    
    //用户查询
    @RequestMapping("/StatisticsF")
    public String StatisticsF() {
        return "Left/StatisticsLeft/f";
    }
    
    //仪表设置
    @RequestMapping("/chargeB")
    public String chargeB() {
        return "Left/chargeLeft/b";
    }
    
    //公摊仪表
    @RequestMapping("/chargeC1")
    public String chargeC1() {
        return "Left/chargeLeft/c1";
    }
 
    //房间仪表
    @RequestMapping("/chargeC2")
    public String chargeC2() {
        return "Left/chargeLeft/c2";
    }
    
    //单价设置
    @RequestMapping("/chargeD")
    public String chargeD() {
        return "Left/chargeLeft/d";
    }
    
    //抄表设置
    @RequestMapping("/chargeE")
    public String chargeE() {
        return "Left/chargeLeft/e";
    }
    
    //平台总览
    @RequestMapping("/configLeftA")
    public String configLeftA() {
        return "Left/configLeft/a";
    }
    
    //系统日志
    @RequestMapping("/configLeftB")
    public String configLeftB() {
        return "Left/configLeft/b";
    }
    
    //系统字典
    @RequestMapping("/configLeftC")
    public String configLeftC() {
        return "Left/configLeft/c";
    }
    
    //采集配置
    @RequestMapping("/configLeftD")
    public String configLeftD() {
        return "Left/configLeft/d";
    }
    
    //报警配置
    @RequestMapping("/configLeftE")
    public String configLeftE() {
        return "Left/configLeft/e";
    }
    
    //用户配置管理
    @RequestMapping("/configLeftF")
    public String configLeftF() {
        return "Left/configLeft/f";
    }
    
    //用户配置管理
    @RequestMapping("/configLeftG")
    public String configLeftG() {
        return "Left/configLeft/g";
    }
}
