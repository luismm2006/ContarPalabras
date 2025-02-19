package testContarPalabra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contarPalabra.ContarPalabra;

class ContarPalabraObjtest {
	
	@Test
	public void esPalindromaTest() {
		ContarPalabra str = new ContarPalabra("Hola Mundo!");
		assertFalse(str.getEsPalindroma());
	}

}
