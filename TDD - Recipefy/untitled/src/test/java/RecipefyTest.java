import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.example.Recipefy;

import java.util.ArrayList;

public class RecipefyTest {

    @Test
    public void testeAdicionarReceita() {
        Recipefy receita = new Recipefy();
        assertEquals("Receita adicionada com sucesso!", receita.adicionarReceita("Brownie", "para fazermos o tantantan"));

    }

    @Test
    public void testeBuscarReceita() {
        Recipefy busca = new Recipefy();
        busca.adicionarReceita("Brownie", "para fazermos o tantantan");
        assertEquals("ID: 1, Nome: Brownie, Descrição: para fazermos o tantantan", busca.buscarReceita(1));
    }

    @Test
    public void testeRemoverReceita(){
        Recipefy remover = new Recipefy();
        remover.adicionarReceita("Brownie", "para fazermos o tantantan");
        assertEquals("Receita removida com sucesso!", remover.removerReceita(1));
    }
    @Test
    public void testeListarReceitas() {
        Recipefy listar = new Recipefy();
        listar.adicionarReceita("Brownie", "para fazermos o tantantan");

        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("ID: 1, Nome: Brownie, Descrição: para fazermos o tantantan");
        assertEquals(esperado, listar.listarReceitas());
    }

    @Test
    public void testeFavoritarReceita() {
        Recipefy recipefy = new Recipefy();
        recipefy.adicionarReceita("Brownie", "para fazermos o tantantan");

        assertEquals("Receita favoritada com sucesso!", recipefy.favoritarReceita(2));

        String receitaFavoritada = recipefy.buscarReceita(1);
        assertEquals("ID: 1, Nome: Brownie, Descrição: para fazermos o tantantan", receitaFavoritada);
    }

    @Test
    public void testeEditarReceita() {
        Recipefy recipefy = new Recipefy();
        recipefy.adicionarReceita("Brownie", "para fazermos o tantantan");

        // Edita a receita com ID 1 e verifica a mensagem de sucesso
        assertEquals("Receita editada com sucesso!", recipefy.editarReceita(2, "Brownie Especial", "Receita atualizada para o tantantan especial"));

        // Verifica se a receita realmente foi atualizada
        String receitaEditada = recipefy.buscarReceita(2);
        assertEquals("ID: 2, Nome: Brownie Especial, Descrição: Receita atualizada para o tantantan especial, Favorita: false", receitaEditada);
    }
}