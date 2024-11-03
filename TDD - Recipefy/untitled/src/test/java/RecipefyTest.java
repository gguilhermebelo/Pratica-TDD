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

}