/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author antma
 */
public enum Move
{
    ROCK,PAPER,SCISSORS;
    
    public int moveComparrison(Move opposingMove)
    {
        if(this == opposingMove)
        return 0;
        
        switch(this)
        {
            case ROCK: return (opposingMove == SCISSORS ? 1 : -1);
            case PAPER: return (opposingMove == ROCK ? 1 : -1);
            case SCISSORS: return (opposingMove == PAPER ? 1 : -1);
        }
        return 0;
    }
}

