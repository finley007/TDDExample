package tdd.proja.impl.tax;

import tdd.proja.impl.util.CommonUtils;
import tdd.proja.inface.IItem;
import tdd.proja.inface.ITaxCaculator;

public class ImportTaxCaculator extends TaxCaculator {

	private static final Double taxRate = 0.05;
	
	public ImportTaxCaculator(){
		super();
	}

	public ImportTaxCaculator(ITaxCaculator parent){
		super(parent);
	}
	
	protected Double getTaxRate(){
		return taxRate;
	}
}
