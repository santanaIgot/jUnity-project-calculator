package br.com.fiap.calculadora.model;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
     Calculator calc = new Calculator();

     @Test
     public void testeSomar(){
         int resultado = calc.soma(5,3);
         assertEquals(resultado, 8);
     }
}