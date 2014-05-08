package tdd.proja.impl;

import static org.junit.Assert.fail;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import tdd.proja.impl.item.BaseItem;
import tdd.proja.impl.item.TaxItem;
import tdd.proja.inface.IReceipt;

public class ReceiptTest extends TestCase{

	IReceipt receipt = null;
	
	@Before
	public void setUp() throws Exception {
		receipt = new Receipt();
		receipt.addItem(new BaseItem("book",12.49d));
		receipt.addItem(new TaxItem("music CD",14.99d));
		receipt.addItem(new BaseItem("chocolate bar",0.85d));
	}
	
	@Test
	public void testCalculateTotalBilling() {
//		assertEquals(29.83d,receipt.calculateTotalBilling());
	}

	@Test
	public void testCalculateTotalTax() {
		assertEquals(1.50d,receipt.calculateTotalTax());
	}

	@Test
	public void testGetItemNum() {
		assertEquals(3,receipt.getItemNum());
	}

}
