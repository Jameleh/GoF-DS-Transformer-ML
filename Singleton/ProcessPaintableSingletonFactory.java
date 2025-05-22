
public class ProcessPaintableSingletonFactory
{
    private static final ProcessPaintable SINGLETON = new ProcessPaintable();
    private ProcessPaintableSingletonFactory()
    {
    }
    public static ProcessPaintable getInstance()
    {
        return SINGLETON;
    }
}
