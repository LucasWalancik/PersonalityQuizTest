package com.revature;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static String[] questions = { "What type of ice cream do you like?", "What programming language do you like the most?", "How many monitors do you have?", "For how many hours a day do you work?"};
	static String[] answers = { "1.Chocolate\n2.Vanilla\n3.Coffee\n4.Cookes And Cream",
			"1.Java\n2.Python\n3.C\n4.C++",
			"1.1\n2.2\n3.3\n4.0",
			"1.6h\n2.10h\n3.12\n4.0h" };
 	
	public static void showMenu()
	{
		System.out.println( "You are about to begin your personality test!" );
	}
	
	public static void showQuestion( int whichQuestion )
	{
		System.out.println( "Question nr." + whichQuestion + " " + questions[whichQuestion] );
	}
	
	public static void showPossibleAnswers( int whichQuestion )
	{
		System.out.println( answers[ whichQuestion ] );
	}
	
	public static int chooseAnswer()
	{
		Scanner userInput = new Scanner( System.in );
		while( true )
		{
			try
			{
				int answer = userInput.nextInt();
				
				if( answer > 0 && answer < 5)
				{
					
					return answer;
				}
				else
				{
					throw new InputMismatchException();
				}
			}
			catch( InputMismatchException e )
			{
				System.out.println( "Please enter a number" );
				userInput.nextLine();
			}
			catch( Exception e )
			{
				System.out.println( "Something bad happened " + e.getMessage());
				userInput.nextLine();
			}
			finally
			{
				
			}
		}
	}
	
	public static void showPersonality( int score )
	{
		if( score < 8 )
		{
			System.out.println( "You are Doer" );
		}
		else if( score < 11)
		{
			System.out.println( "You are Performer");
		}
		else if( score < 14 )
		{
			System.out.println( "You are Champion");
		}
		else
		{
			System.out.println( "You are OverAchiever");
		}
	}
}
