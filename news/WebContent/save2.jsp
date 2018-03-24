<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


String content = request.getParameter("name");

String savedDataInfo = "";
String savetitle = "";
String savetime="";
String saveuserid="";
String savename="";
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
        sqlstr = "select s.NewsTitle,r.LoginName,s.NewsText,s.AuditTime from n_news s inner join n_user r on s.UserID=r.UserID  where NewsID like'"+content+"'";
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
   
            <h1 class="top"> 首页  新闻 体育 财经 科技 博客 图片 专栏    <img src="">登录 注册</h1>
    <div class=" body">
            <h1 class="title" > <%=savetitle%></h1>
            <p class="time"> <%=savetime%></p>
            <div class="zhenwen">
                <%=savedDataInfo%>
                <p class="right"> 责任编辑:<%=savename%></p>
            </div>
    </div>
  </body>
</html>


