/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alison
 */
public class TipoComponente {
    private int id;
    private String descricao;

    public TipoComponente(int id) {
         this.id = id;
    }

    public TipoComponente(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public TipoComponente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
