/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.MemoriaRam;

import java.util.ArrayList;
import modelo.Componente;
import modelo.MemoriaRam;

/**
 *
 * @author vinicius
 */
public interface IMemoriaRamDao {
    
    public ArrayList<MemoriaRam> listar(MemoriaRam objcat);
    public void buscar(Componente objMemoria);
}
