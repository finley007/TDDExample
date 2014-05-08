package tdd.projb.impl;

import tdd.projb.Direct;
import tdd.projb.Rover;
import tdd.projb.RoverRecord;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public class LeftCommand extends DirectCommand implements ICommand {

	@Override
	public IPosition execute(Rover rover, RoverRecord record) {
		// TODO Auto-generated method stub
		IPosition result = new Position(rover.getPosition());
		result.setDirect(turnLeft(result.getDirect()));
		return result;
	}
	
	public boolean canUndo(){
		return true;
	}
	
	public boolean canRedo(){
		return true;
	}
	
	public IPosition undo(Rover rover, RoverRecord record){
		IPosition result = new Position(rover.getPosition());
		result.setDirect(turnRight(result.getDirect()));
		return result;
	}
	
	public IPosition redo(Rover rover, RoverRecord record){
		IPosition result = new Position(rover.getPosition());
		result.setDirect(turnLeft(result.getDirect()));
		return result;
	}
	
}
