package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.Tietovarasto;

public final class poistaAloite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"pictures/oceanBackground.jpg\");\n");
      out.write("                background-size: cover; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .table {\n");
      out.write("                background-color: white !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>Aloitteen poistaminen</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");

            String aloiteID = request.getParameter("aloiteID");
            String aloiteNimi = request.getParameter("aloitenimi");
            String aloiteKuvaus = request.getParameter("aloitekuvaus");
            String pvm = request.getParameter("pvm");
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Aloitteen poistaminen</h1>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped\" border=\"1\">\n");
      out.write("                    <thead class=\"thead-dark\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Nimi</th>\n");
      out.write("                            <th>Kuvaus</th>\n");
      out.write("                            <th>pvm</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( aloiteID);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(aloiteNimi);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( aloiteKuvaus);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( pvm);
      out.write("</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>        \n");
      out.write("                </table>\n");
      out.write("                <form name=\"lisays\" action=\"../../Aloitelaatikko_ver2/poistaAloite\" method=\"post\">\n");
      out.write("                    <input class=\"btn btn-danger\" type=\"submit\" name=\"submit\" value=\"Poista\">\n");
      out.write("                    <input type=\"hidden\" name=\"aloiteID\" value='");
      out.print(aloiteID);
      out.write("'>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
