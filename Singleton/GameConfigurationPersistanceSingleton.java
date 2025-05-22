
public class GameConfigurationPersistanceSingleton extends KeyValuePersistance
{
    private static GameConfigurationPersistanceSingleton GAME_PERSISTANCE =
        new GameConfigurationPersistanceSingleton();
    public static GameConfigurationPersistanceSingleton getInstance()
    {
        return GAME_PERSISTANCE;
    }
    private GameConfigurationPersistanceSingleton()
    {
        super("_Saved_Game_Configuration");
    }
}
