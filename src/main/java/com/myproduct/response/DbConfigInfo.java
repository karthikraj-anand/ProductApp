package com.myproduct.response;

public class DbConfigInfo {
	private String dbUrl;
	private String dbUserName;
	private String dbUserPassword;
	private String dbDriver;
	
	public DbConfigInfo(String dbUrl, String dbUserName, String dbUserPassword, String dbDriver) {
		this.dbUrl = dbUrl;
		this.dbUserName = dbUserName;
		this.dbUserPassword = dbUserPassword;
		this.dbDriver = dbDriver;
	}
	
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	public String getDbUserPassword() {
		return dbUserPassword;
	}
	public void setDbUserPassword(String dbUserPassword) {
		this.dbUserPassword = dbUserPassword;
	}
	public String getDbDriver() {
		return dbDriver;
	}
	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}
	
	
}
