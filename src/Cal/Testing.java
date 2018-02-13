package Cal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testing {
	CalculatorModel m;
	CalculatorView v;
	double output;
	boolean a=false;
	@Before
	public void setUp() throws Exception {
		m=new CalculatorModel();
		v= new CalculatorView();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDiv() {
		output=m.div(4,0, v);
		a=m.check_flag();
		assertEquals(true,a);
	}
	@Test
	public void testMod() {
		output=m.mod(4,0, v);
		a=m.check_flag();
		assertEquals(true,a);
	}
	@Test
	public void testSqrt() {
		output=m.squaroot(-4, v);
		a=m.check_flag();
		assertEquals(true,a);
	}
	

}
