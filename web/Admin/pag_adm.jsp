<%-- 
    Document   : pag_adm.jsp
    Created on : 26/05/2020, 18:26:32
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/adm.css">
    <title>Pagina Admin</title>
</head>
<body>
    <nav>
        <a href="pag_adm.html"> <h1 class="titulo"> COINS</h1> </a>
        <ul>
            <a href="perfil.html"><li class="btn-perfil">Perfil</li></a>
            <a href="manterProdutos.html"> <li class="btn-manter"> Manter produtos</li></a>
            <a href="avaliacoes.html"> <li class="btn-avl">Avaliações</li></a>
            <a href="consultar_mensagens.html"> <li class="btn-msg">Consultar mensagens</li></a>
            <a href="#"><li class="btn-logout"> Sair</li></a>
        </ul>
    </nav>
    <div class="conteudo">
        <img src="../imagens/adm.png" alt="administrador" class="icon-adm">
    </div>
    <script src="../js/adm.js"></script>
</body>
</html>
