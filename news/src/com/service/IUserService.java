package com.service;

import java.util.List;
import com.model.ding;
import com.model.duser;
import com.model.huo;
import com.model.news;
import com.model.user;

public interface IUserService {
	
	//用户
				//添加用户信息，需要yonghu4种属性
				public boolean yadd(user yong);	
				//判断是否重名
				public boolean ychong(Integer UserID);
				//判断用户名和密码是否正确
				public boolean cun(user yong);//ok		
				//个人信息详细表
				public List<duser> allgeren(Integer UserID);
			
	//发布新闻
				//发布新闻查询
				public List<news> fabu(news news);
				//增加新闻
				public boolean znews(news news);
				//删除新闻
				public boolean snews(Integer NewsID);
				//修改新闻
				public boolean xnews(news news);
				//通过id查个别修改新闻
				public List<news> xfabu(Integer NewsID);
	//审核新闻
				//审核总体新闻查询
				public List<news> shenhe(news news);
				//审核详细新闻查询
				public String shennews(Integer NewsID);
				//修改新闻审核值
				public boolean xfile(news news);
				
	//系统管理
					//删除个人
					public boolean suser(Integer UserID);
					//修改个人,一个id，一个type
					public boolean xuser(user user);
					//查询所有用户
					public List<user> getgeren(user user);
					
	//前台
					//前台查询标题详细内容
					public List<news> biaoti(String NewsTitle);
					
	
	
	//货物
	// 添加货物信息，需要加入huo里面6种属性
	public boolean add(huo huo);
	
	// 删除货物信息，需要wid
	public boolean delete(Integer wid);

	// 修改货物信息，需要修改huo6种属性
	public boolean update(huo huo);

	//查询个人用户信息，需要yid
	public List<user> yonghuqueryAll(String yid);
	
	//查询所有的货物
	public List<huo> huoqueryAll();
	
	//查询个人发布的货物，需要yid
	public List<huo> gehuoqueryAll(String wyid);
	
	//查询个人订单，需要yid
	public List<ding> dingqueryAll(String dbuy);

	
	
	//购买
	//获得购买货物的名字，需要货物的wid
	public String buyname (Integer wid);
	
	//添加购买货物的订单，需要ding四种属性
	public boolean buyadd(ding ding);
	
	

}
