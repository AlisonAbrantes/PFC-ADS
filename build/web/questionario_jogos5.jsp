<%-- 
    Document   : questionario
    Created on : 02/06/2020, 00:16:12
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="CSS/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="CSS/questionario.css">
    <title>Pergunta 2</title>
</head>
<body>
    <section class="full-height principal">
        <a href="pagina_usuario.jsp"> 
            <img class="btn-voltar" title="voltar para a pagina inicial" alt="retornar para a pagina inicial" src="imagens/btn-voltar.png">
        </a>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12 col-md-8 offset-md-2">
                    <h1 class="text-white mar-top-15 mar-bot-5 font-w-700"> 7 - Você deseja uma qualidade gráfica alta e sem queda de desempenho ? </h1>
                    <button id="op1" class="text-white font-w-700 btn-resposta radius-4" onclick="resp1Click()"> Sim </button>
                    <button id="op2" class="text-white font-w-700 btn-resposta radius-4" onclick="resp2Click()"> Não </button>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12 col-md-8 offset-md-2">
                    <button class="text-white font-w-700 avancar btn-control radius-4 float-right" id="confirmar" action="#"> Confirmar </button>
                    <button class="text-white font-w-700 cancelar btn-control radius-4 float-left" id="cancelar" onclick="cancelar()"> Cancelar </button>
                </div>
            </div>
        </div>

    </section>
    <script src="JS/controleResultados.js"></script>

</body>
</html>
