<%-- 
    Document   : perfil
    Created on : 26/05/2020, 18:27:56
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <link href="../CSS/adm.css" rel="stylesheet" type="text/css"/>
    <title>Perfil</title>
</head>
<body>
    <nav>
        <a href="pag_adm.jsp"> <h1 class="titulo"> COINS</h1> </a>
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
            <section class="geral">
                <h1 class="pag-title"> Perfil</h1>
                <div class="row">
                    <div class="col-sm-12">
                     <form class="formulario">
                         <div class="row">
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="email" class="text-light lbl-form"> Email</label>
                                 <input type="email" name="email" id="email" class="field">
                             </div>
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="senha" class="text-light lbl-form"> Senha</label>
                                 <input type="password" name="senha" id="senha" class="field">
                             </div>
                         </div>
                         <div class="row">
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <button class="btn-salvar"> Salvar alterações</button>
                             </div>
                         </div>
                     </form>
                    </div>
                </div>
            </section>
     </div>
    <script src="../JS/main.js" type="text/javascript"></script>
</body>
</html>