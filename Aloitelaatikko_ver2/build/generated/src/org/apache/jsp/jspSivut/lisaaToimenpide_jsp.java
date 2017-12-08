package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.Tietovarasto;

public final class lisaaToimenpide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Toimenpiteen Kirjaaminen</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\n");
      out.write("        <h1>Toimenpiteen Kirjaaminen</h1>\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");

            String aloiteID = request.getParameter("aloiteID");
            String aloitenimi = request.getParameter("aloitenimi");
            String aloitekuvaus = request.getParameter("aloitekuvaus");
        
      out.write("\n");
      out.write("        <p>");
      out.print(aloitenimi );
      out.write("</p><br>\n");
      out.write("        <p>Aloitteen kuvaus: ");
      out.print(aloitekuvaus);
      out.write("</p>\n");
      out.write("        <form name=\"lisays\" action=\"../../Aloitelaatikko_ver2/lisaaToimenpide\" method=\"post\">\n");
      out.write("            <textarea rows=\"10\" cols=\"40\" name=\"kuvaus\" placeholder=\"Toimenpiteen kuvaus\"></textarea><br>\n");
      out.write("            <input type=\"reset\" value=\"Tyhjennä\" name=\"reset\" >\n");
      out.write("            <input type=\"submit\" value=\"Talleta\" name=\"talleta\" >\n");
      out.write("            <input type=\"hidden\" name=\"aloiteID\" value='");
      out.print(aloiteID);
      out.write("'>\n");
      out.write("        </form>\n");
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
