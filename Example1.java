import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class Example1 implements Player

{
    private static String name = "Example";
    private static String strategy = "Rock then last move";

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        int  i = 0;
        for (i = 0; i >= 0; i++)  
        if(myMoves.length == 0)
            return "r";
        else
            return opponentMoves[(i - 1)];
                }

    public String getName()
    {
        return name;
    }
}
