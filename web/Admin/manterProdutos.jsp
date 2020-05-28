<%-- 
    Document   : manterProdutos
    Created on : 26/05/2020, 18:29:48
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/adm.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-grid.min.css">

    <title>Produtos</title>
</head>
<body>
    <div class="overlay toggle-modal"> </div>
    <nav>
        <a href="pag_adm.html"> <h1 class="titulo"> COINS</h1> </a>
        <ul>
            <a href="perfil.html" class="btn-perfil"><li>Perfil</li></a>
           <a href="manterProdutos.html" class="btn-prod"> <li> Manter produtos</li></a>
           <a href="avaliacoes.html" class="btn-avl"> <li>Avaliações</li></a>
           <a href="consultar_mensagens.html" class="btn-msg"> <li>Consultar mensagens</li></a>
           <a href="consultar_log.html" class="btn-log"> <li>Consultar Log</li></a>
            <a href="#" class="btn-logout"><li> Sair</li></a>
        </ul>
    </nav>
    <div class="modal" id="cadastro-produtos">
        <div class="modal-header">
            <h1 class="title-modal"> Cadastrar produtos</h1>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12">
                    <form class="formulario-cadastro" action="#" method="=post">
                      <div class="col-sm-12 col-md-12">
                        <input type="text" name="descricao" placeholder="Nome do produto" class="field-form">
                        <select name="categoria" class="field-form">
                            <option> Selecione a categoria</option>
                            <option value="pc"> Desktop</option>
                            <option value="pc"> Notebook</option>
                        </select>
                        <select name="placamae" class="field-form">
                            <option> Selecione a Placa Mãe</option>
                            <option value="pl2"> placa mae 2</option>
                        </select>
                        <select name="processador" class="field-form">
                            <option> Selecione o processador</option>
                            <option value="i5"> I3</option>
                        </select>
                        <select name="memoriaram" class="field-form">
                            <option> Selecione a memória RAM</option>
                            <option value="ddr3"> x</option>
                        </select>
                        <select name="memoria" class="field-form">
                            <option> Selecione a memória</option>
                            <option value="hd"> HD</option>
                        </select>
                        <select name="fonte" class="field-form">
                            <option> Selecione a fonte</option>
                            <option value="a"> a</option>
                        </select>
                        <input type="submit" name="salvar" value="Cadastrar" class="field-form cadastrar">
                        <button class="toggle-modal-cadastrar field-form btn-cancelar"> Cancelar</button>
                      </div>

                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="modal" id="lista-produtos">
        <div class="modal-header">
            <h1 class="title-modal"> Lista de produtos</h1>
            <button class="close-modal toggle-modal-listar"> X</button>
        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-sm-12 col-md-12">
                    <table border="1px" class="tabela-produtos">
                        <tr>
                            <th>#</th>
                            <th>Descrição</th>
                            <th>Categoria</th>
                            <th>Placa mãe</th>
                            <th>Processador</th>
                            <th>Memória Ram</th>
                            <th>Memória</th>
                            <th>Fonte</th>
                            <th>Placa de vídeo</th>
                            <th>Alterar</th>
                            <th>Excluir</th>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

    </div>

    <div class="conteudo">
        <section class="geral">
            <h1 class="pag-title">Produtos</h1>
            <div class="row">
                <div class="col-sm-12 col-md-12">
                    <button class="btn novo-prod toggle-modal-cadastrar"> Novo produto</button>
                    <button class="btn list toggle-modal-listar"> Listar produtos</button>
                </div>
            </div>
        </section>
    </div>
    
    <script src="../js/main.js"></script>
</body>
</html>