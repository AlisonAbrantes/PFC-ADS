package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/loginAdm.css\">\n");
      out.write("    <title>Login ADM</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"box-login\">\n");
      out.write("       <div class=\"formulario\">\n");
      out.write("           <img src=\"imagens/icon-login.png\" alt=\"Login\" class=\"icon-login\">\n");
      out.write("           <h1 class=\"title-login\"> Login</h1>\n");
      out.write("           <form action=\"#\" method=\"POST\">\n");
      out.write("               <div class=\"field-email\">\n");
      out.write("                    <input type=\"email\" name=\"email\" id=\"email\" class=\"field campo\" placeholder=\"Insira seu email\">\n");
      out.write("               </div>\n");
      out.write("               <div class=\"field-senha\">\n");
      out.write("                    <input type=\"password\" name=\"senha\" id=\"senha\" class=\"field campo\" placeholder=\"Insira sua senha\">\n");
      out.write("               </div>\n");
      out.write("               <div class=\"field-btn\">\n");
      out.write("                <input type=\"submit\" name=\"enviar\" id=\"enviar\" class=\"field btn-logar\" value=\"Enviar\">\n");
      out.write("               </div>\n");
      out.write(" \n");
      out.write("           </form>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("   </div>\n");
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
