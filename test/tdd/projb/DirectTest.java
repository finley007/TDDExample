package tdd.projb;

import org.junit.Assert;
import org.junit.Test;


public class DirectTest {

	@Test
	public void testEnum(){
		Assert.assertSame(Direct.E, Direct.valueOf("E"));
		Assert.assertSame(Direct.W, Direct.valueOf("W"));
		Assert.assertSame(Direct.S, Direct.valueOf("S"));
		Assert.assertSame(Direct.N, Direct.valueOf("N"));
	}
}
