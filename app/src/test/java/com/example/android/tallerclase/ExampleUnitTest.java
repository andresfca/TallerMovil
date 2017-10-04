package com.example.android.tallerclase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void zapatosNikeHombre(){
        assertEquals(120000,Metodos.calcular(0,0,0,1),0);
    }
    @Test
    public void zapatosAdidasHombre(){
        assertEquals(140000,Metodos.calcular(0,0,1,1),0);
    }
    @Test
    public void zapatosPumaHombre(){
        assertEquals(130000,Metodos.calcular(0,0,2,1),0);
    }
    @Test
    public void clasicosNikeHombre(){
        assertEquals(50000,Metodos.calcular(0,1,0,1),0);
    }
    @Test
    public void clasicosAdidasHombre(){
        assertEquals(80000,Metodos.calcular(0,1,1,1),0);
    }
    @Test
    public void clasicosPumaHombre(){
        assertEquals(100000,Metodos.calcular(0,1,2,1),0);
    }
    @Test
    public void zapatosNikeMujer(){
        assertEquals(100000,Metodos.calcular(1,0,0,1),0);
    }
    @Test
    public void zapatosAdidasMujer(){
        assertEquals(130000,Metodos.calcular(1,0,1,1),0);
    }
    @Test
    public void zapatosPumaMujer(){
        assertEquals(110000,Metodos.calcular(1,0,2,1),0);
    }
    @Test
    public void clasicosNikeMujer(){
        assertEquals(60000,Metodos.calcular(1,1,0,1),0);
    }
    @Test
    public void clasicosAdidasMujer(){
        assertEquals(70000,Metodos.calcular(1,1,1,1),0);
    }
    @Test
    public void clasicosPumaMujer(){
        assertEquals(120000,Metodos.calcular(1,1,2,1),0);
    }

}