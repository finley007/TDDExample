package tdd.projb.inface;

import tdd.projb.Rover;
import tdd.projb.RoverRecord;

public interface ICommand {
	
	public static final String COMMAND_CODE_LEFT = "L";
	public static final String COMMAND_CODE_RIGHT = "R";
	public static final String COMMAND_CODE_MOVE = "M";
	public static final String COMMAND_CODE_UNDO = "U";
	public static final String COMMAND_CODE_REDO = "D";
	
	public IPosition execute(Rover rover, RoverRecord record);
	public boolean canUndo();
	public boolean canRedo();
	public IPosition undo(Rover rover, RoverRecord record);
	public IPosition redo(Rover rover, RoverRecord record);
}
