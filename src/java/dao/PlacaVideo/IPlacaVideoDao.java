/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.PlacaVideo;

import java.util.ArrayList;
import modelo.Componente;
import modelo.PlacaVideo;

/**
 *
 * @author vinicius
 */
public interface IPlacaVideoDao {
    
    public ArrayList<PlacaVideo> listar(PlacaVideo objcat);
    public void buscar(Componente objVideo);
}
