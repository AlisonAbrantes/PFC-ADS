<%-- 
    Document   : pag_adm.jsp
    Created on : 26/05/2020, 18:26:32
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../CSS/adm.css" rel="stylesheet" type="text/css"/>
    <link href="../Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <link href="../Bootstrap/bootstrap-4.4.1-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <title>Pagina Admin</title>
</head>
<body>
    <nav>
        <h1 class="titulo"> COINS</h1>
        <ul>
            <a href="perfil.jsp" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.jsp" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.jsp" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.jsp" class="btn-msg"> <li>Consultar mensagens</li></a>
            <a href="consultar_log.jsp" class="btn-log"> <li>Consultar Log</li></a>
            <a href="../Admin.jsp" class="btn-logout"><li> Sair</li></a>
        </ul>
    </nav>
    <div class="conteudo">

    </div>
    <script src="../JS/main.js" type="text/javascript"></script>
</body>
</html>