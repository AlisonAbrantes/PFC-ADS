package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Categoria;
import modelo.PlacaMae;
import modelo.Produto;

public final class manterProdutos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/adm.css\">\r\n");
      out.write("    <link href=\"Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <title>Produtos</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"overlay toggle-modal\"> </div>\r\n");
      out.write("   <nav>\r\n");
      out.write("        <a href=\"Admin/pag_adm.jsp\"> <h1 class=\"titulo\"> COINS</h1> </a>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"perfil.jsp\" class=\"btn-perfil\"><li>Perfil</li></a>\r\n");
      out.write("            <a href=\"manterProdutos.jsp\" class=\"btn-prod\"> <li> Manter produtos</li></a>\r\n");
      out.write("            <a href=\"avaliacoes.jsp\" class=\"btn-avl\"> <li>Avaliações</li></a>\r\n");
      out.write("            <a href=\"consultar_mensagens.jsp\" class=\"btn-msg\"> <li>Consultar mensagens</li></a>\r\n");
      out.write("            <a href=\"Admin.jsp\" class=\"btn-logout\"><li> Sair</li></a>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"modal\" id=\"cadastro-produtos\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("            <h1 class=\"title-modal\"> Cadastrar produtos</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-12\">\r\n");
      out.write("                    <form class=\"formulario-cadastro\" action=\"");
      out.print( application.getContextPath());
      out.write("/ControleProduto\" method=\"=POST\">\r\n");
      out.write("                      <input type=\"hidden\" name=\"acao\"  id=\"acao\" value=\"Cadastrar\"/>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-12\">\r\n");
      out.write("                        <input type=\"text\" name=\"txtdescricao\" placeholder=\"Nome do produto\" class=\"field-form\">\r\n");
      out.write("                        <select name=\"cmbcategoria\" class=\"field-form\">\r\n");
      out.write("                        <option value=\"0\"> Selecione a categoria</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"cmbplacamae\" class=\"field-form\">\r\n");
      out.write("                            <option values=\"0\"> Selecione uma Placa Mae</option>\r\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"cmbprocessador\" class=\"field-form\">\r\n");
      out.write("                           <option> Selecione o Processador</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"cmbplacavideo\" class=\"field-form\">\r\n");
      out.write("                            <option value=\"0\"> Selecione a Placa de Video</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write(">\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"cmbmemoriaram\" class=\"field-form\">\r\n");
      out.write("                            <option> Selecione a memória RAM</option>\r\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"cmbmemoria\" class=\"field-form\">\r\n");
      out.write("                            <option value=\"0\"> Selecione a memória</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"cmbfonte\" class=\"field-form\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <input type=\"submit\" name=\"salvar\" value=\"Cadastrar\" id=\"btncadastrar\" class=\"field-form cadastrar\">\r\n");
      out.write("                        <button class=\"toggle-modal-cadastrar field-form btn-cancelar\"> Cancelar</button>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal\" id=\"lista-produtos\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("            <h1 class=\"title-modal\"> Lista de produtos</h1>\r\n");
      out.write("            <button class=\"close-modal toggle-modal-listar\"> X</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-12 col-md-12\">\r\n");
      out.write("                    <table border=\"1px\" class=\"tabela-produtos\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>#</th>\r\n");
      out.write("                            <th>Descrição</th>\r\n");
      out.write("                            <th>Categoria</th>\r\n");
      out.write("                            <th>Placa mãe</th>\r\n");
      out.write("                            <th>Processador</th>\r\n");
      out.write("                            <th>Memória Ram</th>\r\n");
      out.write("                            <th>Memória</th>\r\n");
      out.write("                            <th>Fonte</th>\r\n");
      out.write("                            <th>Placa de vídeo</th>\r\n");
      out.write("                            <th>Alterar</th>\r\n");
      out.write("                            <th>Excluir</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"conteudo\">\r\n");
      out.write("        <section class=\"geral\">\r\n");
      out.write("            <h1 class=\"pag-title\">Produtos</h1>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-12 col-md-12\">\r\n");
      out.write("                    <button class=\"btn novo-prod toggle-modal-cadastrar\"> Novo produto</button>\r\n");
      out.write("                    <button class=\"btn list toggle-modal-listar\"> Listar produtos</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"JS/main.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("cat");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrcategoria}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                       ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("placa");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrPlacas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${placa.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${placa.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                       ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("processador");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrproc}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${processador.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${processador.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("video");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrVideo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${video.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${video.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("ram");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrRam}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ram.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ram.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setVar("disco");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrDisco}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disco.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disco.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setVar("fonte");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrFonte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                           <option values=\"0\"> Selecione Um tipo de Fonte</option>\r\n");
          out.write("                           <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fonte.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fonte.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                      \r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setVar("Produto");
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrproduto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Produto.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Produto.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Produto.categoria.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Produto.componente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td></td>\r\n");
          out.write("                            <td></td>\r\n");
          out.write("                            <td></td>\r\n");
          out.write("                            <td></td>\r\n");
          out.write("                            <td></td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }
}
