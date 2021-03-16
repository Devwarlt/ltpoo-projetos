package br.projecao.exercicio02;

import java.util.Date;

public class Dependente {
    private String nome;
    private Date date;

    public Dependente() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
