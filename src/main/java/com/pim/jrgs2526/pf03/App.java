package com.pim.jrgs2526.pf03;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final String ERROR_AL_CALCULAR_LA_NOTA = "Error al calcular la nota";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int calcularNota(int nota) {
        if (nota >= 0 && nota <= 4)
            return -1;
        if (nota >= 5 && nota <= 10)
            return 1;
        throw new IllegalArgumentException(ERROR_AL_CALCULAR_LA_NOTA);
    }
}
