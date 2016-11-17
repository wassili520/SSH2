package com.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.forms.UserForm;
import com.ssh.service.UserService;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8640829557216157474L;
	
	private UserForm user;
	
	@Autowired
	private UserService userService;
	
	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		try {
			userService.regUser(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
            return ERROR;
		}
	}
	
	
	
}
