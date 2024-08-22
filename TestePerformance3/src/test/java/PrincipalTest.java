import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalTest {

    @Test
    public void retornarNumeroParTest() {
        int numero = 2;
        boolean esperado = true;
        boolean resultado = Principal.retornarNumeroPar(numero);
        Assertions.assertEquals(esperado, resultado);
    }
}
