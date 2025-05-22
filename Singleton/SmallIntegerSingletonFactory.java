
public class SmallIntegerSingletonFactory
{
    private static final SmallIntegerSingletonFactory instance = new SmallIntegerSingletonFactory();
    public static SmallIntegerSingletonFactory getInstance()
    {
        return instance;
    }
    public final int NEGATIVE_MAX = 500;
    public final int POSITIVE_MAX = 0x2D1; 
    private final Integer[] INTEGER_ARRAY = new Integer[NEGATIVE_MAX + POSITIVE_MAX];
    public int MIN = 0;
    public int lastMin = 0;
    public int lastNegativeMin = 0;
    public void init(int value, int negativeValue)
    {
        for (int index = value - 1; index >= lastMin; index--)
        {
            INTEGER_ARRAY[index + NEGATIVE_MAX] = new Integer(index);
        }
        for (int index = negativeValue - 1; index >= lastNegativeMin; index--)
        {
            INTEGER_ARRAY[index] = new Integer(-index);
        }
        if (lastMin < value)
        {
            lastMin = value;
            MIN = value;
        }
        if (lastNegativeMin < negativeValue)
        {
            lastNegativeMin = negativeValue;
        }
    }
    public void init()
    {
        if (lastMin < POSITIVE_MAX || lastNegativeMin < NEGATIVE_MAX)
        {
            for (int index = POSITIVE_MAX - 1; index >= lastMin; index--)
            {
                INTEGER_ARRAY[index + NEGATIVE_MAX] = new Integer(index);
            }
            for (int index = NEGATIVE_MAX - 1; index >= lastNegativeMin; index--)
            {
                INTEGER_ARRAY[index] = new Integer(-index);
            }
            lastMin = POSITIVE_MAX;
            lastNegativeMin = NEGATIVE_MAX;
        }
    }
    private SmallIntegerSingletonFactory()
    {
    }
    public Integer getInstance(int index)
    {
        return INTEGER_ARRAY[index + NEGATIVE_MAX];
    }
    public Integer createInstance(int index)
    {
        Integer integer = getInstance(index);
        if(integer == null)
        {
            integer = new Integer(index);
        }
        return integer;
    }
}
