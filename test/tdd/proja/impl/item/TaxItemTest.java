package tdd.proja.impl.item;

import junit.framework.TestCase;

import org.junit.Before;

import tdd.proja.inface.IItem;

public class TaxItemTest extends TestCase{

	private IItem item = null;
	
	@Before
	public void setUp() throws Exception {
		item = new TaxItem("music CD",14.99d);
	}
	
	public void testCalculateTax() {
		assertEquals(1.5d,item.calculateTax());
	}

	public void testGetPrice() {
		assertEquals(14.99d,item.getPrice());
	}

	public void testGetName() {
		assertEquals("music CD",item.getName());
	}

	public void testGetBilling() {
		assertEquals(16.49d,item.getBilling());
	}

}
