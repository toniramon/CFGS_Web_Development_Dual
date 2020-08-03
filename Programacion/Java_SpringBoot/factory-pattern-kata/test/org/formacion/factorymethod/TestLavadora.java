package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		
		// Lavadora lavadora = new LavadoraCargaFrontal();
		// lavadora.ponerMandos();
		// lavadora.ponerTambor();
		
		FactoriaLavadora factoria = new LavadoraCargaFrontalFactoria();
		assertNotNull(factoria);

		Lavadora lavadora = factoria.creaLavadora();
		assertNotNull(lavadora);

		assertEquals("frontal", lavadora.tipoCarga);
		// TestLavadora esta en el mismo paquete que Lavadora: propiedades protected
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		
		// Lavadora lavadora = new LavadoraCargaSuperior();
		// lavadora.ponerMandos();
		// lavadora.ponerTambor();

		FactoriaLavadora factoria = new LavadoraCargaSuperiorFactoria();
		assertNotNull(factoria);

		Lavadora lavadora = factoria.creaLavadora();
		assertNotNull(lavadora);
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
