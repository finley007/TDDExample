package tdd.projb;

import tdd.projb.impl.Position;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoverRecord roverRecord = new RoverRecord();
		Rover rover = new Rover("roverA",new Position(1,1,Direct.N));
		roverRecord.addRover(rover);
		System.out.println(rover.getName() + " start at (1,1) with N direct");
		rover.addCommand("MMRMUUUMDDUUD");
		rover.doCommand();
	}
	
	private static void testCase1(){
		RoverRecord roverRecord = new RoverRecord();
		Rover rover = new Rover("roverA",new Position(1,1,Direct.N));
		roverRecord.addRover(rover);
		System.out.println(rover.getName() + " start at (1,1) with N direct");
		rover.addCommand("MM");
		rover.doCommand();
		System.out.println("Final postion (" + rover.getX() + "," 
				+ rover.getY() + ")");
		rover = new Rover("roverB",new Position(3,3,Direct.N));
		roverRecord.addRover(rover);
		System.out.println(rover.getName() + " start at (3,3) with E direct");
		rover.addCommand("LMMLM");
		rover.doCommand();
		System.out.println("Final postion (" + rover.getX() + "," 
				+ rover.getY() + ")");
	}

}
