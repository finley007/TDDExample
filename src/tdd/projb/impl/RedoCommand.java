package tdd.projb.impl;

import tdd.projb.Rover;
import tdd.projb.RoverRecord;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public class RedoCommand implements ICommand {

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

}
