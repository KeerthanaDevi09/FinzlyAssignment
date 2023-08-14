package Assignments;

import java.util.Scanner;
public class Tictactoe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[][] box=new char[3][3];
		
		for(int r=0;r<box.length;r++)
		{
			for(int c=0;c<box[r].length;c++)
			{
				box[r][c]= ' ';
			}
		}
		char player = 'x';
		boolean gameFinish=false;
		while(!gameFinish)
		{
			printBoard(box);
			System.out.print("Player " + player + " enter: ");
			int r=sc.nextInt();
			int c=sc.nextInt();
			
			if(box[r][c]==' ')
			{
				box[r][c]=player;
				if(!matchWon(box,player) && isBoardFull(box))
				{
					System.out.println("Game Draw!!!");
					break;
				}
				else{
					gameFinish= matchWon(box,player);
				}
				if(gameFinish)
				{
					System.out.println("Player " + player + " has won");
				}
				else
				{
					if(player=='x')
						player='o';
					else
						player='x';
				}
			}
			else
			{
				System.out.println("Invalid move. Please try again!");
			}
		}
		printBoard(box);
	}
	
	public static boolean matchWon(char[][] box, char player)
	{
		//for row
		for(int r=0;r<box.length;r++)
		{
			if(box[r][0]==player && box[r][1]==player && box[r][2]==player) {
				return true;
			}
		}
		//for column
		for(int c=0;c<box.length;c++)
		{
			if(box[0][c]==player && box[1][c]==player && box[2][c]==player) {
				return true;
			}
		}
		
		
		//for diagonal
		if(box[0][0]==player && box[1][1]==player && box[2][2]==player) {
			return true;
		}
		if(box[0][2]==player && box[1][1]==player && box[2][0]==player) {
			return true;
		}
		
		return false;
	}
	
	public static void printBoard(char[][] box)
	{
		for(int r=0;r<box.length;r++)
		{
			for(int c=0;c<box[r].length;c++)
			{
				System.out.print(box[r][c]+ "|");
			}
			System.out.println();
		}
	}
	
	public static boolean isBoardFull(char[][] box)
	{
		for(int r=0;r<box.length;r++)
		{
			for(int c=0;c<box[0].length;c++)
			{
				if(box[r][c]==' ') {
					return false;
				}
			}
		}
		return true;
	}

}
