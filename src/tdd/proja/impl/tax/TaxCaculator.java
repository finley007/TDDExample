package tdd.proja.impl.tax;

import tdd.proja.impl.util.CommonUtils;
import tdd.proja.inface.IItem;
import tdd.proja.inface.ITaxCaculator;

/**
 * @author finley
 *	所有需要计算税费的类都可以继承此类，重写calculate方法
 *	采用装饰器模式，隔离各种独立计算的税费，如果不是独立的则需要写一个专门的类
 *	对于不同种类商品使用不同税率和阶梯税率也通过重写calculate方法来实现
 */
public class TaxCaculator implements ITaxCaculator {
	
	private static final Double taxRate = 0.1;
	
	private ITaxCaculator parent;
	
	public TaxCaculator(){
		
	}

	public TaxCaculator(ITaxCaculator parent){
		this.parent = parent;
	}
	
	@Override
	public Double calculateTax(IItem item) {
		// TODO Auto-generated method stub
		if(this.parent != null){
			return this.parent.calculateTax(item) + this.calculate(item);
		}else
			return this.calculate(item);
	}
	
	protected Double calculate(IItem item){
		return CommonUtils.round(item.getPrice() * getTaxRate());
	}
	
	protected Double getTaxRate(){
		return taxRate;
	}

}
