<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setCharacterEncoding("UTF-8");//传值编码
response.setContentType("text/html;charset=UTF-8");//设置传输编码
String content = new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");

String savedDataInfo = "";
String savetitle = "";
String savetime="";
String saveuserid="";
String savename="";
String savenum=""; 
System.out.println("content:"+content);

//将获取的内容保存至数据库
 String user = "root";
 String password = "12345678";
 String url = "jdbc:mysql://localhost:3306/news";
 String driver = "com.mysql.jdbc.Driver";
 //String driver = "org.gjt.mm.mysql.Driver";
 String tableName = "n_news";
 String tableuser="n_user";
 String sqlstr;
 String sqlstr1;
 Connection conn = null;
 Statement stmt = null;
 ResultSet rs = null;

	try{
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        stmt = conn.createStatement(); 
        
        sqlstr = "update "+tableName+" set Newsnum=Newsnum+1  where NewsTitle='"+content+"' ";
        stmt.executeUpdate(sqlstr);
        
        sqlstr = "select s.NewsTitle,r.LoginName,s.NewsText,s.AuditTime,s.Newsnum from n_news s inner join n_user r on s.UserID=r.UserID  where NewsTitle like'"+content+"'";

        //sqlstr = "select * from "+tableName;
        //"SELECT e.name, e.age, d.name AS dname From employees e INNER JOIN dept d On e.dept_id = d.id";
        rs = stmt.executeQuery(sqlstr);
        ResultSetMetaData rsmd = rs.getMetaData();
        int j = 0;
        j = rsmd.getColumnCount();
        for(int k = 0; k<j; k++)
        {
            System.out.print(rsmd.getCatalogName(k+1));
            System.out.print("\t");
        }
        System.out.println();
        while(rs.next())
        {
            for(int i=0;i<j;i++)
            {
            	String columnValue = rs.getString(i+1);

            	if(i == 0){savetitle = columnValue;}
                if(i == 1){savename = columnValue;}
            	if(i == 2){savedDataInfo = columnValue;}
                if(i == 3){savetime = columnValue;}
                if(i == 4){savenum = columnValue;}
                System.out.print(columnValue);
                System.out.print("\t");
            }
            System.out.println();
        }
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
    //从数据库中取出文章内容打印到此处
</script>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<SCRIPT type=text/javascript src="ueditor/ueditor.config.js"></SCRIPT>  
	<SCRIPT type=text/javascript src="ueditor/ueditor.all.js"></SCRIPT>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
    <link rel="stylesheet" href="css/indexzw.css">
    <link rel="stylesheet" href="css/ft-carousel.css" />
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   
            <h1 class="top"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;首页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  新闻
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 体育&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 财经
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 科技&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 博客
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 图片&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 专栏    <img src="">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="index.html" id="dengru">登陆</a> </h1>
    <div class=" body">
            <h1 class="title" > <%=savetitle%></h1>
            <p class="time"> <%=savetime%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;阅读量:<%=savenum%></p>
            <div class="zhenwen">
                <%=savedDataInfo%>
                <p class="right"> 责任编辑:<%=savename%></p>
            </div>
    </div>
  </body>
</html>


