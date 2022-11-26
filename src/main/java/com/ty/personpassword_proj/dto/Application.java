package com.ty.personpassword_proj.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String appName;
	private String appUserName;
	private String appEmail;
	private String appPass;
	
	public String getAppUserName() {
		return appUserName;
	}
	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppEmail() {
		return appEmail;
	}
	public void setAppEmail(String appEmail) {
		this.appEmail = appEmail;
	}
	public String getAppPass() {
		return appPass;
	}
	public void setAppPass(String appPass) {
		this.appPass = appPass;
	}
	
	
	@Override
	public String toString() {
		return "Application [id=" + id + ", appName=" + appName + ", appUserName=" + appUserName + ", appEmail="
				+ appEmail + ", appPass=" + appPass + "]";
	}

	
}
