
import org.allbinary.logic.basic.string.CommonStrings;
public class NullHighScoresSingletonFactory
{
    private static final HighScores SINGLETON = new HighScores("Loading", "High Scores Not Loaded", 
            CommonStrings.getInstance().PERIODS);
    public static final HighScores getInstance()
    {
        return SINGLETON;
    }
}
