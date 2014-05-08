package tdd.projb.impl;

import tdd.projb.Direct;
import tdd.projb.Rover;
import tdd.projb.RoverRecord;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public abstract class DirectCommand implements ICommand {

	@Override
	public boolean canRedo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IPosition execute(Rover rover, RoverRecord record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPosition redo(Rover rover, RoverRecord record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPosition undo(Rover rover, RoverRecord record) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected Direct turnLeft(Direct direct){
		switch(direct){
			case N:
				return Direct.W;
			case W:
				return Direct.S; 
			case S:
				return Direct.E; 
			default:
				return Direct.N; 
		}
	}
	
	protected Direct turnRight(Direct direct){
		switch(direct){
			case N:
				return Direct.E;
			case E:
				return Direct.S; 
			case S:
				return Direct.W; 
			default:
				return Direct.N; 
		}
	}

}
