import java.lang.*;
import java.io.*;
import java.util.Scanner;
class TicTacToe {
   static char[][] board;
    public TicTacToe()
    {
        board=new char[3][3];
        initBoard();
    }
    void initBoard()
    {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
    }
    static void displayBoard()
    {
        System.out.println("-------------");
        for(int i=0;i<board.length;i++){
            System.out.print("| ");
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" | ");
               
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
	static void symbol(int row,int col,char mark)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2)
		{
			board[row][col]=mark;
		}
		else
		{
			System.out.println("invalid position");
		}
	}
	 static boolean colWin()
	{
		for(int j=0;j<=2;j++)
		{
			if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j])
			{
			return true;
			}
		}
		return false;
	}
	static boolean rowWin()
	{
		for(int i=0;i<=2;i++)
		{
			if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2])
			{
				return true;
			}
		}
		return false;
	}
	static boolean diagonalWin()
	{
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] ||  board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
		{
			return true;
		}
		return false;
	}
	static boolean draw()
	{
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(board[i][j]==' ')
				{
					return false;
				}
			}
		}
		return true;
	}

}
class Player
{
	String name;
	char symbol;
	Player(String name,char symbol)
	{
		this.name=name;
		this.symbol=symbol;

	}
	void move()
	{
		Scanner scn=new Scanner(System.in);
		int row;
		int col;
		do
		{
			System.out.println("Enter row and column : ");
			row=scn.nextInt();
			col=scn.nextInt();
		}
		while (!valid(row,col));
		TicTacToe.symbol(row,col,symbol);
	}
	boolean valid(int row,int col)
	{
		if(row>=0 && row<=2 && col>=0 && col<=2)
		{
			if(TicTacToe.board[row][col]==' ')
			{
				return true;
			}
		}
		return false;
	}

}
public class Game{
    public static void main(String[] args){
		TicTacToe t=new TicTacToe();
      Player p1= new Player("Bob",'X');
	  Player p2=new Player("sita",'O');
	  Player currp;
	  currp=p1;
	  while(true)
		{
		  System.out.println(currp.name  +" turn");
	      currp.move();
		  TicTacToe.displayBoard();
	      if(TicTacToe.colWin() || TicTacToe.rowWin() ||TicTacToe.diagonalWin())
		  {
		      System.out.println(currp.name+ " has won");
			  break;
		  }
		 else if(TicTacToe.draw())
			{
			 System.out.println("Game is draw");
			 break;
			}
	     else
		 {
			 if(currp==p1)
			 {
				 currp=p2;
			 }
			 else
			 {
				 currp=p1;
			 }
		  }
		}
    }
}