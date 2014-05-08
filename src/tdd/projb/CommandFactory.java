package tdd.projb;

import tdd.projb.impl.LeftCommand;
import tdd.projb.impl.MoveCommand;
import tdd.projb.impl.RedoCommand;
import tdd.projb.impl.RightCommand;
import tdd.projb.impl.UndoCommand;
import tdd.projb.inface.ICommand;

public class CommandFactory {
	
	public static ICommand createCommand(String move){
		if(move.equals(ICommand.COMMAND_CODE_LEFT))
			return new LeftCommand();
		else if(move.equals(ICommand.COMMAND_CODE_RIGHT))
			return new RightCommand();
		else if(move.equals(ICommand.COMMAND_CODE_MOVE))
			return new MoveCommand();
		else if(move.equals(ICommand.COMMAND_CODE_UNDO))
			return new UndoCommand();
		else if(move.equals(ICommand.COMMAND_CODE_REDO))
			return new RedoCommand();
		else
			return null;
	}

}
