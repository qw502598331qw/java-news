package com.model;

public class duser {
	Integer UserID;
	String UserName;
	String UserSex;
	Integer UserNation;
	String UserBirthday;
	Integer UserEducation;
	String UserMajor;
	Integer MemberType;
	String UserEnglish;
	String UserPhone;
	String UserQQ;
	String UserAddress;
	public duser(Integer UserID,String UserName,String UserSex,Integer UserNation,String UserBirthday,Integer UserEducation,
			String UserMajor,Integer MemberType,String UserEnglish,String UserPhone,String UserQQ,String UserAddress){
		super();
		this.UserID=UserID;
		this.UserName=UserName;
		this.UserSex=UserSex;
		this.UserNation=UserNation;
		this.UserBirthday=UserBirthday;
		this.UserEducation=UserEducation;
		this.UserMajor=UserMajor;
		this.MemberType=MemberType;
		this.UserEnglish=UserEnglish;
		this.UserPhone=UserPhone;
		this.UserQQ=UserQQ;
		this.UserAddress=UserAddress;
	}
	 public duser()
		{
		super();
	}
	public Integer getUserID() {
		return UserID;
	}
	public void setUserID(Integer userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserSex() {
		return UserSex;
	}
	public void setUserSex(String userSex) {
		UserSex = userSex;
	}
	public Integer getUserNation() {
		return UserNation;
	}
	public void setUserNation(Integer userNation) {
		UserNation = userNation;
	}
	public String getUserBirthday() {
		return UserBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		UserBirthday = userBirthday;
	}
	public Integer getUserEducation() {
		return UserEducation;
	}
	public void setUserEducation(Integer userEducation) {
		UserEducation = userEducation;
	}
	public String getUserMajor() {
		return UserMajor;
	}
	public void setUserMajor(String userMajor) {
		UserMajor = userMajor;
	}
	
	
}