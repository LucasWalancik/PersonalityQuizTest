package com.revature;

public class Driver 
{
	public static void main( String[] args )
	{
		Menu.showMenu();
		int score = 0;
		for( int i = 0; i < Menu.questions.length; i++ )
		{
			Menu.showQuestion( i );
			Menu.showPossibleAnswers( i );
			score += Menu.chooseAnswer();
		}
		System.out.println( "Score: " + score );
		//Menu.chooseAnswer();
	}

}
