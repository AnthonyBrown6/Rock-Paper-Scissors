/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;
/**
 * Write a description of class MimicComputer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MimicGame extends Game
{
    private String playerLastMove;
    // private String lastMove;
    /**
     * Constructor for objects of class MimicGame
     */
    public MimicGame(String p1)
    {
        super(p1,"Computer");
        playerLastMove = null;
    }
    
    /**
     * @Override
     * Get the player's move, increment the count of the choice made and record the players move so that the computer
     * will mimic the move in the next round.
     */
    public Move getPlayer1Move(int move)
    {        
        Move[] moves = Move.values();
        if(move == 1)
        {
            playerLastMove = "ROCK";
            super.incrementRocks();
        }
        else if(move == 2)
        {
            playerLastMove = "PAPER";
            super.incrementPapers();
        }
        else if(move == 3)
        {
            playerLastMove = "SCISSORS";
            super.incrementScissors();
        }
        else if(move == 4)
        {
            playerLastMove = "LIZARD";
            super.incrementLizards();
        }
        else if(move == 5)
        {
            playerLastMove = "SPOCK";
            super.incrementSpocks();
        }
        for(int i = 0;i < moves.length;i++)
        {
            if(moves[i].toString().equals(playerLastMove))
            return moves[i];
        }
        return null;
    }
    
    /**
     * Get the computers move. if it is the first round the computer makes a random choice, else the computer will
     * mimic the last choice the player made. whichever choice is made, the count for that choice will be incremented.
    */
    public Move getPlayer2Move(int m)
    {
        Move[] moves = Move.values();
        if(super.getRounds() == 0)
        {
            Random ran = new Random();
            int index = ran.nextInt(moves.length);
            if(moves[index].toString() == "PAPER")
            {
                super.incrementPapers();
            }
            else if(moves[index].toString() == "ROCK")
            {
                super.incrementRocks();
            }
            else if(moves[index].toString() == "SCISSORS")
            {
                super.incrementScissors();
            }
            else if(moves[index].toString() == "LIZARD")
            {
                super.incrementLizards();
            }
            else if(moves[index].toString() == "SPOCK")
            {
                super.incrementSpocks();
            }
            return moves[index]; 
        }
        else
        {
            for(int i = 0;i < moves.length;i++)
            {
                if(moves[i].toString().equals(playerLastMove) && moves[i].toString().equals("PAPER"))
                {
                    super.incrementPapers();
                    return moves[i];
                }
                else if(moves[i].toString().equals(playerLastMove) && moves[i].toString().equals("ROCK"))
                {
                    super.incrementRocks();
                    return moves[i];
                }
                else if (moves[i].toString().equals(playerLastMove) && moves[i].toString().equals("SCISSORS"))
                {
                    super.incrementScissors();
                    return moves[i];
                }
                else if (moves[i].toString().equals(playerLastMove) && moves[i].toString().equals("LIZARD"))
                {
                    super.incrementLizards();
                    return moves[i];
                }
                else if (moves[i].toString().equals(playerLastMove) && moves[i].toString().equals("SPOCK"))
                {
                    super.incrementSpocks();
                    return moves[i];
                }
                
            }
        }
        return null;    
    }
}
