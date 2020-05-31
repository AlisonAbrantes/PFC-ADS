package dao.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import util.ConectaBanco;

public class UsuarioDao implements IUsuarioDao{
   private static final String LOGIN = "SELECT * FROM cliente WHERE email=? and senha=?;";
   private static final String INSERT = "INSERT INTO cliente (nome,email,senha) values(?,?,?);";
   private static final String UPDATE = "UPDATE cliente set nome=? , email=? , senha=? WHERE id=?";
   private static final String SELECT_ALL = "SELECT * FROM cliente where id=?;";
   private static final String BUSCAR = "SELECT * FROM cliente where id=?;";
  


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
    
    public boolean alterarSenha(Usuario user) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(UPDATE);

            pstmt.setString(1, user.getNome());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getSenha());
            pstmt.setInt(4, user.getId());
            
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

    public void buscar(Usuario objuser) {
         try {
            //Conexao
            conexao = ConectaBanco.getConexao();
            //cria comando SQL
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);

            pstmt.setInt(1, objuser.getId());
            ResultSet rs = pstmt.executeQuery();

            rs.next();

            objuser.setId(rs.getInt("id"));
            objuser.setNome(rs.getString("nome"));
            objuser.setEmail(rs.getString("email"));
            
        } catch (Exception e) {

            //
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
}
