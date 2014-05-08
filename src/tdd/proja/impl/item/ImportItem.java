package tdd.proja.impl.item;

import tdd.proja.impl.tax.ImportTaxCaculator;
import tdd.proja.inface.ITaxCaculator;

public class ImportItem extends BaseItem {

	public ImportItem(String name,Double price){
		super(name,price);
		ITaxCaculator newTaxCaculator = new ImportTaxCaculator(this.taxCaculator);
		this.taxCaculator = newTaxCaculator;
	}
}
