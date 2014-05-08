package tdd.projb.inface;

import tdd.projb.Direct;

public interface IPosition {
	
	public static final int maxX = 5;
	public static final int maxY = 5;
	
	public void setDirect(Direct direct);
	public Direct getDirect();
	public void move(int x,int y);
	public void move();
	public void back();
	public int getX();
	public int getY();
	public boolean compare(IPosition position);

}
