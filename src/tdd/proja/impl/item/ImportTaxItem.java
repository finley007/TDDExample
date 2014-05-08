package tdd.proja.impl.item;

import tdd.proja.impl.tax.FreeTaxCaculator;
import tdd.proja.impl.tax.ImportTaxCaculator;
import tdd.proja.inface.ITaxCaculator;

public class ImportTaxItem extends TaxItem {

	public ImportTaxItem(String name,Double price){
		super(name,price);
		ITaxCaculator newTaxCaculator = new ImportTaxCaculator(this.taxCaculator);
		this.taxCaculator = newTaxCaculator;
	}
}
