package tdd.proja.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tdd.proja.inface.IItem;
import tdd.proja.inface.IReceipt;

/**
 * @author finley
 * 一个订单的基类，如果以后需要添加折扣或者积分可以继承该类
 *
 */
public class Receipt implements IReceipt {
	
	private List<IItem> items = new ArrayList<IItem>();

	@Override
	public void addItem(IItem item) {
		// TODO Auto-generated method stub
		this.items.add(item);
	}

	@Override
	public Double calculateTotalBilling() {
		// TODO Auto-generated method stub
		Double result = 0d;
		if(this.items.size() > 0) { 
			for(IItem item : this.items){
				result += item.getBilling();
			}
		}
		return result;
	}

	@Override
	public Double calculateTotalTax() {
		// TODO Auto-generated method stub
		Double result = 0d;
		if(this.items.size() > 0) { 
			for(IItem item : this.items){
				result += item.calculateTax();
			}
		}
		return result;
	}

	@Override
	public int getItemNum() {
		// TODO Auto-generated method stub
		return this.items.size();
	}

	@Override
	public Iterator<IItem> iterator() {
		// TODO Auto-generated method stub
		return this.items.iterator();
	}

	@Override
	public void clearAll() {
		// TODO Auto-generated method stub
		this.items.clear();
	}

}
