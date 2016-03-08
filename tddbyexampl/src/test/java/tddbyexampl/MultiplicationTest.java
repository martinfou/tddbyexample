package tddbyexampl;

import static org.junit.Assert.*;
import tddbyexampl.Dollar;
import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10,five.amount);
	}

}
