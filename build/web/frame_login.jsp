<%-- 
    Document   : frame_login
    Created on : Nov 30, 2019, 3:43:56 PM
    Author     : hunglv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Frame Login</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style_login.css">
<body>
<div id="h1"></div>
<div id="div_login">
    <form action="MainActivity" method="POST">
	<div id="div_text">
            <div id="div_username">
                    <label id="label_username">Username: </label>
                    <input type="text" name="username" id="username" class="username">
            </div>
            <div id="div_password">
            <label id="label_password">Password:</label>
            <input type="password" name="password" id="password" class="password">
            </div>
	</div>
	<div id="div_event_btn">
		
            <div id="div_btn_login">
                    <input type="submit" name="act_login" value="Login" id="btn_login">
            </div>
            <div id="div_btn_register">
                    <input type="submit" name="act_login" value="Register" id="btn_register">
            </div>
		
	</div>
    </form>
</div>
</body>
</html>
