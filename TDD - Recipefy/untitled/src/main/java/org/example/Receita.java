package org.example;

import java.util.Objects;

public class Receita {
    private int id;
    private String nome;
    private String descricao;
    private boolean favorita;

    public Receita(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.favorita = false;
    }

    public int getId() {
        return id;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Descrição: " + descricao + ", Favorita: " + favorita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receita receita = (Receita) o;
        return id == receita.id &&
            Objects.equals(nome, receita.nome) &&
            Objects.equals(descricao, receita.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao);
    }

}
