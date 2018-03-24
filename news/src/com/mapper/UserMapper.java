package com.mapper;
import java.util.List;

import com.model.ding;
import com.model.duser;
import com.model.file;
import com.model.huo;
import com.model.news;
import com.model.user;
import com.model.yonghu;

public  interface UserMapper{
	//用户
		//增加用户
		public int ysave(user yong);
		//查询用户名是否重复查
		public int ychong(Integer UserID);
		//判断用户名和密码是否正确
		public int getcun(user yong);//ok
		//个人信息详细表
		public List<duser> allgeren(Integer UserID);
		
				
		
	//发布新闻
		//发布新闻查询，通过个人id，查询到本人发布的所有新闻
		public List<news> fabu(news news);
		//增加新闻
		public int znews(news news);
		//删除新闻
		public int snews(Integer NewsID);
		//修改新闻
		public int xnews(news news);
		
		public List<news> xfabu(Integer NewsID);

		
	
	//审核新闻
		//审核总体新闻查询
		public List<news> shenhe(news news);
		//审核详细新闻查询
		public String shennews(Integer NewsID);
		//修改新闻审核值
		public int xfile(news news);
		
		
		
	//系统管理
		//删除个人
		public int suser(Integer UserID);
		//修改个人,一个id，一个type
		public int xuser(user user);
		//查询所有用户
		public List<user> getgeren(user user);
		
		
	//前台首页
		//前台查询标题详细内容
		public List<news> biaoti(String NewsTitle);
		
		
		
				public List<user> getgeren(String UserID);
				// 查询全部用户信息
				public List<huo> getgehuo(String wyid);
				
				// 添加一条用户信息	
				public int save(huo huo);
				
				// 删除一条用户信息
				public int delete(Integer wid);
				
				// 修改一条用户信息
				public int update(huo huo);
				

			
			//购买
				public List<huo> gethuo();
				
				public int buysave(ding ding);
				
				public String buyname(Integer wid);
			//订单
				
				public List<ding> getding(String dbuy);
	
}
