package tdd.projb.impl;

import tdd.projb.Direct;
import tdd.projb.inface.IPosition;

public class Position implements IPosition {
	
	private int x = 0;
	private int y = 0;
	
	private Direct direct = Direct.N;
	
	public Position(){
	}
	
	public Position(IPosition position){
		this.x = position.getX();
		this.y = position.getY();
		this.direct = position.getDirect();
	}
	
	public Position(int x,int y,Direct direct){
		this.x = x;
		this.y = y;
		this.direct = direct;
	}

	@Override
	public Direct getDirect() {
		// TODO Auto-generated method stub
		return this.direct;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		switch(this.direct){
			case E:
				this.x = this.x + 1 > maxX ? maxX : this.x + 1;
				break;
			case W:
				this.x = this.x - 1 < 0 ? 0 : this.x - 1;
				break;
			case N:
				this.y = this.y + 1 > maxY ? maxY : this.y + 1;
				break;
			case S:
				this.y = this.y - 1 < 0 ? 0 : this.y - 1;
		}
	}
	
	@Override
	public void back() {
		// TODO Auto-generated method stub
		switch(this.direct){
			case E:
				this.x = this.x - 1 < 0 ? 0 : this.x - 1;
				break;
			case W:
				this.x = this.x + 1 > maxX ? maxX : this.x + 1;
				break;
			case N:
				this.y = this.y - 1 < 0 ? 0 : this.y - 1;
				break;
			case S:
				this.y = this.y + 1 > maxY ? maxY : this.y + 1;
		}
	}

	@Override
	public void setDirect(Direct direct) {
		// TODO Auto-generated method stub
		this.direct = direct;
	}
	
	public boolean compare(IPosition position){
		return this.x == position.getX() 
					&& this.y == position.getY(); 
	}

}
