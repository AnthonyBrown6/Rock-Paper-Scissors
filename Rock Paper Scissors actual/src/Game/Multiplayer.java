/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

public class Multiplayer extends Game
{
    /**
     * Constructor for objects of class Multiplayer
     */
    public Multiplayer(String p1, String p2)
    {
        super(p1,p2);
    }
    
    /**
     * Get player 2's move
    */
    public Move getPlayer2Move(int move)
    {
        Move[] moves = Move.values();
        if(move == 1)
        {
            super.incrementRocks();
            return Move.ROCK;
        }
        else if(move == 2)
        {
            super.incrementPapers();
            return Move.PAPER;
        }
        else if(move == 3)
        {
            super.incrementScissors();
            return Move.SCISSORS;
        }
        return null;      
    } 
}
