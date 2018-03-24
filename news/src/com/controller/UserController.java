package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.ding;
import com.model.duser;
import com.model.huo;
import com.model.news;
import com.model.user;
import com.service.IUserService;
import net.sf.json.JSONArray;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	//用户
			@RequestMapping(value = "/yadd" ,produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//用户注册
			public String yadd(Model model, HttpServletRequest request,Integer UserID,String LoginPwd,String UserEmail,Integer MemberType,String RegisterTime) {
				
				System.out.println(UserID);
				System.out.println(LoginPwd);
				System.out.println(UserEmail);
				System.out.println(MemberType);
				System.out.println(RegisterTime);
				user c=new user(UserID,LoginPwd,UserEmail,MemberType,RegisterTime);
				if(userService.yadd(c))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
			
			@RequestMapping(value = "/ychong" ,produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//判断注册用户是否重名
			
			public String ychong(Model model, HttpServletRequest request,Integer UserID ) {
				System.out.println(UserID);
				
				if(userService.ychong(UserID))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
			
			@RequestMapping(value = "/chayong" ,produces="text/html;charset=UTF-8;")
			@ResponseBody
			//判断用户名和密码是否正确
			 public String checkGuan(Model model,HttpServletRequest request,HttpSession session ,user yong,Integer yid,String yname){
				System.out.println(yid);
				System.out.println(yname);
				user c=new user(yid,yname);
				 session.setAttribute("username", yid);  
				if(userService.cun(c))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
			//user退出登录
//			@RequestMapping(value="/ulogout")
//			 public ModelAndView ulogout(
//					 HttpSession session,
//					 ModelAndView mv){
//				// 调用业务逻辑组件判断用户是否可以登录
//				if(true){
//					// 将用户从HttpSession当中移除
//					session.removeAttribute(LostConstants.USER_SESSION);
//					session.invalidate();
//					// 客户端跳转到login页面
//					mv.setViewName("redirect:/uloginForm");
//				}
//				return mv;
//				
//			}
			@RequestMapping(value = "/allgeren",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//查询个人详细表
			public String allgeren(Model model, HttpServletRequest request,duser duser,Integer UserID) {
				List<duser> list=userService.allgeren(UserID);
				JSONArray json = JSONArray.fromObject(list);
				System.out.println(json.toString());
				return json.toString(); 
			}
	
	//发布新闻
			@RequestMapping(value = "/fabu",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//发布新闻查询
			public String faub(Model model, HttpServletRequest request,news news,Integer UserID,Integer state,Integer numsize) {
				System.out.println(state);
				System.out.println(numsize);
				news c=new news(UserID,state,numsize);
				List<news> list=userService.fabu(c);
				JSONArray json = JSONArray.fromObject(list);
				System.out.println(json.toString());
				return json.toString(); 
			}
			
			@RequestMapping(value = "/xfabu",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//通过id查个别修改新闻
			public String xfaub(Model model, HttpServletRequest request,news news,Integer NewsID ) {
				List<news> list=userService.xfabu(NewsID);
				JSONArray json = JSONArray.fromObject(list);
				System.out.println(json.toString());
				return json.toString(); 
			}
			
			@RequestMapping(value = "/znews",produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//增加新闻
			public String znews(Model model, HttpServletRequest request, String NewsTitle,Integer UserID,String ReleaseTime,String NewsText,Integer NewsType)
			{
				
				System.out.println(NewsTitle);
				System.out.println(UserID);
				System.out.println(ReleaseTime);
				System.out.println( NewsText);
				System.out.println(NewsType);
				news c=new news(NewsTitle,UserID,ReleaseTime,NewsText,NewsType,1);
				if(userService.znews(c))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
	
			@RequestMapping(value = "/snews",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//删除新闻

			public String snews(Model model, HttpServletRequest request,Integer NewsID) {
				System.out.println(NewsID);
				if(userService.snews(NewsID))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
			@RequestMapping(value = "/xnews" ,produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//修改新闻
			public String xnews(Model model, HttpServletRequest request,Integer NewsID,String NewsTitle,Integer UserID,String ReleaseTime,String NewsText,Integer NewsType) {
				System.out.println(NewsID);
				System.out.println(NewsTitle);
				System.out.println(UserID);
				System.out.println(ReleaseTime);
				System.out.println( NewsText);
				System.out.println(NewsType);
				news c=new news(NewsID,NewsTitle,ReleaseTime,NewsText,NewsType);
				if(userService.xnews(c))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
	//审核新闻		
			@RequestMapping(value = "/shenhe",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//审核总体新闻查询
			public String shenhe(Model model, HttpServletRequest request,news news,Integer state,Integer numsize) {
				System.out.println(state);
				System.out.println(numsize);
				news c=new news(0,state,numsize);
				List<news> list=userService.shenhe(c);
				JSONArray json = JSONArray.fromObject(list);
				System.out.println(json.toString());
				return json.toString(); 
			}
			@RequestMapping(value = "/shennews" ,produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//审核详细新闻查询
			public String xnews(Model model, HttpServletRequest request, Integer NewsID){
				System.out.println(NewsID);
				String news;
				news=userService.shennews(NewsID);
				return news;
			}
			
			@RequestMapping(value = "/xfile" ,produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//修改新闻审核值
			public String xfile(Model model, HttpServletRequest request,Integer NewsID,Integer NewsStatus) {
				System.out.println(NewsID);	
				System.out.println(NewsStatus);	
				news c=new news(NewsID,NewsStatus);
				if(userService.xfile(c))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
	//系统管理
			@RequestMapping(value = "/suser" ,produces="text/html;charset=UTF-8;")  
			@ResponseBody
			//删除个人
			public String suser(Model model, HttpServletRequest request,Integer UserID) {
				System.out.println(UserID);		
				if(userService.suser(UserID))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
			
			//修改个人
			@RequestMapping(value = "/xuser",produces="text/html;charset=UTF-8;")
			@ResponseBody
			public String xuser(Model model, HttpServletRequest request,Integer UserID,Integer MemberType) {
				System.out.println(UserID);
				System.out.println(MemberType);
				user c=new user(UserID,MemberType);
				if(userService.xuser(c))
				{     	  
		            return "true";
		          }

			   else{
				   return "false";
		        }
			}
	
			@RequestMapping(value = "/getgeren",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//查询所有用户
			public String getgeren(Model model, HttpServletRequest request,user user,Integer state,Integer numsize) {
				System.out.println(state);
				System.out.println(numsize);
				user c=new user(state,numsize,0);
				List<user> list=userService.getgeren(c);
				JSONArray json = JSONArray.fromObject(list);
				System.out.println(json.toString());
				return json.toString(); 
			}
		//前台
			@RequestMapping(value = "/biaoti",produces="text/html;charset=UTF-8;")
			@ResponseBody
			//前台查询标题详细内容
			public String biaoti(Model model, HttpServletRequest request,String NewsTitle) {
				System.out.println(NewsTitle);
				List<news> list=userService.biaoti(NewsTitle);
				JSONArray json = JSONArray.fromObject(list);
				System.out.println(json.toString());
				return json.toString(); 
			}
			
			
			
			
			
			
			
			
			
			
			
	
	@RequestMapping(value = "/add",produces="text/html;charset=UTF-8;")  
	@ResponseBody
	//增加货物
	public String add(Model model, HttpServletRequest request, Integer wid,String wname, Double wprice,String wxing,String wuse,String wyid) {
		System.out.println(wid);
		System.out.println(wname);
		System.out.println(wprice);
		System.out.println(wxing);
		System.out.println(wuse);
		System.out.println(wyid);
		huo c=new huo(wname,wprice,wxing,wuse,wyid);
		if(userService.add(c))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
	
	@RequestMapping(value = "/update" ,produces="text/html;charset=UTF-8;")  
	@ResponseBody
	//修改货物
	public String update(Model model, HttpServletRequest request,Integer wid,String wname, Double wprice,String wxing,String wuse) {
		System.out.println(wid);
		System.out.println(wname);
		System.out.println(wprice);
		System.out.println(wxing);
		System.out.println(wuse);
		//System.out.println(wyid);
		huo c=new huo(wid,wname,wprice,wxing,wuse);
		if(userService.update(c))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
	@RequestMapping(value = "/delete",produces="text/html;charset=UTF-8;")
	@ResponseBody
	//删除货物

	public String delete(Model model, HttpServletRequest request,Integer wid) {
		System.out.println(wid);
		if(userService.delete(wid))
		{     	  
            return "true";
          }

	   else{
		   return "false";
        }
	}
		

	@RequestMapping(value = "/huocha",produces="text/html;charset=UTF-8;")
	@ResponseBody
	//查询所有的货物
	public String huoqueryAll(Model model, HttpServletRequest request,huo huo) {
		List<huo> list=userService.huoqueryAll();
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json.toString());
		return json.toString(); 
	}
	
	@RequestMapping(value = "/gehuocha",produces="text/html;charset=UTF-8;")
	@ResponseBody
	//查询个人的货物
	public String gehuoqueryAll(Model model, HttpServletRequest request,huo huo,String wyid) {
		List<huo> list=userService.gehuoqueryAll(wyid);
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json.toString());
		return json.toString(); 
	}
	
	@RequestMapping(value = "/yonghucha",produces="text/html;charset=UTF-8;")
	@ResponseBody
	//查询个人的信息
	public String yonghuqueryAll(Model model, HttpServletRequest request,user yong,String yid) {
		List<user> list=userService.yonghuqueryAll(yid);
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json.toString());
		return json.toString(); 
	}
	
	@RequestMapping(value = "/dingcha",produces="text/html;charset=UTF-8;")
	@ResponseBody
	//查询个人订单
	public String dingqueryAll(Model model, HttpServletRequest request,ding ding,String dbuy) {
		List<ding> list=userService.dingqueryAll(dbuy);
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json.toString());
		return json.toString(); 
	}
	
	
		
		@RequestMapping(value = "/buy" ,produces="text/html;charset=UTF-8;")
		@ResponseBody
		//增加订单
		 public String checkGuan(Model model,HttpServletRequest request ,Integer wid,String yid,String dmoney,String dwan){
			System.out.println(wid);
			System.out.println(yid);
			System.out.println(dmoney);
			System.out.println(dwan);
			dmoney=userService.buyname(wid);
			System.out.println(dmoney);
			ding c=new ding(yid,dmoney);
			if(userService.buyadd(c))
			{     	  
	            return "true";
	          }

		   else{
			   return "false";
	        }
		}
		
}
