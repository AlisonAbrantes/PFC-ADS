/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.componente;

import java.util.ArrayList;
import modelo.Componente;

/**
 *
 * @author Alison
 */
public interface IComponenteDao {
    public boolean cadastrar(ArrayList<Componente> arrcomp,int idproduto);
}
