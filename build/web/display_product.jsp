<%-- 
    Document   : display_product
    Created on : Dec 1, 2019, 8:44:23 PM
    Author     : hunglv
--%>
<%@page import="Model.MatHang" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Frame Display Detail Product</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style_display_product.css">
<body>
<div id="h1"></div>
<div id="h2"></div>
<div id="content">
	<!-- Hien thi hinh anh cua san pham mua -->
        <%
            MatHang mh = (MatHang) request.getAttribute("display_san_pham");
        %>
        <div id="set_img" style="width: 50%">
            <image src ="<%= mh.getUrl() %>" 
                   style="width: 100%; height: 600px" >
	</div>
	<!-- Cac thong thin cua san pham va chon mua -->
	<div id="set_event">
		<!-- Thong tin san pham -->
		<div id="inform_product">
			<h1 id="name_product" style="color: red;"><%= mh.getTen() %></h1>
                        <h2 id="price" style="color: blue;">Price: <%= mh.getGiaBan() %> </h2>
			<p id="discrible">Mo ta: <%= mh.getMoTa() %></p>
			
		</div>
		<!-- chon size va so luong sann pham mua -->
		<div id="option">
                    <select name="Size" style="width: 40%; float: left;">
                            <option value="<%= mh.getKichCo() %>"> <%= mh.getKichCo() %> </option>
                    </select>
                    <select name="So Luong" style="width: 40%; float: right;">
                        <% for (int i = 1; i <= 10; i++) {%>
                            <option value="<%= i %>"> <%= i %> </option>
                        <%}%>
                    </select>
		</div>

		<!-- button click mua hang -->
		<div id="click_event">
                    <form action="MainActivity" method="GET">
                        <input type="submit" name="click_button_display_product" id="dang_ki_mua" value="Dang Ky Mua"/>
                        <input type="submit" name="click_button_display_product" id="them_gio_hang" value="Them Gio Hang"/>
                    </form>
		</div>
	</div>
</div>

<div id="h4"></div>
</body>
</html>
