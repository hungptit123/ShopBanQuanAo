<%-- 
    Document   : index
    Created on : Nov 30, 2019, 3:22:15 PM
    Author     : hunglv
--%>
<%@page import="Model.MatHang" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Thời trang nam</title>
</head>
<link rel="stylesheet" type="text/css" href="css/index.css">
        <%
            String name = "get_all_product";
            ArrayList<MatHang> list_mh = (ArrayList<MatHang>) request.getAttribute(name);
        %>
<body>
    <div class="all">
        <!-- Phần menu-->
        <div class="nav">
            <div class="fix">
            <div class="logo">
                <img src="image/logo.png" alt="logo.png">
            </div>
            <div class="menu">
                <ul>
                    <li><a href="">Giới thiệu</a></li>
                    <li><a href="">Quần nam</a>
                        <ul class="sub-menu">
                            <li><a href="">Quần jeam</a></li>
                            <li><a href="">Quần kaki</a></li>
                            <li><a href="">Quần tây</a></li>
                            <li><a href="">Quần short</a></li>
                        </ul>
                    </li>
                    <li><a href="">Áo nam</a>
                        <ul class="sub-menu">
                            <li><a href="">Áo sơ mi</a></li>
                            <li><a href="">Áo véc</a></li>
                            <li><a href="">Áo thun</a></li>
                            <li><a href="">Áo khoác</a></li>
                            <li><a href="">Áo len</a></li>
                        </ul>
                    </li>
                    <li><a href="">Giày nam</a>
                        <ul class="sub-menu">
                            <li><a href="">Giày tây</a></li>
                            <li><a href="">Giày thể thao</a></li>
                            <li><a href="">Giày lười</a></li>
                            <li><a href="">Giày boot</a></li>
                            <li><a href="">Giày thời trang</a></li>
                        </ul>
                    </li>
                    <li><a href="frame_login.jsp">Đăng nhập</a></li>
                    <li><a href="">Liên hệ</a></li>
                </ul>
            </div>
            <div class="search">
                <form action="MainActivity" method="GET">
                    <input type="text" name="txt_name_product"/>
                    <input type="submit" value="Tìm" name="find_mat_hang_theo_ten"/>
                </form>
            </div>
        </div>
        </div>
        <!------------------------------------------------------->
        <!--ảnh logo đầu trang-->
        <div class="header">
            <div class="image">
                <img src="image/anhlogo1.jpg" alt="sanpham.png">            </div>
            <div class="image">
                <img src="image/anhlogo2.jpg" alt="sanpham.png">            </div>    
        </div>
        <div style="text-align:center">
        <span class="dot" onclick="currentSlide(0)"></span> 
        <span class="dot" onclick="currentSlide(1)"></span> 
        </div> 
        <script>
      //khai báo biến slideIndex đại diện cho slide hiện tại
          var slideIndex;
          // KHai bào hàm hiển thị slide
          function showSlides() {
              var i;
              var slides = document.getElementsByClassName("image");
              var dots = document.getElementsByClassName("dot");
              for (i = 0; i < slides.length; i++) {
                 slides[i].style.display = "none";  
              }
              for (i = 0; i < dots.length; i++) {
                  dots[i].className = dots[i].className.replace(" active", "");
              }

              slides[slideIndex].style.display = "block";  
              dots[slideIndex].className += " active";
              //chuyển đến slide tiếp theo
              slideIndex++;
              //nếu đang ở slide cuối cùng thì chuyển về slide đầu
              if (slideIndex > slides.length - 1) {
                slideIndex = 0
              }    
              //tự động chuyển đổi slide sau 5s
              setTimeout(showSlides, 1200);
          }
          //mặc định hiển thị slide đầu tiên 
          showSlides(slideIndex = 0);


          function currentSlide(n) {
            showSlides(slideIndex = n);
          }
            
        </script>
        
    <!---------ảnh sản phẩm------->
    <div id="content_1" style="width: 100%">
            <div class="hang" style="overflow-y: scroll; margin-top: 200px">
                <form action="MainActivity" method="GET">
                    <% for (int i = 0; i < list_mh.size(); i++) {%>
                        
                        <div style="width: 23%; height: 400px; padding: 10px 10px; float: left">
                            <input type="submit"
                                     alt="ảnh sp" class="anh"
                                     style="width: 100%; height: 290px; background-image: url(<%= list_mh.get(i).getUrl()%>);
                                     font-size: 0px" 
                                     name="button_image" value="<%= i %>"/>
                              <p style="width: 100%; height: 10px; float: left">
                                  <%= list_mh.get(i).getTen() %>
                              </p>
                              <p style="width: 100%; height: 10px; float: left">
                                  <span>Giá: </span><span>
                                      <%= list_mh.get(i).getGiaBan() %>
                                  
                                  </span></p>
                              
                        </div>

                    <%}%>
                    
                    </div>
                </form>
            <!--</div>-->
        </div>
    <!--footer-->
        <div class="footer">
            <div class="left-footer">
                <img src="image/logo.png" alt="logo">
            </div>
            <div class="lienhe">
                <h2>PROPTIT SHOP</h2>
                <p>Địa chỉ: Km10, Đường Nguyễn Trãi, Q.Hà Đông, Hà Nội</p>
                <p>Điện thoại: +84 332 212 277</p>
                <p>Email: mienpham2311@gmail.com</p>
            </div>
            <div class="time">
                <h2>Thời gian mở cửa</h2>
                <p>8h30 đến 22:00</p>
                <p>Tất cả các ngày trong tuần</p>
            </div>
        </div>
    </div>
</body>
</html>
