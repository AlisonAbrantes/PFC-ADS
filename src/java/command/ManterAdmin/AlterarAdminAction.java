/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.ManterAdmin;

import dao.Admin.AdminDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrador;
import util.Md5;

/**
 *
 * @author Alison
 */
public class AlterarAdminAction {
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Administrador adm = new Administrador();
 
        adm.setNome(request.getParameter("txtnome"));
        adm.setEmail(request.getParameter("txtemail"));
        adm.setSenha(Md5.senhamd5(request.getParameter("txtsenha")));

        adm.setId(Integer.parseInt(request.getParameter("id")));

        AdminDao admdao = new AdminDao();

        admdao.alterar(adm);

        return "/Admin/pag_adm.jsp";
    }
}
