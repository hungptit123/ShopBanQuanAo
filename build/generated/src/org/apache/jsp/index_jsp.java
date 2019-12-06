package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.MatHang;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Thời trang nam</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        ");

            String name = "get_all_product";
            ArrayList<MatHang> list_mh = (ArrayList<MatHang>) request.getAttribute(name);
        
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"all\">\n");
      out.write("        <!-- Phần menu-->\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <div class=\"fix\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"image/logo.png\" alt=\"logo.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\">Giới thiệu</a></li>\n");
      out.write("                    <li><a href=\"\">Quần nam</a>\n");
      out.write("                        <ul class=\"sub-menu\">\n");
      out.write("                            <li><a href=\"\">Quần jeam</a></li>\n");
      out.write("                            <li><a href=\"\">Quần kaki</a></li>\n");
      out.write("                            <li><a href=\"\">Quần tây</a></li>\n");
      out.write("                            <li><a href=\"\">Quần short</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"\">Áo nam</a>\n");
      out.write("                        <ul class=\"sub-menu\">\n");
      out.write("                            <li><a href=\"\">Áo sơ mi</a></li>\n");
      out.write("                            <li><a href=\"\">Áo véc</a></li>\n");
      out.write("                            <li><a href=\"\">Áo thun</a></li>\n");
      out.write("                            <li><a href=\"\">Áo khoác</a></li>\n");
      out.write("                            <li><a href=\"\">Áo len</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"\">Giày nam</a>\n");
      out.write("                        <ul class=\"sub-menu\">\n");
      out.write("                            <li><a href=\"\">Giày tây</a></li>\n");
      out.write("                            <li><a href=\"\">Giày thể thao</a></li>\n");
      out.write("                            <li><a href=\"\">Giày lười</a></li>\n");
      out.write("                            <li><a href=\"\">Giày boot</a></li>\n");
      out.write("                            <li><a href=\"\">Giày thời trang</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"frame_login.jsp\">Đăng nhập</a></li>\n");
      out.write("                    <li><a href=\"\">Liên hệ</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"search\">\n");
      out.write("                    <input type=\"text\">\n");
      out.write("                    <input type=\"button\" value=\"Tìm\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <!------------------------------------------------------->\n");
      out.write("        <!--ảnh logo đầu trang-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"image/anhlogo1.jpg\" alt=\"sanpham.png\">            </div>\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"image/anhlogo2.jpg\" alt=\"sanpham.png\">            </div>    \n");
      out.write("        </div>\n");
      out.write("        <div style=\"text-align:center\">\n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(0)\"></span> \n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(1)\"></span> \n");
      out.write("        </div> \n");
      out.write("        <script>\n");
      out.write("      //khai báo biến slideIndex đại diện cho slide hiện tại\n");
      out.write("          var slideIndex;\n");
      out.write("          // KHai bào hàm hiển thị slide\n");
      out.write("          function showSlides() {\n");
      out.write("              var i;\n");
      out.write("              var slides = document.getElementsByClassName(\"image\");\n");
      out.write("              var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("              for (i = 0; i < slides.length; i++) {\n");
      out.write("                 slides[i].style.display = \"none\";  \n");
      out.write("              }\n");
      out.write("              for (i = 0; i < dots.length; i++) {\n");
      out.write("                  dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              slides[slideIndex].style.display = \"block\";  \n");
      out.write("              dots[slideIndex].className += \" active\";\n");
      out.write("              //chuyển đến slide tiếp theo\n");
      out.write("              slideIndex++;\n");
      out.write("              //nếu đang ở slide cuối cùng thì chuyển về slide đầu\n");
      out.write("              if (slideIndex > slides.length - 1) {\n");
      out.write("                slideIndex = 0\n");
      out.write("              }    \n");
      out.write("              //tự động chuyển đổi slide sau 5s\n");
      out.write("              setTimeout(showSlides, 1200);\n");
      out.write("          }\n");
      out.write("          //mặc định hiển thị slide đầu tiên \n");
      out.write("          showSlides(slideIndex = 0);\n");
      out.write("\n");
      out.write("\n");
      out.write("          function currentSlide(n) {\n");
      out.write("            showSlides(slideIndex = n);\n");
      out.write("          }\n");
      out.write("          \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    <!---------ảnh sản phẩm------->\n");
      out.write("    <div id=\"content_1\" style=\"width: 100%\">\n");
      out.write("            <div class=\"hang\" style=\"overflow-y: scroll; margin-top: 200px\">\n");
      out.write("                <form action=\"Control_SanPham\" method=\"GET\">\n");
      out.write("                    ");
 for (int i = 0; i < list_mh.size(); i++) {
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div style=\"width: 23%; height: 400px; padding: 10px 10px; float: left\">\n");
      out.write("                            <input type=\"image\" src= \"");
      out.print( list_mh.get(i).getUrl());
      out.write("\"\n");
      out.write("                                     alt=\"ảnh sp\" class=\"anh\"\n");
      out.write("                                     style=\"width: 100%; height: 290px;\" \n");
      out.write("                                     name=\"button_image\" value=\" ");
      out.print( i );
      out.write(" \"/>\n");
      out.write("                              <p style=\"width: 100%; height: 10px; float: left\">\n");
      out.write("                                  ");
      out.print( list_mh.get(i).getTen() );
      out.write("\n");
      out.write("                              </p>\n");
      out.write("                              <p style=\"width: 100%; height: 10px; float: left\">\n");
      out.write("                                  <span>Giá: </span><span>\n");
      out.write("                                      ");
      out.print( list_mh.get(i).getGiaBan() );
      out.write("\n");
      out.write("                                  \n");
      out.write("                                  </span></p>\n");
      out.write("                              \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            <!--</div>-->\n");
      out.write("        </div>\n");
      out.write("    <!--footer-->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"left-footer\">\n");
      out.write("                <img src=\"image/logo.png\" alt=\"logo\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"lienhe\">\n");
      out.write("                <h2>PROPTIT SHOP</h2>\n");
      out.write("                <p>Địa chỉ: Km10, Đường Nguyễn Trãi, Q.Hà Đông, Hà Nội</p>\n");
      out.write("                <p>Điện thoại: +84 332 212 277</p>\n");
      out.write("                <p>Email: mienpham2311@gmail.com</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"time\">\n");
      out.write("                <h2>Thời gian mở cửa</h2>\n");
      out.write("                <p>8h30 đến 22:00</p>\n");
      out.write("                <p>Tất cả các ngày trong tuần</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
