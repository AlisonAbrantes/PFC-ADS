<%-- 
    Document   : perfil
    Created on : 26/05/2020, 18:27:56
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="CSS/adm.css">
    <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <title>Perfil</title>
</head>
<body>
    <div class="overlay toggle-modal"> </div>
    <nav>
        <a href="pag_adm.html"> <h1 class="titulo"> COINS</h1> </a>
        <ul>
            <a href="perfil.jsp" class="btn-perfil"><li>Perfil</li></a>
            <a href="manterProdutos.jsp" class="btn-prod"> <li> Manter produtos</li></a>
            <a href="avaliacoes.jsp" class="btn-avl"> <li>Avaliações</li></a>
            <a href="consultar_mensagens.jsp" class="btn-msg"> <li>Consultar mensagens</li></a>
            <a href="consultar_log.jsp" class="btn-log"> <li>Consultar Log</li></a>
            <a href="Admin.jsp" class="btn-logout"><li> Sair</li></a>
        </ul>
    </nav>
    <div class="modal" id="alterar-perfil">
        <div class="modal-header">
            <h1 class="title-modal"> Alterar informações</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario" action="#" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="nome" placeholder="Novo nome" class="field-form">
                        <input type="text" name="nome" placeholder="Novo Email" class="field-form">
                        <input type="submit" name="salvar" value="Alterar" class="field-form cadastrar">
                        <button class="toggle-modal-alterarInfo field-form btn-cancelar"> Cancelar</button>
                      </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="modal" id="alterar-perfil-senha">
        <div class="modal-header">
            <h1 class="title-modal"> Alterar Senha</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario" action="#" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="senha" placeholder="Nova Senha" class="field-form">
                        <input type="submit" name="salvar" value="Alterar" class="field-form cadastrar">
                        <button class="toggle-modal-alterarSenha field-form btn-cancelar"> Cancelar</button>
                      </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="conteudo">
            <section class="geral">
                <h1 class="pag-title"> Perfil</h1>
                <div class="row">
                    <div class="col-sm-12">
                     <form class="formulario">
                         <div class="row">
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="nome" class="text-light lbl-form"> Nome</label>
                                 <input type="nome" name="nome" id="email" class="field" value="admin">
                             </div>
                             <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                                 <label for="email" class="text-light lbl-form"> Email</label>
                                 <input type="email" name="email" id="email" class="field" value="admin@outlook.com">
                             </div>
                         </div>
                     </form>
                     <div class="row">
                        <div class="col-sm-12 offset-sm-3 col-md-12 offset-md-3 mar-bot-2">
                            <button class="toggle-modal-alterarInfo btn-alterar"> Alterar informações</button>
                            <button class="toggle-modal-alterarSenha btn-alterar"> Alterar senha</button>
                        </div>
                    </div>
                    </div>
                </div>
            </section>
     </div>
    <script src="../js/main.js"></script>
</body>
</html>