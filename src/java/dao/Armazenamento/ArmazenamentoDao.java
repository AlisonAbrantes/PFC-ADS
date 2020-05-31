/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Armazenamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Armazenamento;
import modelo.Componente;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class ArmazenamentoDao {
    
    private static final String SELECT_ALL = "SELECT * FROM componente where descricao ilike ? and tipo = 4;";
    private static final String BUSCAR = "SELECT descricao FROM componente WHERE id = ?;";

    private Object pstmt;
    private Connection conexao;

    public ArrayList<Armazenamento> listar(Armazenamento objarmazenamento) {
        ArrayList<Armazenamento> listaArmazenamento = new ArrayList<Armazenamento>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, "%" + objarmazenamento.getDescricao() + "%");
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Armazenamento objArmazenamento = new Armazenamento();
                objArmazenamento.setId(rs.getInt("id"));
                objArmazenamento.setDescricao(rs.getString("descricao"));
                
                listaArmazenamento.add(objArmazenamento);
            }
            return listaArmazenamento;

        } catch (Exception ex) {
            return listaArmazenamento;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ArmazenamentoDao.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
        public void buscar(Componente objArmazenamento) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            
            pstmt.setInt(1, objArmazenamento.getId());
            
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            objArmazenamento.setDescricao(rs.getString("descricao"));
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ArmazenamentoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
