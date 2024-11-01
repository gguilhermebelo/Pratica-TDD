package org.example;
import java.util.ArrayList;

public class Recipefy {
    private ArrayList<String> receitas = new ArrayList<>();

    private int proximoId = 1;

    public String adicionarReceita(String nome, String descricao) {
        String receita = "ID: " + proximoId++ + ", Nome: " + nome + ", Descrição: " + descricao;
        receitas.add(receita);
        return "Receita adicionada com sucesso!";
    }
    public String buscarReceita(int id) {
        String resultado = "ID: " + id + ",";

        for (String receita : receitas) {
            if (receita.startsWith(resultado)) {
                return receita;
            }
        }
        return "Receita inexistente";
    }
    public String removerReceita(int id) {
        String idReceita = "ID: " + id + ",";
        for (String receita : receitas) {
            if (receita.startsWith(idReceita)) {
                receitas.remove(receita);
                return "Receita removida com sucesso!";
            }
        }
        return "Receita com ID " + id + " não encontrada.";
    }
    public ArrayList<String> listarReceitas() {
        return new ArrayList<>(receitas);  // Retorna uma cópia para evitar alterações externas
    }
}