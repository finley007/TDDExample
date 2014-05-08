package tdd.proja.impl.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommonUtilsTest {

	@Test
	public void testRound() {
		assertEquals(0d,CommonUtils.round(0d));
		assertEquals(1.2d,CommonUtils.round(1.2d));
		assertEquals(2.0d,CommonUtils.round(2.0d));
		assertEquals(1.20d,CommonUtils.round(1.20d));
		assertEquals(1.25d,CommonUtils.round(1.21d));
		assertEquals(1.25d,CommonUtils.round(1.25d));
		assertEquals(1.30d,CommonUtils.round(1.27d));
	}

}
