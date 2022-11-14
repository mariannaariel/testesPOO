import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JogoTest {
    public JogoTest()
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
    public void testgetHorasJogadas (){
        Jogo verde = new Jogo("Verde", "ble", 40);
        verde.Jogar("40");
        assertEquals(40,verde.getHorasJogadas());

    }
    /*/
    @Test
    public void testgetConquistas(){
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        vermelho.setConquista("brilha", "Parabens! Você derrotou o primeiro BOSS.", 15);
        vermelho.setConquista("brilha estrelinha", "Parabens! Você chegou na metade do jogo.", 50);
        vermelho.Jogar("20");
        assertEquals("brilha","Parabens! Você derrotou o primeiro BOSS.",vermelho.getConquistas());

    }/*/
}
