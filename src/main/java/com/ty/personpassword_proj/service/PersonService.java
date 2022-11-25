
package com.ty.personpassword_proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.personpassword_proj.dao.PersonDao;
import com.ty.personpassword_proj.dto.Application;
import com.ty.personpassword_proj.dto.User;

@Service
public class PersonService {
	
	@Autowired
	PersonDao dao;
	
	
	public User saveuser(User user ) {
		dao.saveUser(user);
		return user;
	}
	
	public Application saveapp(Application application) {
		dao.saveApp(application);
		return application;
	}
	public User user(User user)
	{
		return dao.getUserEmail(user.getEmail());
	}
	

}
