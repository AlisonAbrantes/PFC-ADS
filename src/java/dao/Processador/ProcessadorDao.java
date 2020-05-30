/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Processador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Componente;
import modelo.Processador;
import util.ConectaBanco;

/**
 *
 * @author vinicius
 */
public class ProcessadorDao implements IProcessadorDao{
    private static final String SELECT_ALL = "SELECT * FROM componente where tipocomponente = ?;";
    private static final String BUSCAR = "SELECT descrição FROM componente WHERE id = ?;";

    private Object pstmt;
    private Connection conexao;

    public ArrayList<Processador> listar(Processador objprocessador) {
        ArrayList<Processador> listaProcessador = new ArrayList<Processador>();

        try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_ALL);
            pstmt.setString(1, objprocessador.getDescricao());
            
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Processador objProcessador = new Processador();
                objProcessador.setId(rs.getInt("id"));
                objProcessador.setDescricao(rs.getString("descricao"));
                
                listaProcessador.add(objProcessador);
            }
            return listaProcessador;

        } catch (Exception ex) {
            return listaProcessador;
            
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProcessadorDao.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
        public void buscar(Componente objProcessador) {
         try {
            conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(BUSCAR);
            
            pstmt.setInt(1, objProcessador.getId());
            
            ResultSet rs = pstmt.executeQuery();

            rs.next();
            objProcessador.setDescricao(rs.getString("descricao"));
           
        } catch (Exception e) {

            //
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProcessadorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
