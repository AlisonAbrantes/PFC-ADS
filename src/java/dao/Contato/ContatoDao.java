/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Avaliacao;
import modelo.Contato;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class ContatoDao implements IContatoDao{
        
    private static final String SELECT_ALL = "SELECT * FROM contato where mensagem ilike ? "; // Listar
    private static final String INSERT = "INSERT INTO contato(nome, email, telefone, mensagem) values(?,?,?);"; // Cadastrar
    private static final String BUSCAR = "SELECT * FROM contato WHERE id=?;"; // Buscar
    
    private Object pstmt;
    private Connection conexao;
    
    @Override
    public ArrayList<Contato> listar(Contato contato) {

        ArrayList<Contato> listaContatos = new ArrayList<Contato>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            
            pstmt.setString(1,"%" + contato.getMensagem() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                //a cada loop
                Contato novoContato = new Contato();
                novoContato.setId(rs.getInt("id"));
                novoContato.setNome(rs.getString("nome"));
                novoContato.setEmail(rs.getString("email"));
                novoContato.setTelefone(rs.getString("telefone"));
                novoContato.setMensagem(rs.getString("mensagem"));

                //add na lista
                listaContatos.add(novoContato);
            }
            return listaContatos;

        } catch (Exception ex) {
            
            return listaContatos;

        } finally {
                       
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void buscar(Contato contato) {
            try {
            //Conexao
            conexao = ConectaBanco.getConexao();
            //cria comando SQL
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);

            pstmt.setInt(1, contato.getId());
            //executa
            ResultSet rs = pstmt.executeQuery();

            // como a query ira retornar somente um registro, faremos o NEXT
            rs.next();

            contato.setNome(rs.getString("nome"));
            contato.setEmail(rs.getString("email"));
            contato.setTelefone(rs.getString("telefone"));
            contato.setMensagem(rs.getString("mensagem"));
            
        } catch (Exception e) {

            //
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean cadastrar(Contato contato) {
        
        try {

            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(INSERT);

            pstmt.setString(1, contato.getNome());
            pstmt.setString(2, contato.getEmail());
            pstmt.setString(3, contato.getTelefone());
            pstmt.setString(4, contato.getMensagem());

            pstmt.execute();
            
            return true;

        } catch (Exception ex) {

            return false;
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
