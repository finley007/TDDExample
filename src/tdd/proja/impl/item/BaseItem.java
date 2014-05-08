package tdd.proja.impl.item;

import tdd.proja.impl.tax.FreeTaxCaculator;
import tdd.proja.inface.IItem;
import tdd.proja.inface.ITaxCaculator;

public class BaseItem implements IItem {
	
	protected String itemName;
	
	protected Double price; 
	
	protected ITaxCaculator taxCaculator;
	
	public BaseItem(String name,Double price){
		this.itemName = name;
		this.price = price;
		this.taxCaculator = new FreeTaxCaculator();
	}

	@Override
	public Double calculateTax() {
		// TODO Auto-generated method stub
		return this.taxCaculator.calculateTax(this);	
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.itemName;
	}

	@Override
	public Double getBilling() {
		// TODO Auto-generated method stub
		return this.getPrice() + this.calculateTax();
	}

}
