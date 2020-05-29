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
public class Avaliacao {
    
    private int id;
    private String sugestao;
    private String opiniao;
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Avaliacao() {
    }

    public Avaliacao(int id, String sugestao, String opiniao, Usuario usuario) {
        this.id = id;
        this.sugestao = sugestao;
        this.opiniao = opiniao;
        this.usuario = usuario;
    }
    
    
    
    
}
