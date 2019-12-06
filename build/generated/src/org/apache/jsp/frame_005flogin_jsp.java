package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frame_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Frame Login</title>\n");
      out.write("</head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style_login.css\">\n");
      out.write("<body>\n");
      out.write("<div id=\"h1\"></div>\n");
      out.write("<div id=\"div_login\">\n");
      out.write("    <form action=\"MainActivity\" method=\"POST\">\n");
      out.write("\t<div id=\"div_text\">\n");
      out.write("            <div id=\"div_username\">\n");
      out.write("                    <label id=\"label_username\">Username: </label>\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"username\" class=\"username\">\n");
      out.write("            </div>\n");
      out.write("            <div id=\"div_password\">\n");
      out.write("            <label id=\"label_password\">Password:</label>\n");
      out.write("            <input type=\"password\" name=\"password\" id=\"password\" class=\"password\">\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"div_event_btn\">\n");
      out.write("\t\t\n");
      out.write("            <div id=\"div_btn_login\">\n");
      out.write("                    <input type=\"submit\" name=\"act_login\" value=\"Login\" id=\"btn_login\">\n");
      out.write("            </div>\n");
      out.write("            <div id=\"div_btn_register\">\n");
      out.write("                    <input type=\"submit\" name=\"act_login\" value=\"Register\" id=\"btn_register\">\n");
      out.write("            </div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
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
