package org.example;
import java.util.ArrayList;
import java.util.List;

public class Recipefy {
    private ArrayList<String> receitas = new ArrayList<>();
    private ArrayList<Receita> receitasObj = new ArrayList<>();

    private static final String MENSAGEM_RECEITA_ADICIONADA = "Receita adicionada com sucesso!";
    private static final String MENSAGEM_RECEITA_REMOVIDA = "Receita removida com sucesso!";
    private static final String MENSAGEM_RECEITA_EDITADA = "Receita editada com sucesso!";
    private static final String MENSAGEM_RECEITA_FAVORITADA = "Receita favoritada com sucesso!";
    private static final String MENSAGEM_RECEITA_NAO_ENCONTRADA = "Receita não encontrada.";
    private static final String MENSAGEM_RECEITA_INEXISTENTE = "Receita inexistente";

    private int proximoId = 1;

    public String adicionarReceita(String nome, String descricao) {
        Receita novaReceita = new Receita(proximoId++, nome, descricao);
        receitasObj.add(novaReceita);
        return MENSAGEM_RECEITA_ADICIONADA;
    }

    
    public String buscarReceita(int id) {
        for (Receita receita : receitasObj) {
            if (receita.getId() == id) {
                return receita.toString();
            }
        }

        return MENSAGEM_RECEITA_INEXISTENTE;
    }

    public String removerReceita(int id) {
        for (Receita receita : receitasObj) {
            if (receita.getId() == id) {
                receitasObj.remove(receita);
                return MENSAGEM_RECEITA_REMOVIDA;
            }
        }

        return "Receita com ID " + id + " não encontrada.";
    }
    
    public List<Receita> listarReceitas() {
        if (receitasObj.isEmpty()) {
            System.out.println("Nenhuma receita disponível no momento.");
            return new ArrayList<>();
        }
        return new ArrayList<>(receitasObj);
    }

    public String favoritarReceita(int id) {
        for (Receita receita : receitasObj) {
            if (receita.getId() == id) {
                receita.setFavorita(true);
                return MENSAGEM_RECEITA_FAVORITADA;
            }
        }
        return MENSAGEM_RECEITA_NAO_ENCONTRADA;
    }

    public String editarReceita(int id, String novoNome, String novaDescricao) {
        for (Receita receita : receitasObj) {
            if (receita.getId() == id) {
                receita.setNome(novoNome);
                receita.setDescricao(novaDescricao);
                return MENSAGEM_RECEITA_EDITADA;
            }
        }
        return MENSAGEM_RECEITA_NAO_ENCONTRADA;
    }
}
