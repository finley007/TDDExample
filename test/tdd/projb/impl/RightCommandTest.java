package tdd.projb.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.projb.Direct;
import tdd.projb.Rover;
import tdd.projb.inface.ICommand;
import tdd.projb.inface.IPosition;

public class RightCommandTest {

	private ICommand command = new RightCommand();
	
	@Test
	public void testExecute() {
		Rover rover = new Rover("A");
		IPosition position = command.execute(rover, null);
		position = command.execute(rover, null);
		assertEquals(Direct.E, position.getDirect());
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(Direct.S, position.getDirect());
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(Direct.W, position.getDirect());
		rover.setPosition(position);
		position = command.execute(rover, null);
		assertEquals(Direct.N, position.getDirect());
	}

}
