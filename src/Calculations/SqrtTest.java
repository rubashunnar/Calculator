package Calculations;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest {
	CalculatorModel m;
	CalculatorView v;

	@Before
	public void setUp() throws Exception {
		m=new CalculatorModel();
		v=new CalculatorView();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		double output= m.squaroot(-4, v);
		boolean a=m.check_flag();
		assertEquals(true,a);
	}


}
