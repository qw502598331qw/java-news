package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.model.ding;
import com.model.duser;
import com.model.huo;
import com.model.news;
import com.model.user;
import com.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Autowired
	UserMapper userMapper;
	private int result;
	
	//用户
		@Override
		public boolean yadd(user yong) {
		result = userMapper.ysave(yong);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
		
		@Override
		public boolean ychong(Integer UserID) {
		result = userMapper.ychong(UserID);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
	
		@Override
		public boolean cun(user yong) {
			result = userMapper.getcun(yong);
		if (result > 0) 
		{
			return true;
		}	
		return false;
		}
	
		@Override
		public List<duser> allgeren(Integer UserID){
			List<duser> users = userMapper.allgeren(UserID);
			return users;
		}
	
	//发布新闻
		@Override
		public List<news> fabu(news news){
			List<news> users = userMapper.fabu(news);
			return users;
		}
		@Override
		public List<news> xfabu(Integer NewsID){
			List<news> users = userMapper.xfabu(NewsID);
			return users;
		}
		@Override
		public boolean znews(news news) {
		result = userMapper.znews(news);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
		@Override
		public boolean snews(Integer NewsID) {
		result = userMapper.snews(NewsID);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
		@Override
		public boolean xnews(news news) {
		result = userMapper.xnews(news);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
	//审核新闻
		@Override
		public List<news> shenhe(news news){
			List<news> users = userMapper.shenhe(news);
			return users;
		}
		@Override
		public String shennews(Integer NewsID) {
		String gou;
		gou= userMapper.shennews(NewsID);
		return gou;		
		}
		
		@Override
		public boolean xfile(news news) {
		result = userMapper.xfile(news);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
	//系统管理
		@Override
		public boolean suser (Integer UserID) {
		result = userMapper.suser(UserID);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
		
		@Override
		public boolean xuser (user user) {
		result = userMapper.xuser(user);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}
		
		@Override
		public List<user> getgeren(user user){
			List<user> users = userMapper.getgeren(user);
			return users;
		}
	//前台
		@Override
		public List<news> biaoti(String NewsTitle){
			List<news> users = userMapper.biaoti(NewsTitle);
			return users;
		}
		
		
		
		
		
		
	
	
	
	
	@Override
	public boolean add(huo huo) {
	result = userMapper.save(huo);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}
	
	@Override
	public boolean delete(Integer wid) {
	result = userMapper.delete(wid);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}

	@Override
	public boolean update(huo huo) {
	result = userMapper.update(huo);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}

	@Override
	public List<huo> huoqueryAll(){
		List<huo> users = userMapper.gethuo();
		return users;
	}
	
	@Override
	public List<user> yonghuqueryAll(String yid){
		List<user> users = userMapper.getgeren(yid);
		return users;
	}
	
	@Override
	public List<huo> gehuoqueryAll(String wyid){
		List<huo> users = userMapper.getgehuo(wyid);
		return users;
	}
	
	@Override
	public List<ding> dingqueryAll(String dbuy){
		List<ding> users = userMapper.getding(dbuy);
		return users;
	}
	
	
	
	
	
	//购买
	@Override
	public String buyname(Integer wid) {
	String gou;
	gou= userMapper.buyname(wid);
	return gou;		
	}
	
	@Override
	public boolean buyadd(ding ding) {
	result = userMapper.buysave(ding);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}
	
}