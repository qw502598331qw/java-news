package com.model;

public class ding {
	Integer did;
	String dbuy;
	String dmoney;
	String dwan;
	public ding()
	{
		super();
	}
	
	public ding (Integer did,String dbuy,String dmoney,String dwan){
		super();
		this.did=did;
		this.dbuy=dbuy;
		this.dmoney=dmoney;
		this.dwan=dwan;
	}
	
	public ding (String dbuy,String dmoney,String dwan){
		this.dbuy=dbuy;
		this.dmoney=dmoney;
		this.dwan=dwan;
	}
	public ding (String dbuy,String dmoney){
		this.dbuy=dbuy;
		this.dmoney=dmoney;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDbuy() {
		return dbuy;
	}
	public void setDbuy(String dbuy) {
		this.dbuy = dbuy;
	}
	public String getDmoney() {
		return dmoney;
	}
	public void setDmoney(String dmoney) {
		this.dmoney = dmoney;
	}

}
