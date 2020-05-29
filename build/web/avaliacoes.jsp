<%-- 
    Document   : avaliacoes
    Created on : 26/05/2020, 18:33:26
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<<<<<<< HEAD:build/web/avaliacoes.jsp
    <link rel="stylesheet" type="text/css" href="CSS/adm.css">
=======
    <link rel="stylesheet" type="text/css" href="../css/adm.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-grid.min.css">
>>>>>>> master:build/web/Admin/avaliacoes.jsp
    <title>Avaliações</title>
</head>
<body>
    <nav>
        <a href="pag_adm.html"> <h1 class="titulo"> COINS</h1> </a>
        <ul>
<<<<<<< HEAD:build/web/avaliacoes.jsp

            <a href="perfil.jsp" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.jsp" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.jsp" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.jsp" class="btn-msg"> <li>Consultar mensagens</li></a>
            <a href="consultar_log.jsp" class="btn-log"> <li>Consultar Log</li></a>
            <a href="Admin.jsp" class="btn-logout"><li> Sair</li></a>
            
=======
            <a href="perfil.html"><li class="btn-perfil">Perfil</li></a>
            <a href="manterProdutos.html"> <li class="btn-manter"> Manter produtos</li></a>
            <a href="avaliacoes.html"> <li class="btn-avl">Avaliações</li></a>
            <a href="consultar_mensagens.html"> <li class="btn-msg">Consultar mensagens</li></a>
            <a href="#"><li class="btn-logout"> Sair</li></a>
>>>>>>> master:build/web/Admin/avaliacoes.jsp
        </ul>
    </nav>
    <div class="conteudo">
        <section class="geral msg-avaliacao-tela">
            <h1  class="pag-title"> Avaliações</h1>
            <div class="row">
                <div class="box-msg-avaliacao">
                    <div class="col-sm-12 col-md-4 box-msg-avaliacao-header">
                        <p class="text-19"> User: Gabriel</p>
                        <p class="text-19 top-3"> Email: Gabriel@bersk.com</p>
                        <p class="text-19 top-3"> Avaliação: Péssimo</p>
                    </div>      
                    <div class="col-sm-12 col-md-7 offset-md-5 box-msg-avaliacao-body">
                        <h3> Título-Assunto</h3>
                        <span> Em todos estes anos nessa industria vital, essa é a segunda vez que isso acontece</span>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 col-md-12  box-msg-avaliacao-bot">
                            <button class="excluir-avl"> Excluir</button>
                        </div>

                    </div>
    
                </div>
            </div>
        </section>
    </div>
    <script src="../js/adm.js"></script>
</body>
</html>