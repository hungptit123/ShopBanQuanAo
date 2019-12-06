package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.MatHang;

public final class display_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Frame Display Detail Product</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style_display_product.css\">\n");
      out.write("<body>\n");
      out.write("<div id=\"h1\"></div>\n");
      out.write("<div id=\"h2\"></div>\n");
      out.write("<div id=\"content\">\n");
      out.write("\t<!-- Hien thi hinh anh cua san pham mua -->\n");
      out.write("        ");

            MatHang mh = new MatHang(1, "ao", 100, 100, 200, "Do", "M", "abc");
//            MatHang mh = (MatHang) request.getAttribute("display_san_pham");
        
      out.write("\n");
      out.write("\t<div id=\"set_img\">\n");
      out.write("<!--\t\t<img id=\"image_product\" src=\"/home/hunglv/Pictures/1.jpg\">-->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Cac thong thin cua san pham va chon mua -->\n");
      out.write("\t<div id=\"set_event\">\n");
      out.write("\t\t<!-- Thong tin san pham -->\n");
      out.write("\t\t<div id=\"inform_product\">\n");
      out.write("\t\t\t<h1 id=\"name_product\" style=\"color: red;\">San Pham Giay A</h1>\n");
      out.write("                        <h2 id=\"price\" style=\"color: blue;\">Price: ");
      out.print( mh.getGiaBan() );
      out.write(" </h2>\n");
      out.write("\t\t\t<p id=\"discrible\">Mota: </p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- chon size va so luong sann pham mua -->\n");
      out.write("\t\t<div id=\"option\">\n");
      out.write("                    <select name=\"Size\" style=\"width: 40%; float: left;\">\n");
      out.write("                            <option value=\"2\"></option>\n");
      out.write("                    </select>\n");
      out.write("                    <select name=\"So Luong\" style=\"width: 40%; float: right;\">\n");
      out.write("                            <option value=\"1\">1</option>\n");
      out.write("                    </select>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- button click mua hang -->\n");
      out.write("\t\t<div id=\"click_event\">\n");
      out.write("\t\t\t<form action=\"\" method=\"POST\">\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"\" id=\"dang_ki_mua\" value=\"Dang Ky Mua\"/>\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"\" id=\"them_gio_hang\" value=\"Them Gio Hang\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"h4\"></div>\n");
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
