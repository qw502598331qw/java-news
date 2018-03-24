$.displayorder3 = function(){
	for(var i = 0;i<orderList3.length;i++){
		$("#yijingbuy-table").append("<tr>" +
				//"<td class=text-center>"+(i+1)+"</td>" +
				"<td class=text-center>"+orderList3[i].userID+"</td>" +
				"<td class=text-center>"+orderList3[i].loginName+"</td>" +
				"<td class=text-center>"+orderList3[i].loginPwd+"</td>" +
				"<td class=text-center>"+orderList3[i].userEmail+"</td>" +
				"<td class=text-center>"+orderList3[i].memberType+"</td>" +
				"<td class=text-center>"+orderList3[i].registerTime+"</td>" +
				//"<td class=text-center>"+orderList3[i].dwan+"</td>" +
				"<td class=text-center><a href='javascript:void(0);' onclick=seeyijingbuygoods("+orderList3[i].userID+")>删除</a>" +
							"<a href='javascript:void(0);' onclick=updateUsers("+orderList3[i].userID+")>修改</a>" +
				"</tr>")
	}
};
//用户查看
function getBuyjilv(){
	//alert(name);
	//window.location.reload();
	$("#getAllGoods").hide();
	$("#findGood2").hide();
	$("#editMyxinxi").hide();
	$("#editgoodsxinxi").hide();
	$("#getBuyGoodsjilu").hide();
	$("#sellGoods").hide();
	$("#getbuycar").hide();
	$("#buygoodsxinxi").hide();
	$("#selledgoodsxinxi").hide();
	$("UpdateNusers").hide();
	
	$.ajax({
		url:"user/getgeren",
		type:"post",
		datatype:"json",
		data:{
			"state":0,
			"numsize":5,
		},
		success:function(data){		
			//alert(data);
			$("#yijingbuy-table tr").eq(0).nextAll().remove();
			orderList3=JSON.parse(data);
			$.displayorder3();
			$("#getAllGoods").hide();
			$("#findGood2").hide();
			$("#editMyxinxi").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").show();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
			$("UpdateNusers").hide();
		},
		error:function(){alert("error!");},
	});
}

function findGoodss33(target){
	//window.location.reload();
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
			"state":state,
			"numsize":5,
		},
		success:function(data){
			//alert(data);
			$("#order-table tr").eq(0).nextAll().remove(); //除第0行外，全部删除其它行。。
			orderList=JSON.parse(data);
			$.displayorder3();
			$("#getAllGoods").hide();
			$("#editMyxinxi").hide();
			$("#findGood2").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").show();
			$("#sellGoods").hide();
			$("#getbuycar").hide();
			$("#buygoodsxinxi").hide();
			$("#selledgoodsxinxi").hide();
			$("UpdateNusers").hide();
		},
		error:function(){alert("error!");},
	});
}
//用户删除
function seeyijingbuygoods(t){
	var thisURL = document.URL;    
	var  getval =thisURL.split('?')[1];  
	var name= getval.split("=")[1];
	
	var r=confirm("确定删除?");	
	if(r==true){
		$.ajax({
			url:"user/suser",
			data:{
				"UserID":t
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
		
	}else
		return;
	
	
	
}


//用户权限修改
function updateUsers(t){
	var date=t;
	alert(date);
	var httph='http://106.14.191.32:8080/news/upquan.html?name='+date; 
		window.open(httph,'newwindow','width=600,height=500,top=0,left=0');
	
}



