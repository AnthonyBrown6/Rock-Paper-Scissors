/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;


public abstract class Game
{
    private ArrayList<String> players;
    private int rounds;
    private int player1Wins;
    private int player2Wins;
    private int draws;
    private int rocks;
    private int papers;
    private int scissors;
    
    public Game (String p1,String p2)
    {
        players = new ArrayList<String>();
        rounds = 0;
        player1Wins = 0;
        player2Wins = 0;
        draws = 0;
        players.add(p1);
        players.add(p2);
    }
    
    public int getRounds()
    {
        return rounds;
    }
    
    public void incrementRounds()
    {
        rounds ++;
    }
    
    public int getPlayerWins(int playerNumber)
    {
        if(playerNumber == 1)
        {
            return player1Wins;
        }
        else
        {
            return player2Wins;
        }      
    }
    
    public void incrementPlayerWins(int playerNumber)
    {
        if(playerNumber == 1)
        {
            player1Wins ++;;
        }
        else
        {
            player2Wins ++;;
        }         
    }
    
    public int getDraws()
    {
        return draws;
    }
    
    public void incrementDraws()
    {
        draws ++;
    }
    
    public int getRocks()
    {
        return rocks;
    }
    
    public void incrementRocks()
    {
        rocks ++;
    }
    
    public int getPapers()
    {
        return papers;
    }
    
    public void incrementPapers()
    {
        papers ++;
    }
    
    public int getScissors()
    {
        return scissors;
    }
    
    public void incrementScissors()
    {
        scissors ++;
    }
    
    /**
     * Get the player's move.
     */
    public Move getPlayer1Move(int move)
    {
        Move[] moves = Move.values();
        if(move == 1)
        {
            incrementRocks();
            return Move.ROCK;
        }
        else if(move == 2)
        {
            incrementPapers();
            return Move.PAPER;
        }
        else if(move == 3)
        {
            incrementScissors();
            return Move.SCISSORS;
        }
        return null;
    }
    
    public abstract Move getPlayer2Move(int i);
    
    public String compareMoves(Move p1Move, Move p2Move)
    {
        int winner = p1Move.compareTo(p2Move);
        switch (winner)
        {
            case 0: 
                incrementDraws();
                incrementRounds();
                return "Draw";
            case 1:
                incrementPlayerWins(1);
                incrementRounds();
                return "Player 1 Wins";
            case -1:
                incrementPlayerWins(2);
                incrementRounds();
                return "Player 2 Wins";
        }
        return null;
    }
    
    /**
     * Get information regarding the players 
    */
    public String getPlayers()
    {
        return 
        "Player 1: " + players.get(0) + " Wins: " + player1Wins
        + "\nPlayer 2: " + players.get(1) + " Wins: " + player2Wins;       
    }
    
    /**
     *Return the information regarding the players and game as a String  
     */
    public String toString()
    {
        return "Rounds: " + getRounds() + "\nDraws: " + getDraws() + "\nRocks Used: " + getRocks() + "\nPapers Used: " + getPapers() + "\nScissors Used: " + getScissors() + "\n" + getPlayers();
    }
}
