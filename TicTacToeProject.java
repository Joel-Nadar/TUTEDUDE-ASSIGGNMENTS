package TcetBrigdeCousre;
import java.util.*;
public class TicTacToeProject
{
    public static boolean isValid(char board[][],int i, int j)//To check if that position is empty or not
    {
        if(board[i][j]!='_')
        {
            System.out.println("Invalid"+"\n"+"The position is already filled");
            return false;
        }
        return true;
    }
    public static void boardDisplay(char board[][])//To display the final output of the board
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean playPlayer1(char board[][],int pos)//This is to represent the turn of player 1
    {
        int r = -1,c=-1;
        switch(pos)
        {
            case 1:
                r=0;
                c=0;
                break;
            case 2:
                r=0;
                c=1;
                break;
            case 3:
                r=0;
                c=2;
                break;
            case 4:
                r=1;
                c=0;
                break;
            case 5:
                r=1;
                c=1;
                break;
            case 6:
                r=1;
                c=2;
                break;
            case 7:
                r=2;
                c=0;
                break;
            case 8:
                r=2;
                c=1;
                break;
            case 9:
                r=2;
                c=2;
                break;
            default:
                System.out.println("Invalid Position...Please enter valid position");
        }
        if(!isValid(board,r,c))
        {
            return false;
        }
        board[r][c]='X';
        boardDisplay(board);
        return checkVictory(board,'X');
    }
    public static boolean playPlayer2(char board[][],int pos)//This is to represent the turn of player 2
    {
        int r = -1,c=-1;
        switch(pos)
        {
            case 1:
                r=0;
                c=0;
                break;
            case 2:
                r=0;
                c=1;
                break;
            case 3:
                r=0;
                c=2;
                break;
            case 4:
                r=1;
                c=0;
                break;
            case 5:
                r=1;
                c=1;
                break;
            case 6:
                r=1;
                c=2;
                break;
            case 7:
                r=2;
                c=0;
                break;
            case 8:
                r=2;
                c=1;
                break;
            case 9:
                r=2;
                c=2;
                break;
            default:
                System.out.println("Invalid Position...Please enter valid position");
        }
        if(!isValid(board,r,c))
        {
            return false;
        }
        board[r][c]='O';
        boardDisplay(board);
        return checkVictory(board,'O');
    }
    public static boolean checkVictory(char board[][],char symbol)//To check the status of each player if it has won or not
    {
        for(int i=0;i<3;i++)
        {
            if(board[0][i]==symbol && board[1][i]==symbol && board[2][i]==symbol)//Checks vertically
            {
                return true;
            }
            if(board[i][0]==symbol && board[i][1]==symbol && board[i][2]==symbol)//Checks horizontally
            {
                return true;
            }
            if(board[0][0]==symbol && board[1][1]==symbol && board[2][2]==symbol)//Checks the diagonal
            {
                return true;
            }
            if(board[0][2]==symbol && board[1][1]==symbol && board[2][0]==symbol)//Checks another diagonal
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the game of Tic-Tac-Toe!!");
        System.out.println("Please Players, enter your inGameName");
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        System.out.println("Please pick a Player number (1 for 'X'/2 for 'O')");//Allowing the users to select player number
        int ch=sc.nextInt();
        while(true) {
            if (ch == 1) {
                System.out.println(name1 + " You are Player 1...You will play as 'X'" + "\n" + name2 + " You are Player 2...You will play as 'O'");
                break;
            } else if (ch == 2) {
                System.out.println(name1 + " You are Player 2...You will play as 'O'" + "\n" + name2 + " You are Player 1...You will play as 'X'");
                break;
            } else {
                System.out.println("Please pick a number from the given options only");
                ch=sc.nextInt();
                continue;
            }
        }
        System.out.println("LETS BEGIN THE GAME !!");
        char board[][]=new char[3][3];//Initialization of the board(2D array)
        //To display the board
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[i][j]='_';
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        int trials=1;//The total turns of both the players are 9
        while(trials<=9)
        {
            boolean victory;
            if(trials%2!=0)//It's obvious that player 1 will have turns in odd number
            {
                System.out.println("Player 1, Please pick your position (1-9)");
                int pos=sc.nextInt();//Taking the desired input position from the user
                victory=playPlayer1(board,pos);
                if(victory)
                {
                    System.out.println(name1+" WINS!!!");
                    break;
                }
            }
            else
            {
                System.out.println("Player 2, Please pick your position (1-9)");
                int pos=sc.nextInt();
                victory=playPlayer2(board,pos);
                if(victory)
                {
                    System.out.println(name2+" WINS!!!");
                    break;
                }
            }
            trials++;
        }
        if(trials>9)//If the trials value reaches 9 that means the game  has ended but no one has won. That means it's a tie
        {
            System.out.println("The match is a tie");
        }
    }
}