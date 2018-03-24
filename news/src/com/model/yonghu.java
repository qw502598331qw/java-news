package com.model;

public class yonghu {
	
	String yid;
	String yname;
	Integer yphone;
	String yaddress;
	
	public yonghu()
	{
		super();
	}
	public yonghu(String yid,String yname,Integer yphone,String yaddress){
		super();
		this.yid=yid;
		this.yname=yname;
		this.yphone=yphone;
		this.yaddress=yaddress;	
	}
	public  yonghu(String yid,String yname){
		super();
		this.yid=yid;
		this.yname=yname;
	}
	public String getYid() {
		return yid;
	}
	public void setYid(String yid) {
		this.yid = yid;
	}
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
	}
	public Integer getYphone() {
		return yphone;
	}
	public void setYphone(Integer yphone) {
		this.yphone = yphone;
	}
	public String getYaddress() {
		return yaddress;
	}
	public void setYaddress(String yaddress) {
		this.yaddress = yaddress;
	}
	}
