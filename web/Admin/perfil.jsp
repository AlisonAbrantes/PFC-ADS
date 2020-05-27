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
<<<<<<< HEAD:web/Admin/perfil.jsp
    <link rel="stylesheet" type="text/css" href="../CSS/adm.css">
=======
    <link rel="stylesheet" type="text/css" href="css/adm.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css">
>>>>>>> 446009ba2db7ec6445a43111c3ab590669df9455:web/perfil.jsp
    <title>Perfil</title>
</head>
<body>
    <nav>
        <a href="pag_adm.html"> <h1 class="titulo"> COINS</h1> </a>
        <ul>
<<<<<<< HEAD:web/Admin/perfil.jsp
            <a href="perfil.jsp" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.jsp" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.jsp" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.jsp" class="btn"> <li>Consultar mensagens</li></a>
            <a href="consultar_log.jsp" class="btn"> <li>Consultar Log</li></a>
            <a href="Admin.jsp" class="btn"><li> Sair</li></a>
        </ul>
    </nav>
    <div class="conteudo">
        <section class="geral">
            <h1> Perfil</h1>
        </section>
    </div>
    <script src="../JS/adm.js"></script>
=======
            <a href="perfil.html" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.html" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.html" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.html" class="btn-msg"> <li>Consultar mensagens</li></a>
            <a href="consultar_log.html" class="btn-log"> <li>Consultar Log</li></a>
            <a href="#" class="btn-logout"><li> Sair</li></a>
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
    <script src="js/adm.js"></script>
>>>>>>> 446009ba2db7ec6445a43111c3ab590669df9455:web/perfil.jsp
</body>
</html>