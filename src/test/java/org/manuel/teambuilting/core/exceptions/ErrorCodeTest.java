package org.manuel.teambuilting.core.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author manuel.doncel.martos
 * @since 12-3-2017
 */
public class ErrorCodeTest {

	@Test
	public void testGetMessageOfIdNotFound() {
		final String expected = "Entity Player with id playerId not found";
		final String actual = ErrorCode.ID_NOT_FOUND.getMessage("Player", "playerId");
		assertEquals(actual, expected);
	}

}
