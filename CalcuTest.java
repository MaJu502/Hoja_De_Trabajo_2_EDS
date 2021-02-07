import junit.framework.TestCase;

public class CalcuTest extends TestCase {
	
	private Calcu calculator;
	
	public void escenario() {
		calculator = new Calcu();
	}
	
	public void testdivision() {
		escenario();
        assertTrue(calculator.division(10,2)==5);
    }
	

	public void testmultiplicacion() {
		escenario();

		assertEquals(20, calculator.multiplicacion(10, 2));
	}
	
	
	public void testresta() {
		escenario();
        assertEquals(21, calculator.resta(28, 7));
    }
}
