package br.com.dbc.model;

import br.com.dbc.repository.Impressao;

public abstract class Usuario implements Impressao {
    private Integer idUsuario;
    private String nome;

    public Integer getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
