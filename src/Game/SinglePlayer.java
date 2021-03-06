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
}
