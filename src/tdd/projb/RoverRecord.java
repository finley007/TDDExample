package tdd.projb;

import java.util.ArrayList;
import java.util.List;

import tdd.projb.inface.IPosition;

public class RoverRecord {

	private List<Rover> list = new ArrayList<Rover>();
	
	public void addRover(Rover rover){
		this.list.add(rover);
		rover.setRecord(this);
	}
	
	public boolean checkCrash(IPosition position,Rover rover){
		if(list.size() > 0){
			for(Rover rv : list){
				if(rv.getName().equals(rover.getName()))
					continue;
				else
					return position.compare(rv.getPosition());
			}
		}
		return false;
	}
}
