package tdd.projc.unit;

public class Unit {

	private int number;
	private String name;
	
	public Unit(int number,String name) throws Exception{
		this.number = number;
		if(this.number < 1 || this.number > 9)
			throw new Exception("The number should be in 1-9");
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
