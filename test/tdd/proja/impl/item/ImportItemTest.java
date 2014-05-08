package tdd.proja.impl.item;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import tdd.proja.inface.IItem;

public class ImportItemTest extends TestCase{

	private IItem item = null;
	
	@Before
	public void setUp() throws Exception {
		item = new ImportItem("imported box of chocolates",10.00d);
	}
	
	public void testCalculateTax() {
		assertEquals(0.5d,item.calculateTax());
	}

	public void testGetPrice() {
		assertEquals(10.00d,item.getPrice());
	}

	public void testGetName() {
		assertEquals("imported box of chocolates",item.getName());
	}

	public void testGetBilling() {
		assertEquals(10.50d,item.getBilling());
	}

}
