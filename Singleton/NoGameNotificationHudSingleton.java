
import org.allbinary.logic.basic.string.CommonStrings;
import org.allbinary.logic.communication.log.LogFactory;
import org.allbinary.logic.communication.log.LogUtil;
import org.allbinary.game.graphics.hud.BasicHudFactory;
import org.allbinary.graphics.color.BasicColorFactory;
public class NoGameNotificationHudSingleton
{
    private static final NoGameNotificationHudSingleton instance = 
        new NoGameNotificationHudSingleton();
    public static NoGameNotificationHudSingleton getInstance()
    {
        return instance;
    }
    private GameNotificationHud gameNotificationHud;
    private NoGameNotificationHudSingleton()
    {        
        try
        {
            BasicHudFactory basicHudFactory = BasicHudFactory.getInstance();
            this.gameNotificationHud = new GameNotificationHud(
            		basicHudFactory.TOPCENTER, 
            		basicHudFactory.HORIZONTAL,
                    14, 40, 2, BasicColorFactory.getInstance().RED);
        }
        catch(Exception e)
        {
            LogUtil.put(LogFactory.getInstance(CommonStrings.getInstance().EXCEPTION, this, CommonStrings.getInstance().CONSTRUCTOR, e));
        }
    }
    public GameNotificationHud getGameNotificationHud()
    {
        return gameNotificationHud;
    }
}
