package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import util.ConectaBanco;

public class UsuarioDao implements IUsuarioDao{
   private static final String LOGIN = "SELECT * FROM cliente WHERE email=? and senha=?;";

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

 
}
