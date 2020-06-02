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
    <link rel="stylesheet" type="text/css" href="CSS/adm.css">
    <link rel="stylesheet" type="text/css" href="../css/adm.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-grid.min.css">
    <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <title>Consultar Mensagens</title>
</head>
<body>
    <div class="overlay toggle-modal"> </div>
    <nav>
        <h1 class="titulo"> COINS</h1>
        <ul>
            <a href="perfil.jsp" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.jsp" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.jsp" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.jsp" class="btn-msg"> <li>Consultar mensagens</li></a>
            <a href="Admin.jsp" class="btn-logout"><li> Sair</li></a>
        </ul>
    </nav>
    <div class="conteudo">
        <form action="<%= application.getContextPath()%>/ControleContato" method="POST"> 
        <section class="geral msg-avaliacao-tela">
            <h1  class="pag-title"> Mensagens</h1>
            <input type="hidden" name="acao" id="acao" value="Listar">
            <input type="submit" value="Listar" id="Listar" name="btnbuscar"> 
             <c:forEach var="contato" items="${arrcontato}">
            <div class="row">
                <div class="box-msg-avaliacao">
                    <div class="col-sm-12 col-md-4 box-msg-avaliacao-header">
                       
                        <p class="text-19"> Nome: ${contato.nome}</p>
                        <p class="text-19 top-3"> Email: ${contato.email}</p>
                        <p class="text-19 top-3"> Telefone: ${contato.telefone}</p>
                    </div>      
                    <div class="col-sm-12 col-md-7 offset-md-5 box-msg-avaliacao-body">
                        <h3> Mensagem</h3>
                        <span>${contato.mensagem} </span>
                    </div>
                </div>
            </div>
             </c:forEach>
        </section>
        </form>
    </div>
        

        
    <script src="JS/main.js" type="text/javascript"></script>
</body>
</html>