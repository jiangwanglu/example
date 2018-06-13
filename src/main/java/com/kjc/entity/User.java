package com.kjc.entity;

import org.springframework.stereotype.Component;

/**
 * @Author: Kjc
 * @Description: 用户信息
 * @Date: Create in 15:32 2017-12-06
 */
@Component
public class User {

    private int id;

	private String userName;

    private int createTime;

    private String password;
    
    private String address;
    
    private String phone;
    
    private int rctype;
    
    private String building;
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getCreateTime() {
		return createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRctype() {
		return rctype;
	}

	public void setRctype(int rctype) {
		this.rctype = rctype;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}
}
