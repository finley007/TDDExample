package tdd.proja.impl.item;

import java.awt.event.ItemEvent;

import org.junit.Before;

import tdd.proja.inface.IItem;

import junit.framework.TestCase;

public class BaseItemTest extends TestCase {
	
	private IItem item = null;
	
	@Before
	public void setUp() throws Exception {
		item = new BaseItem("book",12.29d);
	}
	
	public void testCalculateTax() {
		assertEquals(0d,item.calculateTax());
	}

	public void testGetPrice() {
		assertEquals(12.29d,item.getPrice());
	}

	public void testGetName() {
		assertEquals("book",item.getName());
	}

	public void testGetBilling() {
		assertEquals(12.29d,item.getBilling());
	}

}
