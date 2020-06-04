<%-- 
    Document   : adicionar_adm
    Created on : 04/06/2020, 13:23:12
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/estilo_adm.css" rel="stylesheet" type="text/css"/>
        <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
        <title>Adicionar ADM</title>
    </head> 
    <body>
        <nav>
            <h1 class="titulo"> COINS</h1>
            <ul>
                <a href="perfil.jsp"><li class="btn-perfil">Perfil</li></a>
                <a href="adicionar_adm.jsp"><li class="btn-add-adm active">Adicionar ADM</li></a>
                <a href="manterProdutos.jsp"> <li class="btn-manter"> Manter produtos</li></a>
                <a href="avaliacoes.jsp"> <li class="btn-avl">Avaliações</li></a>
                <a href="consultar_mensagens.jsp"> <li class="btn-msg">Consultar mensagens</li></a>
                <a href="Admin.jsp"><li class="btn-logout"> Sair</li></a>
            </ul>
        </nav>

        <div class="conteudo">
            <section class="geral">
                <h1 class="pag-title"> Cadastrar novo Administrador</h1>
                <div class="row">
                    <div class="col-sm-12">
                        <form class="formulario">

                            <div class="row">
                                <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                    <label for="nome" class="text-light lbl-form">Nome</label>
                                    <input type="nome" name="nome" id="nome" class="field"/>
                                </div>
                                <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                    <label for="email" class="text-light lbl-form"> Email </label>
                                    <input type="email" name="email" id="email" class="field"/>
                                </div>
                                <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                    <label for="senha" class="text-light lbl-form"> Senha </label>
                                    <input type="password" name="senha" id="senha" class="field"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                    <input type="submit" name="cadastrar" value="Cadastrar" class="btn-form-adm cadastrar-adm">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </section>
            <script src="JS/main.js" type="text/javascript"></script>
        </div>
    </body>
</html>