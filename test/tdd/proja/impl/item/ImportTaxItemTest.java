package tdd.proja.impl.item;

import junit.framework.TestCase;

import org.junit.Before;

import tdd.proja.inface.IItem;

public class ImportTaxItemTest extends TestCase{

	private IItem item = null;
	
	@Before
	public void setUp() throws Exception {
		item = new ImportTaxItem("imported bottle of perfume",47.50d);
	}
	
	public void testCalculateTax() {
		assertEquals(7.15d,item.calculateTax());
	}

	public void testGetPrice() {
		assertEquals(47.50d,item.getPrice());
	}

	public void testGetName() {
		assertEquals("imported bottle of perfume",item.getName());
	}

	public void testGetBilling() {
		assertEquals(54.65d,item.getBilling());
	}

}
