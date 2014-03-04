package Test;

import junit.framework.TestCase;


public class TestVectorRealesGT2 extends TestCase {

	public void testVectorReales() {
		
		VectorReales v1 = new VectorReales(4);
		VectorReales v2 = new VectorReales(4);
	    System.out.println(v1);
	    System.out.println(v2);
		assertTrue(VectorReales.getNumVectores()== 2);
		assertTrue(v1.equals(v1));
		assertTrue(v1.equals(v2) == v2.equals(v1));
		assertTrue(v1.equals(null)==false);
		assertEquals(v1.sumar(v2),v2.sumar(v1));
		
		assertEquals(v1.angulo(v2),v2.angulo(v1));
		assertEquals(v1.distancia(v2),v2.distancia(v1));
		
		assertEquals(v1,v1.clone());
		
		assertTrue(v1.toString().equals(v1.clone().toString()));
		assertTrue(v1.restar(v2).norma()==v2.restar(v1).norma());
		
		
		//Vamos a utilizar otro tipo de constructor
		VectorReales v3 = new VectorReales (2.0,3.0,5.0,6.0);
		VectorReales v4 = new VectorReales (1.0,2.0,3.0,4.0);
		
		
		assertFalse(v3.equals(v4));
		assertEquals(v3.sumar(v4),new VectorReales(3.0,5.0,8.0,10.0));
		assertEquals(v3.restar(v4),new VectorReales(1.0,1.0,2.0,2.0));
		assertTrue(v3.productoEscalar(10).equals(new VectorReales(20.0,30.0,50.0,60.0)));
		

		//invertimos v4
		
		System.out.println("Vamos a invertir v4");
		System.out.println(v4);
		v4.invertir();
		System.out.println(v4);
		assertEquals(v4,new VectorReales(4.0,3.0,2.0,1.0));
	}
}