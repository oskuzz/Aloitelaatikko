package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"dank_meme.jpg\");\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                background-color:rgba(0, 0, 0, 0.5);\n");
      out.write("                margin-left: 118px;\n");
      out.write("            }\n");
      out.write("            h1,h2{\n");
      out.write("                margin-left: 120px;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("                background-color:rgba(0, 0, 0, 0.2);\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                margin-left: 120px;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Test</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>HTTP-data</h2>\n");
      out.write("        <a href=\"../index.html\"> Palaa </a>\n");
      out.write("        <h2>HTTP-otsikkotiedot</h2>\n");
      out.write("        <table border=\"11\" cellpadding=\"5\" cellspacing=\"0\">\n");
      out.write("            ");

                Enumeration headers = request.getHeaderNames();
                while (headers.hasMoreElements()) {
                    String name = (String) headers.nextElement();
                    String value = request.getHeader(name);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( name);
      out.write("</td>\n");
      out.write("                <td>");
      out.print( value);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <h2>GET-parametrit</h2>\n");
      out.write("        <table border=\"11\" cellpadding=\"5\" cellspacing=\"0\">\n");
      out.write("            ");
 String luku1 = request.getParameter("luku1");
      out.write("\n");
      out.write("            ");
 String luku2 = request.getParameter("luku2");
      out.write("\n");
      out.write("            ");
 String submit = request.getParameter("submit");
      out.write("\n");
      out.write("            <tr><td>");
      out.print("Submit: " + submit);
      out.write("</td></tr>\n");
      out.write("            <tr><td>");
      out.print("Luku1: " + luku1);
      out.write("</td></tr>\n");
      out.write("            <tr><td>");
      out.print( "Luku2: " + luku2);
      out.write("</td></tr>\n");
      out.write("        </table>\n");
      out.write("        <h2>POST-parametrit</h2>\n");
      out.write("        ");

            String uName = request.getParameter("uName");
            String salasana = request.getParameter("salasana");

        
      out.write("\n");
      out.write("    </body>\n");
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
