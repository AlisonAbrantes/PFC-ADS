/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Avaliacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Avaliacao;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class AvaliacaoDao implements IAvaliacaoDao{
    
    private static final String SELECT_ALL = "SELECT * FROM avaliacao where descricao ilike ?;"; // Listar
    private static final String INSERT = "INSERT INTO avaliacao(descricao) values(?);"; // Cadastrar
    private static final String BUSCAR = "SELECT * FROM avaliacao WHERE id=?;"; // Buscar
    
    private Object pstmt;
    private Connection conexao;
    
    @Override
    public ArrayList<Avaliacao> listar(Avaliacao avaliacao) {

        ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<Avaliacao>();

        try {

            //Conexao
            conexao = ConectaBanco.getConexao();
            //cria comando SQL
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            
            
            pstmt.setString(1, "%" + avaliacao.getOpiniao() + "%");
            pstmt.setString(2, "%" + avaliacao.getSugestao() + "%");
            pstmt.setString(3, "%" + avaliacao.getUsuario() + "%");
            
            //executa
            ResultSet rs = pstmt.executeQuery();
            
            

            while (rs.next()) {
                //a cada loop
                Avaliacao novaAvaliacao = new Avaliacao();
                novaAvaliacao.setId(rs.getInt("id"));
                novaAvaliacao.setOpiniao(rs.getString("opiniao"));
                novaAvaliacao.setSugestao(rs.getString("sugestao"));
                novaAvaliacao.setUsuario(rs.getUsuario("usuario"));

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

            avaliacao.setOpiniao(rs.getString("opiniao"));
            avaliacao.setSugestao(rs.getString("sugestao"));
            avaliacao.setUsuario(rs.getUsuario("usuario"));
            
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

            pstmt.setString(1, avaliacao.getOpiniao());

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
