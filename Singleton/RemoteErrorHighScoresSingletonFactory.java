
import org.allbinary.logic.basic.string.CommonStrings;
public class RemoteErrorHighScoresSingletonFactory
{
    private static final HighScores SINGLETON = new HighScores("Loading", "Remote High Scores Did Not Load", 
            CommonStrings.getInstance().PERIODS);
    public static final HighScores getInstance()
    {
        return SINGLETON;
    }
}
