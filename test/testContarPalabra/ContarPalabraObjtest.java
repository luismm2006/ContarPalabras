package testContarPalabra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contarPalabra.ContarPalabra;

class ContarPalabraObjtest {
	
	@Test
    public void contarPalabrasTest() {
        ContarPalabra str = new ContarPalabra("Hola Mundo");
        assertEquals(2, str.getContarPalabras());
    }
    
    @Test
    public void contarLetrasDiferentesTest() {
        ContarPalabra str = new ContarPalabra("Hola Mundo");
        assertEquals(8, str.getContarLetrasDiferentes());
    }
    
    @Test
    public void contarFrecuenciaPalabrasTest() {
        ContarPalabra str = new ContarPalabra("Hola mundo hola");
        assertEquals(2, str.getContarFrecuenciaPalabras());
        assertEquals(1, str.getContarFrecuenciaPalabras());
    }
    
    @Test
    public void contarFrecuenciaLetrasTest() {
        ContarPalabra str = new ContarPalabra("Hola");
        assertEquals(1, str.getContarFrecuenciaLetras());
        assertEquals(2, str.getContarFrecuenciaLetras());
        assertEquals(1, str.getContarFrecuenciaLetras());
        assertEquals(1, str.getContarFrecuenciaLetras());
    }
	@Test
	public void esPalindromaTest() {
		ContarPalabra str = new ContarPalabra("Hola Mundo!");
		assertFalse(str.getEsPalindroma());
	}
	
}
