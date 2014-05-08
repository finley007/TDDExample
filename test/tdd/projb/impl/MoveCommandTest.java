package tdd.projb.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.projb.Direct;
import tdd.projb.Rover;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public class MoveCommandTest {

	private ICommand command = new MoveCommand();
	
	@Test
	public void testExecute() {
		Rover rover = new Rover("A");
		IPosition position = command.execute(rover, null);
		assertEquals(0, position.getX());
		assertEquals(1, position.getY());
		rover.setPosition(position);
		position = new RightCommand().execute(rover, null);
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(1, position.getX());
		assertEquals(1, position.getY());
		rover.setPosition(position);
		position = new RightCommand().execute(rover, null);
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(1, position.getX());
		assertEquals(0, position.getY());
		rover.setPosition(position);
		position = new RightCommand().execute(rover, null);
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(0, position.getX());
		assertEquals(0, position.getY());
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(0, position.getX());
		assertEquals(0, position.getY());
	}

}
