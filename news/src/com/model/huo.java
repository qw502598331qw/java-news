package com.model;

public class huo {
	Integer wid;
	String wname;
	Double wprice;
	String wxing;
	String wuse;
	String wyid;
	public huo(){
		super();
	}
	public huo(Integer wid,String wname,Double wprice,String wxing,String wuse,String wyid){
		this.wid=wid;
		this.wname=wname;
		this.wprice=wprice;
		this.wxing=wxing;
		this.wuse=wuse;
		this.wyid=wyid;
	}
	public huo(Integer wid,String wname,Double wprice,String wxing,String wuse){
		this.wid=wid;
		this.wname=wname;
		this.wprice=wprice;
		this.wxing=wxing;
		this.wuse=wuse;
	}
	public huo(String wname,Double wprice,String wxing,String wuse,String wyid){
		this.wname=wname;
		this.wprice=wprice;
		this.wxing=wxing;
		this.wuse=wuse;
		this.wyid=wyid;
	}
	public Integer getWid() {
		return wid;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public Double getWprice() {
		return wprice;
	}
	public void setWprice(Double wprice) {
		this.wprice = wprice;
	}
	public String getWxing() {
		return wxing;
	}
	public void setWxing(String wxing) {
		this.wxing = wxing;
	}
	public String getWuse() {
		return wuse;
	}
	public void setWuse(String wuse) {
		this.wuse = wuse;
	}
	public String getWyid() {
		return wyid;
	}
	public void setWyid(String wyid) {
		this.wyid = wyid;
	}
}
