package com.model;

public class user {
	Integer UserID;
	String LoginName;
	String LoginPwd;
	String UserEmail;
	Integer MemberType;
	String RegisterTime;
	Integer state;
	Integer numsize;
	public user(Integer UserID,String LoginPwd,String UserEmail,Integer MemberType,String RegisterTime){
		super();
		this.UserID=UserID;
		this.LoginPwd=LoginPwd;
		this.UserEmail=UserEmail;
		this.MemberType=MemberType;
		this.RegisterTime=RegisterTime;
	}
	public user(Integer UserID,String LoginPwd){
		super();
		this.UserID=UserID;
		this.LoginPwd=LoginPwd;
	}
	public user(Integer UserID,Integer MemberType){
		this.UserID=UserID;
		this.MemberType=MemberType;
	}
	public user(Integer state,Integer numsize,Integer MemberType){
		super();
		this.state=state;
		this.numsize=numsize;
	}
	public user()
	{
		super();
	}
	public Integer getUserID() {
		return UserID;
	}
	public void setUserID(Integer userID) {
		UserID = userID;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getLoginPwd() {
		return LoginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		LoginPwd = loginPwd;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public Integer getMemberType() {
		return MemberType;
	}
	public void setMemberType(Integer memberType) {
		MemberType = memberType;
	}
	public String getRegisterTime() {
		return RegisterTime;
	}
	public void setRegisterTime(String registerTime) {
		RegisterTime = registerTime;
	}
	
	
}