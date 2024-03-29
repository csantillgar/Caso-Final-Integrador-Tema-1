import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class VI_comunicadorinterplanetariotest {
    @Test
    public void testContarVocales() {
        assertEquals(3, VI_comunicadorinterplanetario.contarVocales("Hello World"));
    }
    @Test
    public void testInvertirMensaje() {
        assertEquals("dlroW olleH", VI_comunicadorinterplanetario.invertirMensaje("Hello World"));
    }
    @Test
    public void testEsPalindromo() {
        assertTrue(VI_comunicadorinterplanetario.esPalindromo("madam"));
        assertTrue(VI_comunicadorinterplanetario.esPalindromo("A man a plan a canal Panama"));
        assertFalse(VI_comunicadorinterplanetario.esPalindromo("hello"));
    }


}
