/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Processador;

import java.util.ArrayList;
import modelo.Componente;
import modelo.Processador;

/**
 *
 * @author vinicius
 */
public interface IProcessadorDao {
    
     public ArrayList<Processador> listar(Processador objcat);
     public void buscar(Componente objProcessador);
}
