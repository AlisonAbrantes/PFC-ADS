<%-- 
    Document   : manterProdutos
    Created on : 26/05/2020, 18:29:48
    Author     : Gabriel
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Categoria" %>
<%@page import="modelo.Produto" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="Bootstrap/boadm.cotstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <link href="CSS/estilo_adm.css" rel="stylesheet" type="text/css"/>
    <title>Produtos</title>
</head>
<body>
    <div class="overlay toggle-modal"> </div>
      <nav>
        <h1 class="titulo"> COINS</h1>
        <ul>
            <a href="perfil.jsp"><li class="btn-perfil">Perfil</li></a>
            <a href="adicionar_adm.jsp"><li class="btn-add-adm">Adicionar ADM</li></a>
            <a href="manterProdutos.jsp"> <li class="btn-manter active"> Manter produtos</li></a>
            <a href="avaliacoes.jsp"> <li class="btn-avl">Avaliações</li></a>
            <a href="consultar_mensagens.jsp"> <li class="btn-msg">Consultar mensagens</li></a>
            <a href="Admin.jsp"><li class="btn-logout"> Sair</li></a>
        </ul>
    </nav>
    <div class="modal" id="cadastro-produtos">
        <div class="modal-header">
            <button class="close-modal toggle-modal-cadastrar">X</button>
            <h1 class="title-modal"> Cadastrar produtos</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario-cadastro" action="<%= application.getContextPath()%>/ControleProduto" method="=POST">
                      <input type="hidden" name="acao"  id="acao" value="Cadastrar"/>
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="txtdescricao" placeholder="Nome do produto" class="field-form">
                        <select name="cmbcategoria" class="field-form">
                        <option value="0"> Selecione a categoria</option>
                        <c:forEach var="cat" items="${arrcategoria}">
                           <option value="${cat.id}">${cat.descricao}</option>                      
                       </c:forEach>
                        </select>
                        <select name="cmbplacamae" class="field-form">
                            <option values="0"> Selecione uma Placa Mae</option>
                         <c:forEach var="placa" items="${arrPlacas}">
                           <option value="${placa.id}">${placa.descricao}</option>                      
                       </c:forEach>
                        </select>
                        <select name="cmbprocessador" class="field-form">
                           <option> Selecione o Processador</option>
                        <c:forEach var="processador" items="${arrproc}">
                           <option value="${processador.id}">${processador.descricao}</option>                      
                        </c:forEach>
                        </select>
                        <select name="cmbplacavideo" class="field-form">
                            <option value="0"> Selecione a Placa de Video</option>
                        <c:forEach var="video" items="${arrVideo}">
                           <option value="${video.id}">${video.descricao}</option>                      
                        </c:forEach>>
                        </select>
                        <select name="cmbmemoriaram" class="field-form">
                            <option> Selecione a memória RAM</option>
                         <c:forEach var="ram" items="${arrRam}">
                           <option value="${ram.id}">${ram.descricao}</option>                      
                        </c:forEach>
                        </select>
                        <select name="cmbmemoria" class="field-form">
                            <option value="0"> Selecione a memória</option>
                        <c:forEach var="disco" items="${arrDisco}">
                           <option value="${disco.id}">${disco.descricao}</option>                      
                        </c:forEach>
                        </select>
                        <select name="cmbfonte" class="field-form">
                        <c:forEach var="fonte" items="${arrFonte}">
                           <option values="0"> Selecione Um tipo de Fonte</option>
                           <option value="${fonte.id}">${fonte.descricao}</option>                      
                        </c:forEach>
                        </select>
                        <input type="submit" name="salvar" value="Cadastrar" id="btncadastrar" class="field-form cadastrar">
                      </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="conteudo">
        <section class="geral manter-produtos">
            <h1 class="pag-title">Produtos</h1>
            <div class="row">
                <div class="col-sm-12 col-md-12">
            <input onchange="<%= application.getContextPath()%>/ControleProduto" type="submit" class="btn novo-prod toggle-modal-cadastrar" name="acao" value="Cadastrar" id="acao">
                    
                   <form  action="<%= application.getContextPath()%>/ControleProduto" method="=POST">
                        <input type="submit" name="acao" value="Listar" id="acao" class="btn listar">
                   </form>
                </div>
            </div>
             <table border="1px" class="tabela-produtos-componentes">
                        <tr>
                            <th class="coluna">#</th>
                            <th class="coluna">Descrição</th>
                            <th class="coluna">Categoria</th>
                        </tr>
                         <c:forEach var="Produto" items="${arrproduto}">
                        <tr>                     
                            <td class="coluna">${Produto.id}</td>
                            <td class="coluna">${Produto.descricao}</td>
                            <td class="coluna">${Produto.categoria.descricao}</td>
                            <td class="coluna td-center"><a class="buscar" href="<%= application.getContextPath()%>/ControleProduto?acao=Buscar&id=${Produto.id}">BUSCAR</a></td>
                        </tr>
                        </c:forEach>
                    </table>
        </section>
    </div>
    
    <script src="JS/main.js"></script>
    
</body>
</html>