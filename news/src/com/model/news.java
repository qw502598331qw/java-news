package com.model;

public class news {
	Integer NewsID;
	String NewsTitle;
	Integer UserID;
	String ReleaseTime;
	String NewsText;
	String AuditTime;
	Integer AuditEditor;
	Integer NewsType;
	Integer NewsStatus;
	Integer state;
	Integer numsize;
	//
	public news(Integer NewsID,String NewsTitle,Integer UserID,String ReleaseTime,String NewsText,String AuditTime,Integer AuditEditor,Integer NewsType,Integer NewsStatus){
		super();
		this.UserID=UserID;
		this.NewsTitle=NewsTitle;
		this.UserID=UserID;
		this.ReleaseTime=ReleaseTime;
		this.NewsText=NewsText;
		this.AuditTime=AuditTime;
		this.NewsType=NewsType;
		this.NewsStatus=NewsStatus;
		this.AuditEditor=AuditEditor;
	}
	//增加
	public news(String NewsTitle,Integer UserID,String ReleaseTime,String NewsText,Integer NewsType,Integer NewsStatus){
		super();
		this.NewsTitle=NewsTitle;
		this.UserID=UserID;
		this.ReleaseTime=ReleaseTime;
		this.NewsText=NewsText;
		this.NewsType=NewsType;
		this.NewsStatus=NewsStatus;
		

	}
	//修改
	public news(Integer NewsID,String NewsTitle,String ReleaseTime,String NewsText,Integer NewsType){
		super();
		this.NewsID=NewsID;
		this.NewsTitle=NewsTitle;
		this.ReleaseTime=ReleaseTime;
		this.NewsText=NewsText;
		this.NewsType=NewsType;

	}
	//新闻审核两个值
	public news(Integer NewsID,Integer NewsStatus){
		super();
		this.NewsID=NewsID;
		this.NewsStatus=NewsStatus;

	}
	public news(Integer UserID,Integer state,Integer numsize){
		super();
		this.UserID=UserID;
		this.state=state;
		this.numsize=numsize;

	}
	
	public news()
	{
		super();
	}
	public Integer getNewsID() {
		return NewsID;
	}
	public void setNewsID(Integer newsID) {
		NewsID = newsID;
	}
	public String getNewsTitle() {
		return NewsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		NewsTitle = newsTitle;
	}
	public Integer getUserID() {
		return UserID;
	}
	public void setUserID(Integer userID) {
		UserID = userID;
	}
	public String getReleaseTime() {
		return ReleaseTime;
	}
	public void setReleaseTime(String releaseTime) {
		ReleaseTime = releaseTime;
	}
	public String getNewsText() {
		return NewsText;
	}
	public void setNewsText(String newsText) {
		NewsText = newsText;
	}
	public String getAuditTime() {
		return AuditTime;
	}
	public void setAuditTime(String auditTime) {
		AuditTime = auditTime;
	}
	public Integer getNewsType() {
		return NewsType;
	}
	public void setNewsType(Integer newsType) {
		NewsType = newsType;
	}
	public Integer getNewsStatus() {
		return NewsStatus;
	}
	public void setNewsStatus(Integer newsStatus) {
		NewsStatus = newsStatus;
	}
	public Integer getAuditEditor() {
		return AuditEditor;
	}
	public void setAuditEditor(Integer auditEditor) {
		AuditEditor = auditEditor;
	}
	
	
}