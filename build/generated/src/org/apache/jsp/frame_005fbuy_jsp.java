package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.HoaDonChiTiet;
import Model.MatHang;

public final class frame_005fbuy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Giao Dien Mua Hang</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style_frame_buy.css\">\n");
      out.write("<body>\n");
      out.write("<div id=\"h1\"></div>\n");
      out.write("<div id=\"h2\"></div>\n");
      out.write("<div id=\"content\">\n");
      out.write("    <!--<form action=\"MainActivity\" method=\"GET\">-->\n");
      out.write("\t<!-- Hien thi thong tin cac san pham da chon -->\n");
      out.write("\t<div id=\"inform_products\">\n");
      out.write("            ");

//               ArrayList<HoaDonChiTiet> list_hdct = (ArrayList<HoaDonChiTiet>) request.getAttribute("list_hdct");
               ArrayList<HoaDonChiTiet> list_hdct = new ArrayList<>();
               list_hdct.add(new HoaDonChiTiet(1, 2, 3, 4));
            
      out.write("\n");
      out.write("            <div style=\"width: 10%; height: 20px; float: left; background-color: yellow\" >\n");
      out.write("                Hinh\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 50%; height: 20px; float: left\">\n");
      out.write("                Thong Tin San Pham\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 10%; height: 20px; float: left\">\n");
      out.write("                So Luong\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 10%; height: 20px; float: left\">\n");
      out.write("                Don gia\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 10%; height: 20px; float: left\">\n");
      out.write("                Tong\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 10%; height: 20px; float: right\">\n");
      out.write("                Xoa\n");
      out.write("            </div>\n");
      out.write("            ");
 for(int i=0; i<list_hdct.size(); i++) {
      out.write("\n");
      out.write("            <div style=\"width: 10%; height: 80px; float: left; background-color: yellowgreen\" >\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 50%; height: 80px; float: left\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 10%; height: 80px; float: left\">\n");
      out.write("                    so luong: ");
      out.print( list_hdct.get(i).getSoLuong() );
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 10%; height: 80px; float: left\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 10%; height: 80px; float: left\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 10%; height: 80px; float: right\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\t</div>\n");
      out.write("    <!--</form>-->\n");
      out.write("\t<div id=\"inform_sum\">\n");
      out.write("\t\t<h3 style=\"float: left; font-size: 32px; width: 20%; position: absolute; left: 30%;\" >Total: </h3>\n");
      out.write("\t\t<h3 style=\"float: left; font-size: 32px; position: absolute; left: 40%;\" >10000</h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"div_send\">\n");
      out.write("\t\t<form action=\"MainActivity\" method=\"POST\">\n");
      out.write("\t\t\t<input type=\"submit\" name=\"\" value=\"Gui Don Hang\" id=\"gui_don_hang\" style=\"font-size: 32px; width: 20%; height: 50px\"/>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"h4\"></div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//    var inputContainer = document.getElementById(\"inform_products\");\n");
      out.write("//    for (var i = 0; i < ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list_hdct.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("; i++) {    \n");
      out.write("//        var \n");
      out.write("//    }\n");
      out.write("</script>\n");
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
