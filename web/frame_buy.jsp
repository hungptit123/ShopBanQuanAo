<%-- 
    Document   : frame_buy
    Created on : Dec 1, 2019, 8:46:46 PM
    Author     : hunglv
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.HoaDonChiTiet" %>
<%@page import="Model.MatHang" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Giao Dien Mua Hang</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style_frame_buy.css">
<body>
<div id="h1"></div>
<div id="h2"></div>
<div id="content">
    <!--<form action="MainActivity" method="GET">-->
	<!-- Hien thi thong tin cac san pham da chon -->
	<div id="inform_products">
            <%
               ArrayList<HoaDonChiTiet> list_hdct = (ArrayList<HoaDonChiTiet>) request.getAttribute("list_hdct");
               
            %>
            <div style="width: 10%; height: 20px; float: left; background-color: yellow" >
                Hinh
            </div>
            <div style="width: 50%; height: 20px; float: left">
                Thong Tin San Pham
            </div>
            <div style="width: 10%; height: 20px; float: left">
                So Luong
            </div>
            <div style="width: 10%; height: 20px; float: left">
                Don gia
            </div>
            <div style="width: 10%; height: 20px; float: left">
                Tong
            </div>
            <div style="width: 10%; height: 20px; float: right">
                Xoa
            </div>
            <% for(int i=0; i<list_hdct.size(); i++) {%>
            <div style="width: 10%; height: 80px; float: left; background-color: yellowgreen" >
                </div>
                <div style="width: 50%; height: 80px; float: left">
                    <label style="font-size: 20px"> <%= list_hdct.get(i).getMh().getTen() %></label>
                </div>
                <div style="width: 10%; height: 80px; float: left">
                    <label style="font-size: 20px"> <%= list_hdct.get(i).getSoLuong() %></label>
                </div>
                <div style="width: 10%; height: 80px; float: left">
                    <label style="font-size: 20px"> <%= list_hdct.get(i).getMh().getGiaBan() %></label>
                </div>
                <div style="width: 10%; height: 80px; float: left">
                    <label style="font-size: 20px"> <%= list_hdct.get(i).getMh().getGiaBan() * list_hdct.get(i).getSoLuong() %></label>
                </div>
                <div style="width: 10%; height: 80px; float: right">
                    <form action="MainActivity" method="GET">
                        <input type="submit" value="Xoa" name = "xoa"/>
                    </form>
                </div>
            <%}%>
	</div>
    <!--</form>-->
	<div id="inform_sum">
		<h3 style="float: left; font-size: 32px; width: 20%; position: absolute; left: 30%;" >Total: </h3>
		<h3 style="float: left; font-size: 32px; position: absolute; left: 40%;" >10000</h3>
	</div>
	<div id="div_send">
		<form action="MainActivity" method="POST">
			<input type="submit" name="" value="Gui Don Hang" id="gui_don_hang" style="font-size: 32px; width: 20%; height: 50px"/>
		</form>
	</div>
</div>
<div id="h4"></div>
<script type="text/javascript">
//    var inputContainer = document.getElementById("inform_products");
//    for (var i = 0; i < ${list_hdct.size()}; i++) {    
//        var 
//    }
</script>
</body>
</html>
