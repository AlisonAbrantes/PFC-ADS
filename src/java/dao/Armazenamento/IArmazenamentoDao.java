/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Armazenamento;

import java.util.ArrayList;
import modelo.Armazenamento;
import modelo.Componente;

/**
 *
 * @author vinicius
 */
public interface IArmazenamentoDao {
    
     public ArrayList<Armazenamento> listar(Armazenamento objcat);
     public void buscar(Componente objArmazenamento);
}
