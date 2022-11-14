import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConquistaTest {
    public ConquistaTest()
    {
    }
 
    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testgetNome (){
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        vermelho.setConquista("brilha", "Parabens! Você derrotou o primeiro BOSS.", 15);
        assertEquals("Vermelho",vermelho.getNome());
    }
    
    @Test
    public void testgetDescricao (){
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        vermelho.setConquista("brilha", "Parabens! Você derrotou o primeiro BOSS.", 15);
        assertEquals("tuts",vermelho.getDescricao());
    }

    @Test
    public void testgetProgressoAObter (){
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        vermelho.setConquista("brilha", "Parabens! Você derrotou o primeiro BOSS.", 15);
        assertEquals(15, vermelho.getProgressoAObter());
    }

    @Test
    public void isObtida (){
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        vermelho.setConquista("brilha", "Parabens! Você derrotou o primeiro BOSS.", 15);
        assertEquals(false,vermelho.isObtida());
    }

}
