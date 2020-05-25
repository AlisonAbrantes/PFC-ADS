<%@page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela Principal do Sistema</title>
    </head>
    <body>
        <%
            Usuario usuario = new Usuario();
            usuario = (Usuario) session.getAttribute("usuario");
            %>
        <h1>Seja bem vindo(a) - <%= usuario.getEmail() %></h1>
        
        <h2>Menu</h2>
    </body>
</html>
