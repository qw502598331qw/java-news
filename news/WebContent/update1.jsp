<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


String content = request.getParameter("mycontent");
String title = request.getParameter("title");
String id = request.getParameter("id");
String userid = request.getParameter("user");

String savedDataInfo = "";
String savetitle = "";
System.out.println("content:"+content);

//将获取的内容保存至数据库
 String user = "root";
 String password = "12345678";
 String url = "jdbc:mysql://localhost:3306/news";
 String driver = "com.mysql.jdbc.Driver";
 //String driver = "org.gjt.mm.mysql.Driver";
 String tableName = "n_news";
 String sqlstr;
 Connection conn = null;
 Statement stmt = null;
 ResultSet rs = null;

	try{
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        stmt = conn.createStatement();
        
        sqlstr = "update "+tableName+" set NewsTitle='"+title+"',NewsText='"+content+"' where NewsID='"+id+"' ";
        stmt.executeUpdate(sqlstr);
        //sqlstr = "insert into "+tableName+"(NewsTitle,UserID,NewsText,NewsType)"+" values ('"+title+"','"+111+"','" + content + "','"+type1+"')";
        //stmt.executeUpdate(sqlstr);
        
        //sqlstr = "select * from "+tableName+" Where NewsTitle like '"+content+"' ";
        //sqlstr = "select * from "+tableName;
        //rs = stmt.executeQuery(sqlstr); 
    }
    catch(ClassNotFoundException e1)
    {
        System.out.println("数据库驱动不存在！");
        System.out.println(e1.toString());
    }
    catch(SQLException e2)
    {
        System.out.println("数据库存在异常！");
        System.out.println(e2.toString());
    }
    finally
    {
        try
        {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }            
    } 
%>
<script type="text/plain" id="editor">
   function closepage(){
    window.opener=null;
    window.open("","_self");
    setTimeout("self.close()",2000);
  } 
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
	<SCRIPT type=text/javascript src="ueditor/ueditor.config.js"></SCRIPT>  
	<SCRIPT type=text/javascript src="ueditor/ueditor.all.js"></SCRIPT>
  </head>
  
  <body onload="closepage()">
  	修改成功！
  </body>
</html>


