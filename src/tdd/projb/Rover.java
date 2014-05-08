package tdd.projb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tdd.projb.impl.Position;
import tdd.projb.impl.RedoCommand;
import tdd.projb.impl.UndoCommand;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public class Rover {

	private RoverRecord record;
	
	private String name;
	
	private IPosition position;
	
	private List<ICommand> commandList = new LinkedList<ICommand>();
	
	/**
	 * 通过此队列实现undo和redo操作，undo和redo像是在这个队列上滑动，通过curCommand变量
	 */
	private List<ICommand> finishedCommandList = new ArrayList<ICommand>();
	
	private int curCommand = 0;
	
	private int commandCount = 0;
	
	public Rover(String name){
		this.name = name;
		this.position = new Position();
	}
	
	public Rover(String name,IPosition position){
		this.name = name;
		this.position = position;
	}
	
	public Rover(String name,int x,int y,Direct direct){
		this.name = name;
		this.position = new Position(x,y,direct);
	}
	
	public void addCommand(String command){
		String[] commands = command.split("");
		this.commandList.clear();
		for(int i = 0;i < commands.length;i++){
			ICommand commandIns = CommandFactory.createCommand(commands[i]);
			if(commandIns != null)
				this.commandList.add(commandIns);
		}
	}
	
	public void doCommand(){
		this.curCommand = 0;
		this.commandCount = 1;
		if(this.commandList != null && this.commandList.size() > 0){
			for(ICommand command : this.commandList){
				this.commandCount ++;
				if(command instanceof UndoCommand) {
					undoCommand(command);
				}else if(command instanceof RedoCommand) {
					redoCommand(command);
				}else{
					doCommand(command);
				}
			}
		}
	}

	private void doCommand(ICommand command) {
		System.out.println("No" + this.commandCount + " command:" + command.getClass().getName());
		this.position = command.execute(this, this.record);
		System.out.println("Position (" + this.position.getX() +
				"," + this.position.getY() + ")");
		solveFinishedList();
		this.finishedCommandList.add(command);
		this.curCommand = this.finishedCommandList.size() - 1;
	}

	private void redoCommand(ICommand command) {
		System.out.println("No" + this.commandCount + " command:" + command.getClass().getName());
		if(this.curCommand + 1 < this.finishedCommandList.size()){
			this.curCommand++;
			ICommand curCmd = this.finishedCommandList.get(this.curCommand);
			if(curCmd != null && curCmd.canRedo()) {
				this.position = curCmd.redo(this, record);
				System.out.println("Position (" + this.position.getX() +
						"," + this.position.getY() + ")");
			}
		}
	}

	private void undoCommand(ICommand command) {
		System.out.println("No" + this.commandCount + " command:" + command.getClass().getName());
		if(this.curCommand >= 0){
			ICommand curCmd = this.finishedCommandList.get(this.curCommand);
			if(curCmd != null && curCmd.canUndo()) {
				this.position = curCmd.undo(this, record);
				System.out.println("Position (" + this.position.getX() +
						"," + this.position.getY() + ")");
				if(this.curCommand > 0)
					this.curCommand--;
			}
		}
	}
	
	private void solveFinishedList(){
		for(int i = this.curCommand + 1; i < this.finishedCommandList.size(); i++){
			this.finishedCommandList.remove(this.curCommand + 1);
		}
	}
	
	public int getX(){
		return this.position.getX();
	}
	
	public int getY(){
		return this.position.getY();
	}

	public String getName() {
		return name;
	}

	public void setRecord(RoverRecord record) {
		this.record = record;
	}

	public IPosition getPosition() {
		return position;
	}

	public void setPosition(IPosition position) {
		this.position = position;
	}
}
