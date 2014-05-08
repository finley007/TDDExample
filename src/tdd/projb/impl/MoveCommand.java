package tdd.projb.impl;

import tdd.projb.Rover;
import tdd.projb.RoverRecord;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public class MoveCommand implements ICommand {

	@Override
	public IPosition execute(Rover rover, RoverRecord record) {
		// TODO Auto-generated method stub
		IPosition result = new Position(rover.getPosition());
		result.move();
		if(record != null && record.checkCrash(result, rover)){
			System.out.println("Crash!!!!");
			return rover.getPosition();
		}
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
		result.back();
		if(record != null && record.checkCrash(result, rover)){
			System.out.println("Crash!!!!");
			return rover.getPosition();
		}
		return result;
	}
	
	public IPosition redo(Rover rover, RoverRecord record){
		IPosition result = new Position(rover.getPosition());
		result.move();
		if(record != null && record.checkCrash(result, rover)){
			System.out.println("Crash!!!!");
			return rover.getPosition();
		}
		return result;
	}
}
