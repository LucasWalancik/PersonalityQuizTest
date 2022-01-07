package com.revature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
	
	private static final Logger logger = LogManager.getLogger(Menu.class);
	

	static String[] questions = {
			"What type of ice cream do you like?",
			"What programming language do you like the most?",
			"How many monitors do you have?",
			"For how many hours a day do you work?"
			};
	
	static String[] answers = { 
			"1.Chocolate\n2.Vanilla\n3.Coffee\n4.Cookes And Cream",
			"1.Java\n2.Python\n3.C\n4.C++",
			"1.1\n2.2\n3.3\n4.0",
			"1.6h\n2.10h\n3.12\n4.0h" 
			};
 	
	
	
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
					//userInput.close();
					return answer;
				}
				else
				{
					throw new IncorrectAnswerException( "User entered number too large or too small" );
				}
			}
			catch( InputMismatchException e )
			{
				System.out.println( "Please enter a number" );
		        logger.error("User entered something that's not an int");
		        logger.error(e.getMessage());

			}
			catch( IncorrectAnswerException iae)
			{
				System.out.println( "Please enter number betweeen 1 and 4" );
				logger.error( "User entered a number greater than 4 or smaller than 1" );
			}
			catch( Exception e )
			{
				System.out.println( "Something bad happened " + e.getMessage());
		        logger.error("Something terrible happened!");
		        logger.error( e.getMessage() );

			}
			finally
			{
				userInput.nextLine();
			}
		}
	}
	
	public static int showPersonality( int score )
	{
		if( score < 8 )
		{
			System.out.println( "You are Doer" );
			return 1;
		}
		else if( score < 11)
		{
			System.out.println( "You are Performer");
			return 2;
		}
		else if( score < 14 )
		{
			System.out.println( "You are Champion");
			return 3;
		}
		else
		{
			System.out.println( "You are OverAchiever");
			return 4;
		}
	}
}

class IncorrectAnswerException extends Exception
{
	public IncorrectAnswerException( String errorMessage)
	{
		super(errorMessage);
	}
	
}
