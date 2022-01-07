package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestingQuiz
{
	@Test
	public void testResults( )
	{
		int score = 4;
		int personality = Menu.showPersonality( score );
		assertEquals( score, 1  );
	}

}
