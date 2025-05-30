
import org.allbinary.util.BasicArrayList;
public class CurrentlyPressedTouchButtonSingleton
{
    private static final CurrentlyPressedTouchButtonSingleton instance =
        new CurrentlyPressedTouchButtonSingleton();
    public static CurrentlyPressedTouchButtonSingleton getInstance()
    {
        return instance;
    }
    protected final BasicArrayList list = new BasicArrayList();
    protected CurrentlyPressedTouchButtonSingleton()
    {
    }
    public int size()
    {
        return this.list.size();
    }
    public TouchButtonInput remove(int index)
    {
        return (TouchButtonInput) this.list.remove(index);
    }
    public boolean remove(TouchButtonInput touchButtonInput)
    { 
        return this.list.remove(touchButtonInput);
    }
    public TouchButtonInput get(int index)
    {
        return (TouchButtonInput) this.list.objectArray[index];
    }
    public boolean contains(TouchButtonInput touchButtonInput)
    {
        return this.list.contains(touchButtonInput);
    }
    public void add(TouchButtonInput touchButtonInput)
    {
        this.list.add(touchButtonInput);
    }
}
