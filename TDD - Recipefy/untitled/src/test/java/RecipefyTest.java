import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.example.Recipefy;
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

}