package tdd.proja;

import java.util.Iterator;

import tdd.proja.impl.Receipt;
import tdd.proja.impl.item.BaseItem;
import tdd.proja.impl.item.ImportItem;
import tdd.proja.impl.item.ImportTaxItem;
import tdd.proja.impl.item.TaxItem;
import tdd.proja.inface.IItem;
import tdd.proja.inface.IReceipt;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INPUT:");
		IReceipt receipt1 = createInput1();
		IReceipt receipt3 = createInput3();
		
		System.out.println("OUTPUT:");
		printOutput(receipt1,1);
		printOutput(receipt3,3);
	}

	private static void printOutput(IReceipt receipt,int index) {
		System.out.println("output " + index + ":");
		Iterator<IItem> itor = receipt.iterator();
		for(;itor.hasNext();){
			IItem item = itor.next();
			System.out.println("1 " + item.getName() + ":" + item.getBilling());
		}
		System.out.println("Sales Taxed:" + receipt.calculateTotalTax());
		System.out.println("Total:" + receipt.calculateTotalBilling());
	}

	private static IReceipt createInput1() {
		System.out.println("input 1:");
		IReceipt receipt = new Receipt();
		receipt.addItem(new BaseItem("book",12.49d));
		receipt.addItem(new TaxItem("music CD",14.99d));
		receipt.addItem(new BaseItem("hocolate bar",0.85d));
		Iterator<IItem> itor = receipt.iterator();
		for(;itor.hasNext();){
			IItem item = itor.next();
			System.out.println("1 " + item.getName() + " at " + item.getPrice());
		}
		return receipt;
	}

	private static IReceipt createInput3() {
		System.out.println("input 3:");
		IReceipt receipt = new Receipt();
		receipt.addItem(new ImportTaxItem("imported bottle of perfume",27.99d));
		receipt.addItem(new TaxItem("bottle of perfume",18.99d));
		receipt.addItem(new BaseItem("packet of headache pills",9.75d));
		receipt.addItem(new ImportItem("imported box of chocolates",11.25d));
		Iterator<IItem> itor = receipt.iterator();
		for(;itor.hasNext();){
			IItem item = itor.next();
			System.out.println("1 " + item.getName() + " at " + item.getPrice());
		}
		return receipt;
	}
}
