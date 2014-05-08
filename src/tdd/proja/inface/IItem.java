package tdd.proja.inface;

public interface IItem {
	
	public String getName();			//获取商品的名字
	public Double getPrice();			//获取价格
	public Double getBilling();			//获取费用（含税）
	public Double calculateTax();		//获取税额

}
