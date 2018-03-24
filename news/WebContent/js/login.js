 function checkUsername(){
		$.ajax({
			url : "../../ttt/user/checkUser",
			data: "username=" + $('#username').val(),
			type : "post",
			success : function(data) {
				alert(data);
			},
			error : function() {
				alert("error!");
			},
		});
}
