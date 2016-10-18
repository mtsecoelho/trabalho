package br.com;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calculadora = new Calculadora();

	@Test
	public void testaSoma() {
		Assert.assertEquals(4, calculadora.soma(2, 2));
	}
	
	@Test
	public void testaSubtracao() {
		Assert.assertEquals(4, calculadora.subtracao(6, 2));
	}
	
	@Test
	public void testaMultiplicacao() {
		Assert.assertEquals(4, calculadora.multiplicacao(2, 2));
	}
	
	@Test
	public void testaDivisao() {
		Assert.assertEquals(1, calculadora.divisao(2, 2));
	}
}
