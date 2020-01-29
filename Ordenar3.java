package Ordenación;

import org.junit.Test;

public class Ordenar3{

	@Test
	public void testOrdenacion() {
		int expectativa = 9;
		int n1 = 6;
		int n2 = 8;
		int n3 = 9;
		String ordenacion = Ordenacion.ordenacion(n1, n2, n3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion1() {
		int expectativa = 4;
		int n1 = 3;
		int n2 = 7;
		int n3 = 4;
		String ordenacion = Ordenacion.ordenacion(n1, n2, n3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion2() {
		int expectativa = 7;
		int n1 = 5;
		int n2 = 2;
		int n3 = 7;
		String ordenacion = Ordenacion.ordenacion(n1, n2, n3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion3() {
		int expectativa = 3;
		int n1 = 7;
		int n2 = 1;
		int n3 = 3;
		String ordenacion = Ordenacion.ordenacion(n1, n2, n3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion4() {
		int expectativa = 2;
		int n1 = 4;
		int n2 = 8;
		int n3 = 2;
		String ordenacion = Ordenacion.ordenacion(n1, n2, n3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion5() {
		int expectativa = 6;
		int n1 = 9;
		int n2 = 8;
		int n3 = 6;
		String ordenacion = Ordenacion.ordenacion(n1, n2, n3);
		
		equals(ordenacion);

	}
	
}
