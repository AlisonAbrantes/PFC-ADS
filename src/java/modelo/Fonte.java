/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vinicius
 */
public class Fonte extends Componente{

    private String pontencia;

    public String getPontencia() {
        return pontencia;
    }

    public void setPontencia(String pontencia) {
        this.pontencia = pontencia;
    }
    
    public Fonte() {
    }

    public Fonte(int id, String descricao, Peso peso) {
        super(id, descricao, peso);
    }
    
}
