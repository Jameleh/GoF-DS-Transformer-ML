
import java.util.Hashtable;
import org.allbinary.util.BasicArrayList;
public class GameConfigurationSingleton
{
    private static GameConfigurationSingleton SINGLETON = new GameConfigurationSingleton();
    private BasicArrayList list;
    private Hashtable hashtable;
    public static GameConfigurationSingleton getInstance()
    {
        return SINGLETON;
    }
    private GameConfigurationSingleton()
    {
        list = new BasicArrayList();
        hashtable = new Hashtable();
    }
    public GameConfiguration getInstance(String name)
    {
        return (GameConfiguration) hashtable.get(name);
    }
    public BasicArrayList getOptionsBasicArrayList()
    {
        return list;
    }
    public void add(GameConfiguration gameConfiguration)
    {
        list.add(gameConfiguration);
    }
    public Hashtable getHashtable()
    {
        return this.hashtable;
    }
}
