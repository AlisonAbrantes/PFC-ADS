<%-- 
    Document   : Home
    Created on : 25/05/2020, 01:37:20
    Author     : Alison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> COINS </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <link href="https://fonts.googleapis.com/css?family=Modak&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="CSS/animate.css">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <a class="navbar-brand" href="#"><h2>COINS</h2></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="#slogan">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#servicos">Serviços</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#sobre">Sobre nós</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contato">Contato</a>
                    </li>
                    <li class="nav-item log">
                        <a class="nav-link btn btn-primary btnlogin" data-toggle="modal" data-target="#login">Login</a>
                    </li>
                    <li class="nav-item log">
                        <a class="nav-link btn btn-primary btncadastrar" data-toggle="modal" data-target="#cadastro">Cadastre-se</a>
                    </li>
                </ul>
            </div>
            <div class="log2">
                <ul>
                    <a class="nav-link btn btn-primary btnlogin" data-toggle="modal" data-target="#login"> <li> Login</li></a>
                    <a class="nav-link btn btn-primary btncadastrar" data-toggle="modal" data-target="#cadastro"> <li> Cadastre-se</li></a>
                </ul>
            </div>
        </nav>

        <!-- Modal de login-->
        <div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Login</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="<%= application.getContextPath()%>/ControleUsuario" method="POST">
                        <div class="modal-body">
                            <div class="cadastrarform">
                                <input type="hidden" name="acao"  id="acao" value="Login"/>
                                <div class="form-field" id="form-field-email">
                                    <input type="text" id="txtemail" name="txtemail"  placeholder="Email">
                                    <span></span>  
                                </div>
                                <div class="form-field" id="form-field-senha">
                                    <input type="password" id="txtsenha" name="txtsenha"  placeholder="senha">
                                    <span></span>  
                                </div>   
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="submit" id="btnlogar" onclick="ValidarCampos()" class="btn btn-primary" value="Entrar"></input>
                    </form>  
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Modal de cadastro -->
    <div class="modal fade" id="cadastro" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLongTitle">Cadastro</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form action="<%= application.getContextPath()%>/ControleUsuario" method="POST">
                    <div class="modal-body">
                        <div class="cadastrarform">
                            <div class="form-field" id="form-field-nome">
                                <input type="hidden" name="acao"  id="acao" value="Cadastrar"/>
                                <input type="text" id="txtnome" name="txtnome" placeholder="Nome" onchange="getNome()">
                            </div>
                            <div class="form-field" id="form-field-email">
                                <input type="text" id="txtemail" name="txtemail"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  placeholder="Email" onchange="getEmail()">
                            </div>
                            <div class="form-field" id="form-field-senha">
                                <input type="password" id="txtsenha" name="txtsenha" placeholder="senha" onchange="getSenha()">
                            </div>   
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="submit" id="btncad" name="btncad" onclick="ValidarCampos()" class="btn btn-primary" value="Cadastrar"></input>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                    </div>
                </form>  
            </div>
        </div>
    </div>

    <!-- Testando validação-->

 


    <!--Fim modal-->

    <div class="banner" id="slogan">
        <div class="efeito">

            <div class="slogan" data-anime="left">  
                <h2 class="animated forwards fadeInUp delay-1s"> O Melhor computador, seja para Trabalho, estudo ou 
                    games! </h2>
                <div class="texto animated forwards fadeInUp delay-2s">
                    <p> Aqui você irá descobrir qual é o melhor computador para o seu uso de um modo rápido e fácil.
                        Basta responder um pequeno questionário e o nosso sistema irá recomendar os melhores produtos para você! </p>
                </div>


            </div>          

        </div>
    </div>

    <!-- AQUI SERÁ A PARTE DOS SERVIÇOS, ONDE EXPLICAREMOS AS ETAPAS DO QUESTIONÁRIO, ETC-->

    <hr id="servicos" class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading margin">Dúvidas na hora de comprar seu computador? <br><span class="text-muted">Qual a máquina ideal para seu uso? </span></h2>
            <p class="lead">  Nosso sistema pode auxiliá-lo a escolher a melhor máquina para seu uso pessoal ou profissional. Através de um rápido questionário será possível identificar sua necessidade, recomendando as melhores opções de desempenho e custo beneficio que lhe atendam, seja para jogar, trabalhar ou estudar. </p>
        </div>
        <div class="col-md-5">
            <img class="serv1" src="imagens/pc.jpeg">
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7 order-md-2">
            <h2 class="featurette-heading">Por que usar o COINS? <span class="text-muted">Ele realmente me ajuda?</span></h2>
            <p class="lead">O COINS é um questionário rápido para auxiliar as pessoas que possuem dificuldades em escolher a melhor máquina
                para seu uso pessoal ou profissional. Aqui não há enrolação, o sistema irá recomendar os produtos tendo como base suas respostas.
                O processo é simples: identifique sua necessidade, expresse-a através do questionário e receba as melhores recomendações!
            </p>
        </div>
        <div class="col-md-5 order-md-1">
            <img class="serv2" src="imagens/equipe.jpeg">
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">Como funciona o questionário? <span class="text-muted">Quais as etapas?</span></h2>
            <p class="lead">O questionário é dividido em algumas fases. Primeiro precisamos saber em qual categoria seu produto se encaixa (Desktop ou Notebook).
                Depois você informará qual a finalidade do seu produto (Casual, trabalho, jogos). Após isso as perguntas se moldarão de acordo
                com as suas respostas, ou seja, o questionário irá afunilar sua necessidade levando em conta as respostas
                para que a busca dos produtos seja mais precisa.
            </p>
        </div>
        <div class="col-md-5">
            <img class="serv1" src="imagens/22.jpg">      </div>
    </div>

    <hr class="featurette-divider">

    <!-- /END THE FEATURETTES -->

</div>

<!--QUEM SOMOS --> 
<div class="qmsomos row featurette" id="sobre">
    <div class="col-md-7">
        <h2 class="featurette-heading qmsomosTitulo">Sobre o COINS:<span class="text-muted"> A ideia</span></h2>
        <p class="lead qmsomosTXT">   O COINS foi uma ideia que surgiu devida a dificuldade que as pessoas possuem em comprar seus computadores e respectivos acessórios.
            Pensando nisso, resolvemos desenvolver este projeto que auxilia aqueles que possuem pouco conhecimento sobre computadores. O intuito é
            ajudar e explicar para as pessoas o porque elas devem comprar aquele produto sem utilizar termos muito técnicos, de modo que fique 
            claro do porque aquela é a melhor opção. Pensamos que o melhor modo de se identificar a necessidade de alguém seria através de um
            questionário rápido que se moldasse de acordo com as respostas dadas para que a busca seja a mais precisa possível. Este é o COINS,
            um sistema que identifica sua necessidade e a atende da melhor maneira possível.
        </p>
    </div>
    <div class="col-md-5">
        <img class="qmsomosimg" src="imagens/idea.jpg">      </div>
</div>

<hr>


<!-- FORMULARIO PARA CONTATO -->


<div id="contato" class="contato">
    <div class="contato-content">
        <h2> Entre em contato</h2>
        <span>
            Tem alguma sugestão ou crítica para o COINS? Fique à vontade para deixar a sua opinião neste espaço.
        </span>
        <button class="wpp"> <img src="imagens/wpp.png"> (11) 4002-8922</button>
    </div>
    <div class="formulario">
        <form action="#" method="post">
            <div>
                <div class="lblform"><label> Nome: </label></div>
                <input type="text" name="nome" placeholder="Seu nome">
            </div>
            <div>
                <div class="lblform"><label> Email: </label></div>
                <input type="text" name="email" placeholder="exemplo@gmail.com">
            </div>
            <div>
                <div class="lblform"><label> Telefone: </label></div>
                <input type="text" name="telefone" placeholder="00 0000 0000">
            </div>
            <div>
                <div class="lblform"><label> Mensagem: </label></div>
                <textarea></textarea>
            </div>
            <div>
                <input class="btnenviar" type="submit" name="enviar" value="Enviar">
            </div>

        </form>
    </div>
</div>

<footer>
    <h4> © 2020 COINS </h4>
</footer>
</body>
</html>
