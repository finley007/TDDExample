package tdd.proja.impl.item;

import tdd.proja.impl.tax.TaxCaculator;
import tdd.proja.inface.ITaxCaculator;

public class TaxItem extends BaseItem {

	public TaxItem(String name,Double price){
		super(name,price);
		ITaxCaculator newTaxCaculator = new TaxCaculator(this.taxCaculator);
		this.taxCaculator = newTaxCaculator;
	}
}
