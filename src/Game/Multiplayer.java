package Game;

/**
 * Write a description of class MultiplayerGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
        else if(move == 4)
        {
            super.incrementLizards();
            return Move.LIZARD;
        }
        else if(move == 5)
        {
            super.incrementSpocks();
            return Move.SPOCK;
        }
        return null;      
    } 
}
