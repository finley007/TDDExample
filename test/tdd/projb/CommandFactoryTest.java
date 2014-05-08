package tdd.projb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.projb.impl.LeftCommand;
import tdd.projb.impl.MoveCommand;
import tdd.projb.impl.RightCommand;

public class CommandFactoryTest {

	@Test
	public void testCreateCommand() {
		assertEquals(MoveCommand.class.getName(),
				CommandFactory.createCommand("M").getClass().getName());
		assertEquals(LeftCommand.class.getName(),
				CommandFactory.createCommand("L").getClass().getName());
		assertEquals(RightCommand.class.getName(),
				CommandFactory.createCommand("R").getClass().getName());
	}

}
