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
    private int nivel_satisfacao;
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

    public int getNivel_satisfacao() {
        return nivel_satisfacao;
    }

    public void setNivel_satisfacao(int nivel_satisfacao) {
        this.nivel_satisfacao = nivel_satisfacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Avaliacao() {
    }

    public Avaliacao(int id, String sugestao, int nivel_satisfacao, Usuario usuario) {
        this.id = id;
        this.sugestao = sugestao;
        this.nivel_satisfacao = nivel_satisfacao;
        this.usuario = usuario;
    }
}
