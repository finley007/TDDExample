package tdd.proja.inface;

import java.util.Iterator;

public interface IReceipt {
	
	public void addItem(IItem item);  	//添加Item
	public void clearAll();				//清楚所有的Item
	public int getItemNum();         	//获取Item的数量
	public Iterator<IItem> iterator();	//返回Item的迭代器
	public Double calculateTotalBilling();   //计算总的费用
	public Double calculateTotalTax();		//计算总的税额

}
