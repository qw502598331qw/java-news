function gotochange(){
	var yid=document.getElementById("user").value;
	var yname=document.getElementById("pwd").value;
	//alert(yid);
	var  getval =document.getElementById("user").value;
alert(getval);  
	$.ajax({
		url:"user/chayong",
		data:{"yid":yid,
			  "yname":yname},
		type:"post",
		success:function(data){
			if(data=="true"){
				
				document.location.href("main.html?name="+getval);
			}else{
				alert("用户名密码错误");
			}	
		},
		error:function(data){
			alert("系统出错")
		}
	})

}
function gotoset(){
	var myDate = new Date();
	var yid=document.getElementById("newId").value;
	var yname=document.getElementById("newname").value;
	var yphone=document.getElementById("newphone").value;
	var ypwd=document.getElementById("newpwd").value;
	var newType=document.getElementById("newType").value;
	var mytime=myDate.toLocaleTimeString();
	$.ajax({
		url:"user/yadd",
		data:{
				"UserID":yid,
			  "UserEmail":yphone,
			  "LoginPwd":ypwd,
			  "MemberType":newType,
			  "RegisterTime":mytime},
			  
		type:"post",
		success:function(data){
		
			if(data=="true"){
					alert("注册成功，返回登入");
				window.location.href = "index.html"
			}else{
				alert("注册失败");
			}
			
		},
		error:function(data){
			alert("系统出错")
		}
	})

}