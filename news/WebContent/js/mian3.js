/*
$.displayorder5 = function(){
	for(var i = 0;i<orderList5.length;i++){
		$("#yijingbuy-table").append("<tr>" +
				"<td class=text-center>"+(i+1)+"</td>" +
				"<td class=text-center>"+orderList5[i].goodsname+"</td>" +
				"<td class=text-center>"+orderList5[i].goodsxinxi+"</td>" +
				"<td class=text-center>"+orderList5[i].goodsprice+"</td>" +
				"<td class=text-center>"+orderList5[i].goodsBy+"</td>" +
				"<td class=text-center>"+orderList5[i].data+"</td>" +
				"<td class=text-center><a href='javascript:void(0);' onclick=seeselledbuygoods("+orderList5[i].goodsID+")>查看详情</a>" +
				"</tr>")
	}
};
$.displayorder6 = function(){
	for(var i = 0;i<orderList6.length;i++){
		$("#yijingbuy-table").append("<tr>" +
				"<td class=text-center>"+(i+1)+"</td>" +
				"<td class=text-center>"+orderList6[i].goodsname+"</td>" +
				"<td class=text-center>"+orderList6[i].goodsxinxi+"</td>" +
				"<td class=text-center>"+orderList6[i].goodsprice+"</td>" +
				"<td class=text-center>"+orderList6[i].goodsBy+"</td>" +
				"<td class=text-center>"+orderList6[i].data+"</td>" +
				"<td class=text-center><a href='javascript:void(0);' onclick=deletesellinggoods("+orderList6[i].goodsID+")>下架</a>" +
				"</tr>")
	}
};
function seeyijingbuygoods(t){
	$.ajax({
		url:"GetmybuyGoodsxinxi",
		type:"post",
		data:{"GoodsID":t,
			
		  },
		datatype:"json",
		success:function(data){
       var list=JSON.parse(data);
			
			
			
			$("#getAllGoods").hide();
			$("#findGood2").hide();
			$("#editMyxinxi").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
			//$("#sellGoods").hide();
			//$("#getbuycar").hide();
			//$("#buygoodsxinxi").show();
			//$("#selledgoodsxinxi").hide();
			document.getElementById("Goodsxinxi3").value=list.goodsxinxi;
			document.getElementById("Goodsname3").value=list.goodsname;
			document.getElementById("Goodsprice3").value=list.goodsprice;
			document.getElementById("username3").value=list.username;
			document.getElementById("data3").value=list.data;
			document.getElementById("Phone3").value=list.phone;
			document.getElementById("Address3").value=list.address;
			document.getElementById("buydate3").value=list.buydata;
			document.getElementById("myphone3").value=list.myphone;
			document.getElementById("myaddress3").value=list.myaddress;
		},
		error:function(){alert("error!");},
	});

	
}


function myselledGoods(){
	$.ajax({
		url:"GetmyselledGoods",
		type:"post",
		datatype:"json",
		success:function(data){
			$("#yijingbuy-table tr").eq(0).nextAll().remove();
			orderList5=JSON.parse(data);
			$.displayorder5();
			
			$("#getAllGoods").hide();
			$("#findGood2").hide();
			$("#editMyxinxi").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").show();
		//	$("#sellGoods").hide();
		//	$("#getbuycar").hide();
		//	$("#buygoodsxinxi").hide();
		//	$("#selledgoodsxinxi").hide();
			
			
			
		},
		error:function(){alert("error!");},
	});

}
function seeselledbuygoods(t){
	$.ajax({
		url:"GetmyselledGoodsxinxi",
		type:"post",
		data:{"GoodsID":t,
			
		  },
		datatype:"json",
		success:function(data){
       var list=JSON.parse(data);
			
			
			
			$("#getAllGoods").hide();
			$("#findGood2").hide();
			$("#editMyxinxi").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").hide();
		//	$("#sellGoods").hide();
		//	$("#getbuycar").hide();
		//	$("#buygoodsxinxi").hide();
			//$("#selledgoodsxinxi").show();
			document.getElementById("Goodsxinxi4").value=list.goodsxinxi;
			document.getElementById("Goodsname4").value=list.goodsname;
			document.getElementById("Goodsprice4").value=list.goodsprice;
			document.getElementById("username4").value=list.username;
			document.getElementById("data4").value=list.data;
			document.getElementById("Phone4").value=list.phone;
			document.getElementById("Address4").value=list.address;
			document.getElementById("buydate4").value=list.buydata;
			document.getElementById("myphone4").value=list.myphone;
			document.getElementById("myaddress4").value=list.myaddress;
		},
		error:function(){alert("error!");},
	});
}
function mysellingGoods(){
	$.ajax({
		url:"GetsellingGoods",
		type:"post",
		datatype:"json",
		success:function(data){
			
			$("#getAllGoods").hide();
			$("#findGood2").hide();
			$("#editMyxinxi").hide();
			$("#editgoodsxinxi").hide();
			$("#getBuyGoodsjilu").show();
			//$("#sellGoods").hide();
			//$("#getbuycar").hide();
			//$("#buygoodsxinxi").hide();
			//$("#selledgoodsxinxi").hide();
			$("#yijingbuy-table tr").eq(0).nextAll().remove();
			orderList6=JSON.parse(data);
			$.displayorder6();
			
			
		},
		error:function(){alert("error!");},
	});
}
function deletesellinggoods(t){
	$.ajax({
		url:"deletesellinggoods",
		type:"post",
		data:{"GoodsID":t,
			
		  },
		datatype:"json",
		
		success:function(data){
			if(data=="true"){
				alert("下架成功");
				mysellingGoods();
			}else{
				alert("下架失败");
			}
			
			
			
		},
		error:function(){alert("error!");},
	});
}
*/
