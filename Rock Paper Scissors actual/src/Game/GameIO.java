/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;
import java.io.*;
/**
 *
 * @author antma
 */
public class GameIO 
{
    private static Game game;
    private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)
    {
        int choice;
        int move;
        int move2;
        try
        {
            choice = -1;   
            while(choice != 0)
            {
                choice = getMenuItem();
                //Single Player
                if(choice == 1)
                {
                    //Set up the game
                    System.out.println("Enter your name");
                    String p1 = myIn.readLine();
                    game = new SinglePlayer(p1);                    
                    move = -1;
                    //Loop to keep playing rounds until the player decides to end
                    while(move != 0)
                    {   
                        System.out.println("Make your move");
                        move = gameMove(); //Take the players move choice                    
                        if (move != 0 && (move == 1 || move == 2 || move == 3))
                        {
                            Move computerMove = game.getPlayer2Move(0); //Take the computers move choice  
                            Move playerMove = game.getPlayer1Move(move);
                            System.out.println("You played: " + playerMove.toString());
                            System.out.println("The computer played: " + computerMove.toString());
                            System.out.println(game.compareMoves(playerMove,computerMove));
                            printGameStatistics(game);
                        }
                        else if(move == 0)
                        {
                            printGameStatistics(game);
                        }
                    }                    
                }
                
                // Multi Player
                if(choice == 2)
                {
                    System.out.println("Player 1: Enter your name");
                    String p1 = myIn.readLine();
                    System.out.println("Player 2: Enter your name");
                    String p2 = myIn.readLine();
                    game = new Multiplayer(p1,p2);                    
                    move = -1;
                    // //Loop to keep playing rounds until player 1 decides to end
                    while(move != 0)
                    { 
                        System.out.println("Player 1 Make your move");
                        move = gameMove(); //Take the players move choice                    
                        if (move != 0 && (move == 1 || move == 2 || move == 3))
                        {
                            Move player1Move = game.getPlayer1Move(move);
                            System.out.println("Player 2 Make your move");
                            move2 = player2GameMove();
                            Move player2Move = game.getPlayer2Move(move2);
                            
                            System.out.println("Player 1 played: " + player1Move.toString());
                            System.out.println("Player 2 played: " + player2Move.toString());
                            System.out.println(game.compareMoves(player1Move,player2Move));
                        }                        
                        printGameStatistics(game);
                    }
                }
                
                // Mimic Game
                if(choice == 3)
                {
                    System.out.println("Enter your name");
                    String p1 = myIn.readLine();
                    game = new MimicGame(p1);                    
                    move = -1;
                    //Loop to keep playing rounds until the player decides to end
                    while(move != 0)
                    {    
                        System.out.println("Make your move");
                        move = gameMove(); //Take the players move choice                                      
                        if (move != 0)
                        {
                            Move computerMove = game.getPlayer2Move(0); //Take the computers move choice  
                            Move playerMove = game.getPlayer1Move(move);
                            System.out.println("You played: " + playerMove.toString());
                            System.out.println("The computer played: " + computerMove.toString());
                            System.out.println(game.compareMoves(playerMove,computerMove));
                        }                        
                        printGameStatistics(game);
                    }
                }
            }  
        }
        catch (IOException e) {System.out.println(e);}
    }

    private static int getMenuItem()throws IOException
    {
        int option = -1;
        
        System.out.println("1. Single Player Game");
        System.out.println("2. Multi Player Game");
        System.out.println("3. Mimic Game");
        System.out.println("0. Quit");
        System.out.println("Enter the number of your choice");
        option =  Integer.parseInt(myIn.readLine());
        return option;
    }
    
    private static int gameMove() throws IOException
    {
        int option = -1;
        
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("0. Quit");
        option =  Integer.parseInt(myIn.readLine());
        return option;
    }
    
    private static int player2GameMove() throws IOException
    {
        int option = -1;
        
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        option =  Integer.parseInt(myIn.readLine());
        return option;
    }
    
    private static void printGameStatistics(Game game)
    {
        System.out.println("****************************************");
        System.out.println(game.toString());                 
        System.out.println("****************************************");
    }
}
