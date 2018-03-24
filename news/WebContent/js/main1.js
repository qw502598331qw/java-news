$.displayorder1 = function(){
	for(var i = 0;i<orderList.length;i++){
		if(orderList[i].newsStatus==2){
			orderList[i].newsStatus="已通过";
		}
		else if(orderList[i].newsStatus==3){
			orderList[i].newsStatus="未通过";
		}
		else{
			orderList[i].newsStatus="未审核";
		}
		$("#order-table").append("<tr>" +
				//NewsID,NewsTitle,UserID,ReleaseTime,NewsType,NewsStatus
				//"<td class=text-center>"+(i+1)+"</td>" +
				"<td class=text-center><a href='javascript:void(0);' onclick=ssgoodstocar("+orderList[i].newsID+")>"+orderList[i].newsID+"&nbsp;&nbsp </a>"+
				"<td class=text-center>"+orderList[i].newsTitle+"</td>" +
				"<td class=text-center>"+orderList[i].userID+"</td>" +
				"<td class=text-center>"+orderList[i].releaseTime+"</td>" +
				"<td class=text-center>"+orderList[i].newsType+"</td>" +
				"<td class=text-center>"+orderList[i].newsStatus+"</td>" +
				"<td class=text-center><a href='javascript:void(0);' onclick=addgoodstocar("+orderList[i].newsID+")>通过&nbsp;&nbsp<a href='javascript:void(0);' onclick=addnogoodstocar("+orderList[i].newsID+")>不通过&nbsp;&nbsp </a>" +
				"</tr>")
	}
};

//NewsID,NewsTitle,UserID,ReleaseTime,NewsType,NewsStatus
//<a href='javascript:void(0);' onclick=seegoods("+orderList[i].goodsID+")>查看详情</a>"
$.displayorder2 = function(){
	for(var i = 0;i<orderList.length;i++){
		$("#Book-table").append("<tr>" +
				//"<td class=text-center>"+(i+1)+"</td>" +
				//"<td class=text-center>"+orderList[i].newsID+"</td>" +
				"<td class=text-center>"+orderList[i].newsTitle+"</td>" +
				//"<td class=text-center>"+orderList[i].userID+"</td>" +
				"<td class=text-center>"+orderList[i].newsType+"</td>" +
				"<td class=text-center>"+orderList[i].newsStatus+"</td>" +
				"<td class=text-center>"+orderList[i].releaseTime+"</td>" +
				"<td class=text-center><a href='javascript:void(0);' onclick=deletgoodstocar("+orderList[i].newsID+")>删除&nbsp;&nbsp </a>" +
						"<a href='javascript:void(0);' onclick=updategoodstocar("+orderList[i].newsID+")>修改&nbsp;&nbsp </a>" +
				"</tr>")
	}
};

//得到自己信息
function getmyxinxi(){
	
	$("#getAllGoods").hide();
	$("#findGood2").hide();
	$("#editMyxinxi").show();
	$("#editgoodsxinxi").hide();
	$("#getBuyGoodsjilu").hide();
	$("#sellGoods").hide();
	$("#getbuycar").hide();
	$("#buygoodsxinxi").hide();
	$("#selledgoodsxinxi").hide();
	$("#UpdateNusers").hide();
	$("#Username3").show;
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1];  
	//alert(name);
	document.getElementById('Username3').value=name;  
	//document.getElementById('editUsername').value=name;  
	$.ajax({
		url:"user/allgeren",
		type:"post",
		datatype:"json",
		data:{
			"UserID":name
		},
		success:function(data){
			//alert(data);
			$("#getAllGoods").hide();
			$("#findGood2").hide();
			$("#editMyxinxi").show();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
			$("UpdateNusers").hide();
//			for(var i = 0;i<JSON.parse(data).length;i++){
//			document.getElementById("editUsername").value=JSON.parse(data)[i].UserID;
//			document.getElementById("editUserType").value=JSON.parse(data)[i].MemberType;
//			document.getElementById("username1").value=JSON.parse(data)[i].UserName;
//			document.getElementById("minzhu").value=JSON.parse(data)[i].UserNation;
//			document.getElementById("userbirthday").value=JSON.parse(data)[i].UserBirthday;
//			document.getElementById("useredcation").value=JSON.parse(data)[i].UserEducation;
//			document.getElementById("userenglish").value=JSON.parse(data)[i].UserEnglish;
//			document.getElementById("usermajor").value=JSON.parse(data)[i].UserMajor;
//			document.getElementById("userphone1").value=JSON.parse(data)[i].UserPhone;
//			document.getElementById("useraddress").value=JSON.parse(data)[i].UserAddress;
//			document.getElementById("userQQ").value=JSON.parse(data)[i].UserQQ;
//			}
		},
		error:function(){
			alert("error!");},
	});
}

//审核状态

var thisURL = document.URL;    
var  getval =thisURL.split('?')[1];  
var name= getval.split("=")[1];  
//alert(name);
$.ajax({
	url:"user/allgeren",
	type:"post",
	datatype:"json",
	data:{
		"UserID":name,
	},
		success:function(data){
			//alert(data);
			$("#Book-table tr").eq(0).nextAll().remove();
			if(name=="111")
				{
				$("#onesxinx").show();
				$("#newsaction").show();
				$("#newsshenhe").show();
				$("#xitguanli").show();
				}
			else 
				{
				$("#onesxinx").show();
				$("#newsaction").show();
				$("#newsshenhe").hide();
				$("#xitguanli").hide();
				}
		},
		error:function(){alert("error!");},
	});

//发布新闻
function findGood1(){
	$("#getAllGoods").hide();
	$("#editMyxinxi").hide();
	$("#findGood2").show();
	$("#editgoodsxinxi").hide();
	$("#getBuyGoodsjilu").hide();
	$("#sellGoods").hide();
	$("#getbuycar").hide();
	$("#buygoodsxinxi").hide();
	$("#selledgoodsxinxi").hide();
	$("UpdateNusers").hide();
	
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1];  
	//alert(name);
	$.ajax({
		url:"user/fabu",
		type:"post",
		datatype:"json",
		data:{
			"UserID":name,
			"state":0,
			"numsize":5,
		},
		success:function(data){
			//alert(data);
			$("#order-table tr").eq(0).nextAll().remove(); //除第0行外，全部删除其它行。。
			orderList=JSON.parse(data);
			$.displayorder2();
			$("#getAllGoods").hide();
			$("#editMyxinxi").hide();
			$("#findGood2").show();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
		},
		error:function(){alert("error!");},
	});
}
function findGoodss1(target){
	
	$("#getAllGoods").hide();
	$("#editMyxinxi").hide();
	$("#findGood2").show();
	$("#editgoodsxinxi").hide();
	$("#getBuyGoodsjilu").hide();
	$("#sellGoods").hide();
	$("#getbuycar").hide();
	$("#buygoodsxinxi").hide();
	$("#selledgoodsxinxi").hide();
	
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1]; 
	var state=$(target).text()
	state=state*5-5;
	//alert(name);
	//alert(state);
	$.ajax({
		url:"user/fabu",
		type:"post",
		datatype:"json",
		data:{
			"UserID":name,
			"state":state,
			"numsize":5,
		},
		success:function(data){
			//alert(data);
			$("#order-table tr").eq(0).nextAll().remove(); //除第0行外，全部删除其它行。。
			orderList=JSON.parse(data);
			$.displayorder2();
			$("#getAllGoods").hide();
			$("#editMyxinxi").hide();
			$("#findGood2").show();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
		},
		error:function(){alert("error!");},
	});
}
//刷新
function myrefresh()
{
	  window.location.reload();
}

//增加新闻
	function insertBook(){
		//alert(t);
		var thisURL = document.URL;    
		var  getval =thisURL.split('?')[1];  
		var name= getval.split("=")[1];  
		var httph='http://106.14.191.32:8080/news/save.jsp?name='+name; 
			window.open(httph);
		//window.location.href="http://www.baidu.com/"; 
	}
function insertBook1(){
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1];
	var type="体育";
	var myDate=new Date();
	var mytime=myDate.toLocaleTimeString();
	 var um =UE.getEditor('myEditor') ;
	 //alert(um);
	//alert(name);
	//NewsID,NewsTitle,UserID,ReleaseTime,NewsText,NewsType
	$.ajax({
		url:"user/znews",
		data:{
			//"NewsID":document.getElementById("newsid").value,
			"NewsTitle":document.getElementById("newstitle").value,
			"UserID":name,
			"NewsText":um,
			"ReleaseTime":mytime,
			"NewsType":document.getElementById("newstype").value,
		},
		type:"post",
		success:function(data){
			if(data=="true")
				{
					alert("增加成功！");
				}
			else{
				alert("增加失败！");
			}
	
		},
		error:function(){
			alert("error!");},
	});
	
}

//删除新闻
function deleteBook(){
	$.ajax({
		url:"user/snews",
		data:{
			"NewsID":document.getElementById("deletenewsname").value
			},
		type:"post",
		success:function(data){
			if(data=="true")
				{
					alert("删除成功！");
				}
			else{
				alert("删除失败！");
			}
		},
		error:function(){
			alert("error!");},
	});
	
}

//修改新闻
function updateBook(){
	$("#getAllGoods").hide();
	$("#findGood2").show();
	$("#editMyxinxi").hide();
	$("#editgoodsxinxi").show();
	$("#getBuyGoodsjilu").hide();
	$("#sellGoods").hide();
	$("#getbuycar").hide();
	$("#buygoodsxinxi").hide();
	$("#selledgoodsxinxi").hide();
	$("UpdateNusers").hide();
}
function updateBook1(){
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1];
	var type="体育";
	var myDate=new Date();
	var mytime=myDate.toLocaleTimeString();
	//NewsID,NewsTitle,ReleaseTime,NewsText,NewsType
	$.ajax({
		url:"user/xnews",
		data:{
			"NewsID":document.getElementById("id").value,
			"NewsTitle":document.getElementById("title").value,
			"UserID":name,
			"NewsText":document.getElementById("text").value,
			"ReleaseTime":mytime,
			"NewsType":type,
			},
		type:"post",
		success:function(data){
			if(data=="true")
				{
				alert("修改成功！");
				}
			else{
				alert("修改失败！");
			}
		},
		error:function(){
			alert("error!");},
	});
	
}

//获取所有物品信息
function getallGoods(){
	
	$.ajax({
		url:"user/shenhe",
		type:"post",
		datatype:"json",
		data:{
			"state":0,
			"numsize":5,
		},
		success:function(data){
			$("#order-table tr").eq(0).nextAll().remove(); //除第0行外，全部删除其它行。。
			orderList=JSON.parse(data);
			$.displayorder1();
			$("#getAllGoods").show();
			$("#editMyxinxi").hide();
			$("#findGood2").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
			$("UpdateNusers").hide();
		},
		error:function(){alert("error!");},
	});
}

function findGoodss22(target){
	
	$("#getAllGoods").hide();
	$("#editMyxinxi").hide();
	$("#findGood2").hide();
	$("#editgoodsxinxi").hide();
	$("#getBuyGoodsjilu").hide();
	$("#sellGoods").hide();
	$("#getbuycar").hide();
	$("#buygoodsxinxi").hide();
	$("#selledgoodsxinxi").hide();
	$("UpdateNusers").hide();
	
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1]; 
	var state=$(target).text()
	state=state*5-5;
	//alert(name);
	//alert(state);
	$.ajax({
		url:"user/shenhe",
		type:"post",
		datatype:"json",
		data:{
			"UserID":name,
			"state":state,
			"numsize":5,
		},
		success:function(data){
			alert(data);
			$("#order-table tr").eq(0).nextAll().remove(); //除第0行外，全部删除其它行。。
			orderList=JSON.parse(data);
			$.displayorder1();
			$("#getAllGoods").hide();
			$("#editMyxinxi").hide();
			$("#findGood2").show();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
			$("UpdateNusers").hide();
		},
		error:function(){alert("error!");},
	});
}
//确定通过
function addgoodstocar(t){
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1]; 
	//alert(t);
	var r=confirm("确定通过?");	
	if(r==true){
		$.ajax({
			url:"user/xfile",
			type:"post",
			data:{
				"NewsID":t,
				"NewsStatus":2
				  },
			datatype:"json",
			success:function(data){
		
				if(data=="true"){
					alert("审核成功！");
					window.location.reload(); 
					
				}else{
					alert("审核失败！");}
				
			},
			error:function(){
				alert("error!");},
		});
		
	}else
		return;
}
//确定不通过
function addnogoodstocar(t){
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1]; 
	//alert(t);
	var r=confirm("确定不通过?");	
	if(r==true){
		$.ajax({
			url:"user/xfile",
			type:"post",
			data:{
				"NewsID":t,
				"NewsStatus":3
				  },
			datatype:"json",
			success:function(data){
		
				if(data=="true"){
					alert("审核成功！");
					window.location.reload(); 
					
				}else{
					alert("审核失败！");}
				
			},
			error:function(){
				alert("error!");},
		});
		
	}else
		return;
}

//查看新闻
function ssgoodstocar(t){
	//alert(t);
	var date=t;
	var httph='http://106.14.191.32:8080/news/save2.jsp?name='+date; 
		window.open(httph);
	//window.location.href="http://www.baidu.com/"; 
}

//确认删除
//删除方法
function deletgoodstocar(t){
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1];  
	//alert(name);
	var r=confirm("确定删除?");
	//document.getElementById('editUsername').value=name;  
	if(r==true)
	{
		$.ajax({
		url:"user/snews",
		type:"post",
		datatype:"json",
		data:{
			"NewsID":t,
		},
		success:function(data){
			//alert(data);
			if(data=="true"){
				alert("删除成功！");
				window.location.reload(); 
				
			}else{
				alert("删除失败！");}
		},
		error:function(){
			alert("error!");},
	});
	}
	else
	{
		return ;
	}
	
}
//确认修改
//修改方法
function updategoodstocar(t){
	//alert(t);
	var date=t;
	var httph='http://106.14.191.32:8080/news/update.jsp?name='+date; 
		window.open(httph);
	//window.location.href="http://www.baidu.com/"; 
}


