<%-- 
    Document   : perfil
    Created on : 26/05/2020, 18:27:56
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Administrador" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="CSS/estilo_adm.css" rel="stylesheet" type="text/css"/>
    <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <title>Perfil</title>
</head> 
<body>
    <%  
        Administrador objAdm = new Administrador();
        objAdm = (Administrador)request.getSession().getAttribute("adm");
    
    %>
    <div class="overlay toggle-modal"> </div>
        <nav>
            <h1 class="titulo"> COINS</h1>
            <ul>
                <a href="perfil.jsp"><li class="btn-perfil active">Perfil</li></a>
                <a href="adicionar_adm.jsp"><li class="btn-add-adm">Adicionar ADM</li></a>
                <a href="manterProdutos.jsp"> <li class="btn-manter"> Manter produtos</li></a>
                <a href="avaliacoes.jsp"> <li class="btn-avl">Avaliações</li></a>
                <a href="consultar_mensagens.jsp"> <li class="btn-msg ">Consultar mensagens</li></a>
                <a href="Admin.jsp"><li class="btn-logout"> Sair</li></a>
            </ul>
        </nav>
    
    <!-- MODAL DE ALTERAR !-->
    <div class="modal" id="alterar-perfil">
        <div class="modal-header">
            <button class="close-modal toggle-modal-alterarInfo">X</button>
            <h1 class="title-modal"> Alterar informações</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario" action="<%= application.getContextPath()%>/ControleAdmin" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="txtnome" placeholder="Novo nome" class="field-form">
                        <input type="text" name="txtemail" placeholder="Novo Email" class="field-form">
                        <input type="hidden" id="id" name="id" value="<%= objAdm.getId()%>">
                        <input type="submit" name="acao" id="acao" value="Alterar" class="field-form cadastrar">
                      </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
                        
    <div class="modal" id="alterar-perfil-senha">
        <div class="modal-header">
            <button class="close-modal toggle-modal-alterarSenha">X</button>
            <h1 class="title-modal"> Alterar Senha</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario" action="<%= application.getContextPath()%>/ControleAdmin" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="password" name="txtsenha" placeholder="Nova Senha" class="field-form">
                        <input type="hidden" id="id" name="id" value="<%= objAdm.getId()%>">
                        <input type="submit" name="acao" id="acao" value="AlterarSenha" class="field-form cadastrar">
                      </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
                      
    <div class="conteudo">
            <section class="geral">
                <h1 class="pag-title"> Perfil</h1>
                <div class="row">
                    <div class="col-sm-12">
                     <form class="formulario">
                         
                         <div class="row">
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="nome" class="text-light lbl-form">Nome</label>
                                 <input type="nome" readonly="true" name="nome" id="email" class="field" value="<%= objAdm.getNome()%>"/>
                             </div>
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="email" class="text-light lbl-form"> Email </label>
                                 <input type="email" readonly="true" name="email" id="email" class="field" value="<%= objAdm.getEmail()%>"/>
                             </div>
                         </div>
                     </form>
                     <div class="row">
                        <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                            <button class="toggle-modal-alterarInfo btn-form-adm cadastrar-adm"> Alterar informações</button>
                            <button class="toggle-modal-alterarSenha btn-form-adm cadastrar-adm"> Alterar senha</button>
                        </div>
                    </div>
                    </div>
                </div>
                       
            </section>
             <script src="JS/main.js" type="text/javascript"></script>
     </div>
</body>
</html>