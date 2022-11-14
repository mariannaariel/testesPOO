import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.jar.JarOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JogadorTest {
    public JogadorTest()
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
    public void testgetConquistas () throws Exception{
      final var jog = new Jogador();
      sut.setNome("arthur");
      Assertions.assertEquals("arthur",sut.setNome());
    }
}
