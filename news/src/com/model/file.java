package com.model;

public class file {
	Integer NewsID;
	String FileName;
	Integer FileSize;
	Integer UserID;
	String UploadTime;
	String FileType;
	
	public file(Integer NewsID,String FileName,Integer FileSize,Integer UserID,String UploadTime,String FileType){
		super();
		this.NewsID=NewsID;
		this.FileName=FileName;
		this.FileSize=FileSize;
		this.UserID=UserID;
		this.UploadTime=UploadTime;
		this.FileType=FileType;
	}
	public file()
	{
		super();
	}

	public Integer getNewsID() {
		return NewsID;
	}

	public void setNewsID(Integer newsID) {
		NewsID = newsID;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public Integer getFileSize() {
		return FileSize;
	}

	public void setFileSize(Integer fileSize) {
		FileSize = fileSize;
	}

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer userID) {
		UserID = userID;
	}

	public String getUploadTime() {
		return UploadTime;
	}

	public void setUploadTime(String uploadTime) {
		UploadTime = uploadTime;
	}

	public String getFileType() {
		return FileType;
	}

	public void setFileType(String fileType) {
		FileType = fileType;
	}
	
	
}