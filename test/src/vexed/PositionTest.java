package vexed;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

	@Test
	public void testPositionsWithSameCoordsAreEqual() {
		assertEquals(new Position(1, 2), new Position(1, 2));
	}

	@Test
	public void testEqualPositionsHaveEqualHashCodes() {		
		Position position1 = new Position(1, 2);
		Position position2 = new Position(1, 2);
		assertEquals(position1, position2);
		assertEquals(position1.hashCode(), position2.hashCode());
	}
}
