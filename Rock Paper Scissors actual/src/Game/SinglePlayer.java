/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SinglePlayer extends Game
{
    public SinglePlayer(String p1)
    {
        super(p1,"Computer");
    }    
    
    /**
     * Get the computers Move, parameter does nothing but needs to be included as overriding parent method.
    */
    public Move getPlayer2Move(int move)
    {
        Move[] moves = Move.values();
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
        return moves[index];        
    } 
}