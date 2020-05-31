<%-- 
    Document   : usuario_produtos
    Created on : 31/05/2020, 15:05:29
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/pagina_usuario.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-grid.min.css">
    <title>Document</title>
</head>
<body>

    <nav>
        <h1 class="titulo"> COINS</h1>
        <ul>
            <a href="pagina_usuario.jsp"><li><img class="icon" src="../imagens/perfil_icon.png"> Perfil</li></a>
           <a href="#"> <li><img class="icon" src="../imagens/questionario_icon.png"> Iniciar questionario</li></a>
           <a href="usuario_produtos.jsp"> <li class="active"><img class="icon" src="../imagens/lista_icon.png">Produtos salvos</li></a>
            <a href="#"><li><img class="icon" src="../imagens/logout_icon.png"> Sair</li></a>
        </ul>
    </nav>
    <div class="conteudo">
            <section class="geral">
                <h1 class="pag-title"> Produtos</h1>
                <div class="row">
                    <div class="col-sm-12 col-md-12 offset-md-1">
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
                                <th>Excluir</th>
                            </tr>
                        </table>
                    </div>
                </div>

            </section>
     </div>
</body>
</html>