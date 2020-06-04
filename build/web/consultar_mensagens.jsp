<%-- 
    Document   : consultar_mensagens
    Created on : 26/05/2020, 18:30:58
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Contato" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/estilo_adm.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="../css/bootstrap-grid.min.css">
        <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
        <title>Consultar Mensagens</title>
    </head>
    <body>
        <div class="overlay toggle-modal"> </div>
        <nav>
            <h1 class="titulo"> COINS</h1>
            <ul>
                <a href="perfil.jsp"><li class="btn-perfil">Perfil</li></a>
                <a href="adicionar_adm.jsp"><li class="btn-add-adm">Adicionar ADM</li></a>
                <a href="manterProdutos.jsp"> <li class="btn-manter"> Manter produtos</li></a>
                <a href="avaliacoes.jsp"> <li class="btn-avl">Avaliações</li></a>
                <a href="consultar_mensagens.jsp"> <li class="btn-msg active">Consultar mensagens</li></a>
                <a href="Admin.jsp"><li class="btn-logout"> Sair</li></a>
            </ul>
        </nav>

        <div class="conteudo">
            <section class="geral msg-avaliacao-tela">
                <h1  class="pag-title"> Mensagens</h1>
                <form action="<%= application.getContextPath()%>/ControleContato" method="POST"> 
                    <input type="hidden" name="acao" id="acao" value="Listar">
                    <input type="submit" value="Listar" id="Listar" name="btnbuscar"  class="listar-msg-avl"> 
                </form> 
                <c:forEach var="contato" items="${arrcontato}">
                    <div class="row">
                        <div class="box-msg-avaliacao">
                            <div class="col-sm-12 col-md-4 box-msg-avaliacao-header">
                                <p class="text-19"> Nome: ${contato.nome}</p>
                                <p class="text-19 top-3"> Email: ${contato.email}</p>
                                <p class="text-19 top-3"> Telefone: ${contato.telefone}</p>
                            </div>  
                            <h3 class=""> Mensagem</h3>
                            <div class="col-sm-12 col-md-7 offset-md-4 box-msg-avaliacao-body">
                                <span>${contato.mensagem} </span>
                            </div>
                            <div class="row">
                                <div class="col-sm-12 col-md-12 offset-md-10">
                                    <form action="<%= application.getContextPath()%>/ControleContato?acao=Excluir" method="POST"> 
                                        <input name="id" id="id" type="hidden" value="${contato.id}">
                                        <input type="submit" name="Excluir" id="Excluir" value="X" class="excluir-msg">
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </section>

        </div>



        <script src="JS/main.js" type="text/javascript"></script>
    </body>
</html>