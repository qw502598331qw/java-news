<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String userid = request.getParameter("name");

%>
<script type="text/plain" id="editor">
    //从数据库中取出文章内容打印到此处
</script>
<script type="text/javascript"> 
</script>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" charset="UTF-8" src="<%=basePath %>ueditor/ueditor.config.js"></script>  
    <script type="text/javascript" charset="UTF-8" src="<%=basePath %>ueditor/ueditor.all.js"> </script>
  </head>
  
  <body>
  	<form action="indexs.jsp" method="post">
  					新闻标题：<input type="text" name="title">
					<br>
					<input type="text" name="userid1" id="userid"  value="<%=userid%>" style="display:none"><br>
					新闻类型：<input type="text" name="newstype11"  ><br>
	    			新闻内容：<TEXTAREA id="myEditor" name="mycontent" style="width:1000px;height:900px;" ></TEXTAREA>  
					<SCRIPT type=text/javascript>  
					    var editor = new UE.ui.Editor();  
					    editor.render("myEditor");  
					    //1.2.4以后可以使用一下代码实例化编辑器 
					    //var um =UE.getEditor('myEditor') 
					    //UE.getEditor('myEditor') 
					</SCRIPT>
					<input name="submit" value="提交" type="submit">
	</form>
  </body>
</html>


