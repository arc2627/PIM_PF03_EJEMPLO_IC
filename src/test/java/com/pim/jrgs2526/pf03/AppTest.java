package com.pim.jrgs2526.pf03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testCalcularAprobado() {
        App main = new App();
        int resultado = main.calcularNota(6);
        Assertions.assertEquals(App.APROBADO, resultado);
    }

    @Test
    public void testCalcularSuspenso() {
        App main = new App();
        int resultado = main.calcularNota(2);
        Assertions.assertEquals(App.SUSPENSO, resultado);
    }

    @Test
    public void testCalcularError() {
        App main = new App();
        try {
            int resultado = main.calcularNota(63);
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals(App.ERROR_AL_CALCULAR_LA_NOTA, e.getMessage());
            return;
        }
        Assertions.fail();
    }
}
