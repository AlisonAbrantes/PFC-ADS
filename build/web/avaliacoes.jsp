<%-- 
    Document   : avaliacoes
    Created on : 26/05/2020, 18:33:26
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Avaliacao" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<<<<<<< HEAD
<<<<<<< HEAD:web/avaliacoes.jsp
=======
>>>>>>> adf7b72d294ca91316b33b16d4d41ca5ad3f603a
    <link rel="stylesheet" type="text/css" href="CSS/adm.css">
    <link rel="stylesheet" type="text/css" href="../css/adm.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-grid.min.css">
<<<<<<< HEAD
>>>>>>> master:web/Admin/avaliacoes.jsp
=======
    <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
>>>>>>> adf7b72d294ca91316b33b16d4d41ca5ad3f603a
    <title>Avaliações</title>
</head>
<body >
    
    <nav>
        <a href="pag_adm.jsp"> <h1 class="titulo"> COINS</h1> </a>
        <ul>
<<<<<<< HEAD
<<<<<<< HEAD:web/avaliacoes.jsp

=======
>>>>>>> adf7b72d294ca91316b33b16d4d41ca5ad3f603a
            <a href="perfil.jsp" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.jsp" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.jsp" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.jsp" class="btn-msg"> <li>Consultar mensagens</li></a>
            <a href="consultar_log.jsp" class="btn-log"> <li>Consultar Log</li></a>
            <a href="Admin.jsp" class="btn-logout"><li> Sair</li></a>
<<<<<<< HEAD
            
=======
            <a href="perfil.html"><li class="btn-perfil">Perfil</li></a>
            <a href="manterProdutos.html"> <li class="btn-manter"> Manter produtos</li></a>
            <a href="avaliacoes.html"> <li class="btn-avl">Avaliações</li></a>
            <a href="consultar_mensagens.html"> <li class="btn-msg">Consultar mensagens</li></a>
            <a href="#"><li class="btn-logout"> Sair</li></a>
>>>>>>> master:web/Admin/avaliacoes.jsp
=======
>>>>>>> adf7b72d294ca91316b33b16d4d41ca5ad3f603a
        </ul>
    </nav>
     <form action="<%= application.getContextPath()%>/ControleAvaliacao" method="POST"> 
    <input type="hidden" name="acao" id="acao" value="Listar">
    <div class="conteudo">
        <section class="geral msg-avaliacao-tela">
            <h1  class="pag-title"> Avaliações</h1>
               <input type="submit" value="Listar" id="btnbuscar" name="btnbuscar"> 
                <c:forEach var="avaliacao" items="${arravaliacao}">
            <div class="row">
                <div class="box-msg-avaliacao">
                    <div class="col-sm-12 col-md-4 box-msg-avaliacao-header">
                        <p class="text-19"> User:${avaliacao.usuario.nome} </p>
                        <p class="text-19 top-3"> Email:${avaliacao.usuario.email} </p>
                        <p class="text-19 top-3"> Avaliação: ${avaliacao.nivel_satisfacao}</p>
                    </div>      
                    <div class="col-sm-12 col-md-7 offset-md-5 box-msg-avaliacao-body">
                        <h3> Avaliação</h3>
                        <span> ${avaliacao.sugestao}</span>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 col-md-12  box-msg-avaliacao-bot">
                            <button class="excluir-avl"> Excluir</button>
                        </div>

                    </div>
                </div>
                    </c:forEach>
            </div>
        </section>
    </div>
    </form> 
    <script src="JS/main.js" type="text/javascript"></script>
</body>
</html>