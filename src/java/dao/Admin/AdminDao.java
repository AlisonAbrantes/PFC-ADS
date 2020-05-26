/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Admin;

import dao.Admin.IAdminDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrador;
import util.ConectaBanco;
import util.Md5;

/**
 *
 * @author Alison
 */
public class AdminDao implements IAdminDao{
    private static final String LOGIN = "SELECT * FROM administrador WHERE email=? and senha=?;";
   private static final String INSERT = "INSERT INTO administrador (nome,email,senha) values(?,?,?);";
   private static final String UPDATE = "UPDATE administrador set ?=? WHERE id=?";

    private Object pstmt;
    private Connection conexao;
   
    public void login(final Administrador adm) {
        try {
            conexao = ConectaBanco.getConexao();
            final PreparedStatement pstmt = conexao.prepareStatement(LOGIN);
            pstmt.setString(1, adm.getEmail());
            pstmt.setString(2, adm.getSenha());

            final ResultSet rs = pstmt.executeQuery();

            rs.next();

            adm.setId(rs.getInt("id"));
            adm.setEmail(rs.getString("email"));
            adm.setSenha(rs.getString("senha"));

        } catch (final Exception e) {

            adm.setId(0);
            adm.setEmail("");
            adm.setSenha("");

        } finally {

            try {
                conexao.close();
            } catch (final SQLException ex) {
                Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean Cadastrar(Administrador adm) {
        try {
            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(INSERT);

            pstmt.setString(1, adm.getNome());
            pstmt.setString(2, adm.getEmail());
            pstmt.setString(3, adm.getSenha());

            pstmt.execute();
            
            return true;
        } catch (Exception ex) {

            return false;
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
     public boolean alterar(Administrador adm) {
       
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(UPDATE);

            pstmt.setString(1, adm.getNome());
            pstmt.setString(2, adm.getEmail());
            pstmt.setString(3, adm.getSenha());
            pstmt.setInt(4, adm.getId());
            
            pstmt.execute();
            return true;

        } catch (Exception ex) {

            return false;

        } finally {

             try {
                 conexao.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
    }
}
