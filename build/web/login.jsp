<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Usuário</title>
    </head>
    <body>
        <h1>Tela de Login</h1>
        <form action="<%= application.getContextPath()%>/ControleUsuario">
           <input type="hidden" name="acao"  id="acao" value="Login"/>
            <div>
                <label>E-mail</label>
                <input type="text" name="txtemail" id="txtemail" />
            </div>
            <div>
                <label>Senha</label>
                <input type="password" name="txtsenha" id="txtsenha" />
            </div>
            <div>
                <input type="submit" name="btnlogar" id="btnlogar" value="Entrar" />
            </div>
        </form>
    </body>
</html>