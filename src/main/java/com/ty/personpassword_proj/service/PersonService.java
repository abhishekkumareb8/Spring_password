
package com.ty.personpassword_proj.service;

import java.util.List;

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
	
	public List<User> getAllUser(){
		return  dao.getUser();
	}
	
	public User getUserByEmail(User user) {
		User receiveUser= dao.getUserEmail(user.getEmail());		
		if(user.getPassword().equals(receiveUser.getPassword())) {
			return receiveUser;
		}
		return null;
	}
	
	public void deleteUser(int id)
	{
		dao.deleteUser(id);
	}

}
