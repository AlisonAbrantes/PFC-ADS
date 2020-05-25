/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import util.ConectaBanco;

/**
 *
 * @author Alison
 */
public class AdminDao implements IAdminDao{
    private static final String LOGIN = "SELECT * FROM cliente WHERE email=? and senha=?;";
   private static final String INSERT = "INSERT INTO cliente (nome,email,senha) values(?,?,?);";

    private Object pstmt;
    private Connection conexao;
   
    @Override
    public void login(final Usuario usuario) {

        try {
            conexao = ConectaBanco.getConexao();
            final PreparedStatement pstmt = conexao.prepareStatement(LOGIN);
            pstmt.setString(1, usuario.getEmail());
            pstmt.setString(2, usuario.getSenha());

            final ResultSet rs = pstmt.executeQuery();

            rs.next();

            usuario.setId(rs.getInt("id"));
            usuario.setEmail(rs.getString("email"));
            usuario.setSenha(rs.getString("senha"));

        } catch (final Exception e) {

            usuario.setId(0);
            usuario.setEmail("");
            usuario.setSenha("");

        } finally {

            try {
                conexao.close();
            } catch (final SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    public boolean Cadastrar(Usuario user) {
        try {
            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(INSERT);

            pstmt.setString(1, user.getNome());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getSenha());

            pstmt.execute();
            
            return true;
        } catch (Exception ex) {

            return false;
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
