/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Fonte;

import java.util.ArrayList;
import modelo.Componente;
import modelo.Fonte;

/**
 *
 * @author vinicius
 */
public interface IFonteDao {
    
    public ArrayList<Fonte> listar(Fonte objcat);
    public void buscar(Componente objFonte);
}
