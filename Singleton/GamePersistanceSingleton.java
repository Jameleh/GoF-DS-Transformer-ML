
public class GamePersistanceSingleton extends KeyValuePersistance
{
    private static GamePersistanceSingleton GAME_PERSISTANCE = new GamePersistanceSingleton();
    public static GamePersistanceSingleton getInstance()
    {
        return GAME_PERSISTANCE;
    }
    private GamePersistanceSingleton()
    {
        super("_Saved_Game");
    }
}
