<%-- 
    Document   : listar_produtos
    Created on : 01/06/2020, 23:35:48
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="modelo.Produto" %>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.PlacaMae" %>
<%@page import="modelo.Componente" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <link href="CSS/estilo_adm.css" rel="stylesheet" type="text/css"/>
    <title>Produtos</title>
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
   <% ArrayList<Produto> arrprod =  new ArrayList<Produto>();
            arrprod = (ArrayList<Produto>) request.getSession().getAttribute("arrproduto");
            for (Produto obj : arrprod)
            {
   %>
    <div class="conteudo">
        <section class="geral">
            <h1 class="pag-title">Lista de produtos com todos seus componentes</h1>
            <div class="row">
                <div class="col-sm-12 col-md-12">
                    <table border="1px" class="tabela-produtos-componentes">
                        <tr>
                            <th class="coluna">Placa Mãe</th>
                            <th class="coluna">Processador</th>
                            <th class="coluna">Placa de Video</th>
                            <th class="coluna">Memoria Ram</th>
                            <th class="coluna">Disco Rigido</th>
                            <th class="coluna">Fonte</th>
                            <th class="coluna">Excluir</th>
                        </tr>
                        
                        <tr>    
                            <td class="coluna" ><% obj.getDescricao(); %></td>
                            <c:forEach var="componentes" items="produto.componente">
                            <td class="coluna"><c:out value="${componentes.descricao}"></c:out></td>
                            </c:forEach>
                            <td class="coluna"><a href="listar_produtos.jsp">Excluir </a></td>                
                        </tr>
                        
                    </table>
                </div>
            </div>
        </section>
    </div>
         <%  
            }
         %>
    <script src="JS/main.js"></script>
    
</body>
</html>
