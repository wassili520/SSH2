package com.ssh.service;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.bean.User;
import com.ssh.dao.UserDao;
import com.ssh.forms.UserForm;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	public void regUser(UserForm userForm) throws HibernateException {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}
}
