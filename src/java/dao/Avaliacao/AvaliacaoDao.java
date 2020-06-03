/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Avaliacao;

import dao.Usuario.UsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Avaliacao;
import modelo.Usuario;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class AvaliacaoDao implements IAvaliacaoDao{
    
    private static final String SELECT_ALL = "SELECT * FROM avaliacao where sugestao ilike ? order by id desc"; // Listar
    private static final String INSERT = "INSERT INTO avaliacao(sugestao, nivel_satisfacao,cliente) values(?,?,?);"; // Cadastrar
    private static final String BUSCAR = "SELECT * FROM avaliacao WHERE id=?;"; // Buscar
    
    private Object pstmt;
    private Connection conexao;
    
    @Override
    public ArrayList<Avaliacao> listar(Avaliacao avaliacao) {

        ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<Avaliacao>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            
            pstmt.setString(1,"%" + avaliacao.getSugestao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                //a cada loop
                Avaliacao novaAvaliacao = new Avaliacao();
                novaAvaliacao.setId(rs.getInt("id"));
                novaAvaliacao.setSugestao(rs.getString("sugestao"));
                novaAvaliacao.setNivel_satisfacao(rs.getInt("nivel_satisfacao"));
                
                Usuario objuser = new Usuario();
                objuser.setId(rs.getInt("cliente"));
                UsuarioDao objdao = new UsuarioDao();
                objdao.buscar(objuser);
                
                novaAvaliacao.setUsuario(objuser);
                //add na lista
                listaAvaliacoes.add(novaAvaliacao);
            }
            return listaAvaliacoes;

        } catch (Exception ex) {
            
            return listaAvaliacoes;

        } finally {
                       
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void buscar(Avaliacao avaliacao) {
            try {
            //Conexao
            conexao = ConectaBanco.getConexao();
            //cria comando SQL
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);

            pstmt.setInt(1, avaliacao.getId());
            //executa
            ResultSet rs = pstmt.executeQuery();

            // como a query ira retornar somente um registro, faremos o NEXT
            rs.next();

            avaliacao.setSugestao(rs.getString("sugestao"));
            avaliacao.setNivel_satisfacao(rs.getInt("nivel_satisfacao"));
            
            
        } catch (Exception e) {

            //
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean cadastrar(Avaliacao avaliacao) {
        
        try {

            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(INSERT);

            pstmt.setString(1, avaliacao.getSugestao());
            pstmt.setInt(2, avaliacao.getNivel_satisfacao());
            pstmt.setInt(3, avaliacao.getUsuario().getId());

            pstmt.execute();
            
            return true;

        } catch (Exception ex) {

            return false;
            
        } finally {
            
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
