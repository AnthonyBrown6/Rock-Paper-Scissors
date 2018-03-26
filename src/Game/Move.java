package Game;
/**
 * Enumeration class Move - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Move
{
    ROCK,PAPER,SCISSORS,LIZARD,SPOCK;
    
    public int moveComparrison(Move opposingMove)
    {
        if(this == opposingMove) 
        return 0;
        switch(this)
        {
            case ROCK: return (opposingMove == SCISSORS || opposingMove == LIZARD ? 1 : -1);
            case PAPER: return (opposingMove == ROCK || opposingMove == SPOCK ? 1 : -1);
            case SCISSORS: return (opposingMove == PAPER || opposingMove == LIZARD ? 1 : -1);
            case LIZARD: return (opposingMove == SPOCK || opposingMove == PAPER ? 1 : -1);
            case SPOCK: return (opposingMove == SCISSORS || opposingMove == ROCK ? 1 : -1);
        }        
        return 0;
    }
}
