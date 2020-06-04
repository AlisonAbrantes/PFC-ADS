package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class questionario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link href=\"CSS/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/questionario.css\">\r\n");
      out.write("    <title>Questionario</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <section class=\"full-height principal\">\r\n");
      out.write("        <a href=\"pagina_usuario.jsp\"> \r\n");
      out.write("            <img class=\"btn-voltar\" title=\"voltar para a pagina inicial\" alt=\"retornar para a pagina inicial\" src=\"imagens/btn-voltar.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-12 col-md-8 offset-md-2\">\r\n");
      out.write("                    <h1 class=\"text-white mar-top-15 mar-bot-5 font-w-700\"> 1 - Qual a categoria de produto desejada? </h1>\r\n");
      out.write("                    <button id=\"op1\" class=\"text-white font-w-700 btn-resposta radius-4 notebook\" onclick=\"resp1Click()\"> Notebook </button>\r\n");
      out.write("                    <button id=\"op2\" class=\"text-white font-w-700 btn-resposta radius-4 pc\" onclick=\"resp2Click()\"> Desktop </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-12 col-md-8 offset-md-2\">\r\n");
      out.write("                    <button class=\"text-white font-w-700 avancar btn-control radius-4 float-right\" id=\"confirmar\"> Confirmar </button>\r\n");
      out.write("                    <button class=\"text-white font-w-700 cancelar btn-control radius-4 float-left\" id=\"cancelar\" onclick=\"cancelar()\"> Cancelar </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    <script src=\"JS/questionario.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
