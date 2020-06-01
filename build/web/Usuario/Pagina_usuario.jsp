<%-- 
    Document   : Pagina_usuario
    Created on : 25/05/2020, 01:44:01
    Author     : Alison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="modelo.Contato" %>
<%@page import="modelo.Usuario" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../CSS/pagina_usuario.css" rel="stylesheet" type="text/css"/>
    <link href="../Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <title>Document</title>
</head>
<body>
    <div class="overlay toggle-modal"> </div>
    <nav>
        <h1 class="titulo"> COINS</h1>
        <ul>
            <a href="pagina_usuario.html"><li class="active"><img class="icon" src="../imagens/perfil_icon.png"> Perfil</li></a>
           <a href="#"> <li><img class="icon" src="../imagens/questionario_icon.png"> Iniciar questionario</li></a>
           <a href="usuario_produtos.html"> <li><img class="icon" src="../imagens/lista_icon.png">Produtos salvos</li></a>
            <a href="#"><li><img class="icon" src="../imagens/logout_icon.png"> Sair</li></a>
        </ul>
    </nav>
     <%  
        Usuario objUser = new Usuario();
        objUser= (Usuario)request.getSession().getAttribute("user");
    
    %>
    <div class="modal" id="alterar-perfil">
        <div class="modal-header">
            <h1 class="title-modal"> Alterar informações</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario" action="#" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="nome" placeholder="Novo nome" class="field-form">
                        <input type="text" name="nome" placeholder="Novo Email" class="field-form">
                        <input type="submit" name="salvar" value="Alterar" class="field-form cadastrar">
                        <button class="toggle-modal-alterarInfo field-form btn-cancelar"> Cancelar</button>
                      </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="modal" id="alterar-perfil-senha">
        <div class="modal-header">
            <h1 class="title-modal"> Alterar Senha</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario" action="#" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="senha" placeholder="Nova Senha" class="field-form">
                        <input type="submit" name="salvar" value="Alterar" class="field-form cadastrar">
                        <button class="toggle-modal-alterarSenha field-form btn-cancelar"> Cancelar</button>
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
                                 <label for="nome" class="text-light lbl-form"> Nome</label>
                                 <input type="nome" name="nome" readonly="true" id="email" class="field" value="<%= objUser.getNome()%>"/>
                             </div>
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="email" class="text-light lbl-form"> Email</label>
                                 <input type="email" name="email" readonly="true"  id="email" class="field" value="<%= objUser.getEmail()%>"/>
                             </div>
                         </div>
                     </form>
                     <div class="row">
                        <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                            <button class="toggle-modal-alterarInfo btn-alterar"> Alterar informações</button>
                            <button class="toggle-modal-alterarSenha btn-alterar"> Alterar senha</button>
                        </div>
                    </div>
                    </div>
                </div>
            </section>
     </div>
        <script src="../JS/main.js" type="text/javascript"></script>
</body>
</html>