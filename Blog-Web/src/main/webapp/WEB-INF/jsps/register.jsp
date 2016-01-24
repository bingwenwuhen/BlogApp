<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/1/11
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

  <meta charset="utf-8">
  <title>Blog Register</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">

  <!-- CSS -->
  <link rel="stylesheet" href="<c:url value='/resources/css/login/reset.css'/> ">
  <link rel="stylesheet" href="<c:url value='/resources/css/login/supersized.css'/>">
  <link rel="stylesheet" href="<c:url value='/resources/css/login/style.css'/>">

  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->

</head>

<body oncontextmenu="return false">

<div class="page-container">
  <h1>Register</h1>
  <form action="<c:url value='/user/register'/> " method="post">
    <div>
      <input type="text" name="username" class="username" placeholder="Username" autocomplete="off"/>
    </div>
    <div>
    <input type="password" name="password" class="password" placeholder="Password" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="password" class="password" id="confirmPassword" placeholder="confirmPassword" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="text" name="address" class="password" placeholder="address" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="text" name="job" class="password" placeholder="job" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="text" name="age" class="password" placeholder="age" oncontextmenu="return false" onpaste="return false" />
    </div>
    <div>
      <input type="email" name="email" class="password" placeholder="email" oncontextmenu="return false" onpaste="return false" />
    </div>
    <button id="submit" class="register" type="submit">注册</button>
  </form>
  <a href="<c:url  value= '/user/login'/> "><button>已有账号</button></a>
  <div class="connect">
    <p>If we can only encounter each other rather than stay with each other,then I wish we had never encountered.</p>
    <p style="margin-top:20px;">如果只是遇见，不能停留，不如不遇见。</p>
  </div>
</div>
<div class="alert" style="display:none">
  <h2>消息</h2>
  <div class="alert_con">
    <p id="ts"></p>
    <p style="line-height:70px"><a class="btn">确定</a></p>
  </div>
</div>

<!-- Javascript -->
<script src="<c:url value='/resources/js/jquery.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/js/login/supersized.3.2.7.min.js'/>"></script>
<script src="<c:url value='/resources/js/login/supersized-init.js'/>"></script>
<script src="<c:url value='/resources/js/jquery/jquery_checkUser.js'/> "></script>
<script>
  $(".btn").click(function(){
    is_hide();
  })
  var u = $("input[name=username]");
  var p = $("input[name=password]");
  $("#submit").live('click',function(){
    if(u.val() == '' || p.val() =='')
    {
      $("#ts").html("用户名或密码不能为空~");
      is_show();
      return false;
    }
    else{
      var reg = /^[0-9A-Za-z]+$/;
      if(!reg.exec(u.val()))
      {
        $("#ts").html("用户名错误");
        is_show();
        return false;
      }
    }
  });
  window.onload = function()
  {
    $(".connect p").eq(0).animate({"left":"0%"}, 600);
    $(".connect p").eq(1).animate({"left":"0%"}, 400);
  }
  function is_hide(){ $(".alert").animate({"top":"-40%"}, 300) }
  function is_show(){ $(".alert").show().animate({"top":"45%"}, 300) }
</script>
</body>

</html>