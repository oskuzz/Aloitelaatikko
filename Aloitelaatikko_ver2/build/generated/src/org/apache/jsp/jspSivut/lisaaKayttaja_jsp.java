package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lisaaKayttaja_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                color: black;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div {\n");
      out.write("                max-width: 330px;\n");
      out.write("                padding: 5px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            .h1{\n");
      out.write("                position: relative;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.2), 0 10px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>Käyttäjän lisääminen</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"pictures/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <h1 class=\"h1\">Käyttäjän lisääminen</h1>\n");
      out.write("                <form class=\"form-signin\" name=\"lisays\" action=\"../../Aloitelaatikko_ver2/lisaaKayttaja\" method=\"post\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"etunimi\" placeholder=\"Etunimi\"><br>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"sukunimi\" placeholder=\"Sukunimmi\"><br>\n");
      out.write("                    <input class=\"form-control\" type=\"email\" name=\"email\" placeholder=\"Email\"><br>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"kayttajatunnus\" placeholder=\"Käyttäjätunnus\"><br>\n");
      out.write("                    <input class=\"form-control\" type=\"password\" name=\"salasana\" placeholder=\"Salasana\"><br>\n");
      out.write("                    <input class=\"form-control\"s type=\"text\" name=\"puhelin\" placeholder=\"Puhelin\"><br>\n");
      out.write("                    <select class=\"form-control\" name=\"ryhma\">\n");
      out.write("                        <option value=\"Kayttaja\">Käyttäjä</option>\n");
      out.write("                        <option value=\"Ohjausryhma\">Ohjausryhmä</option>\n");
      out.write("                        <option value=\"Yllapito\">Ylläpito</option>\n");
      out.write("                    </select><br>\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"reset\" value=\"Tyhjennä\" name=\"reset\" />\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\" value=\"Talleta\" name=\"talleta\" />            \n");
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
