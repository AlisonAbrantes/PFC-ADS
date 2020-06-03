<%-- 
    Document   : Admin
    Created on : 25/05/2020, 20:48:09
    Author     : Alison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="CSS/loginAdm.css" rel="stylesheet" type="text/css"/>
    <link href="Bootstrap/bootstrap-4.4.1-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <title>Login ADM</title>
    </head>
    <body>
         <div class="box-login">
       <div class="formulario">
           <img src="imagens/icon-login.png" alt="Login" class="icon-login">
           <h1 class="title-login"> Login</h1>
           <form action="<%= application.getContextPath()%>/ControleAdmin" method="POST">
               <input type="hidden" name="acao"  id="acao" value="Login"/>
               <div class="field-email">
                    <input type="email" name="txtemail" id="txtemail" class="field campo" placeholder="Insira seu email">
               </div>
               <div class="field-senha">
                    <input type="password" name="txtsenha" id="txtsenha" class="field campo" placeholder="Insira sua senha">
               </div>
               <div class="field-btn">
                <input type="submit" name="enviar" id="enviar" class="field btn-logar" value="Enviar">
               </div>
 
           </form>
       </div>

   </div>
    </body>
</html>
