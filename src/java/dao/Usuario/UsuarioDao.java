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
    
    public ArrayList<Usuario> listar(Usuario user) {
        //cria uma array de obJ Usuario
        ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

        try {
            
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            
            pstmt.setString(1, user.getNome());
            pstmt.setString(2, user.getEmail());
            
            //executa
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                //a cada loop
                Usuario novoUsuario = new Usuario();
                novoUsuario.setId(rs.getInt("id"));
                novoUsuario.setNome(rs.getString("txtnome"));
                novoUsuario.setEmail(rs.getString("txtemail"));

                //add na lista
                listaUsuario.add(novoUsuario);
            }
            return listaUsuario;
        } catch (Exception ex) {
            
            return listaUsuario;

        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
 
}
