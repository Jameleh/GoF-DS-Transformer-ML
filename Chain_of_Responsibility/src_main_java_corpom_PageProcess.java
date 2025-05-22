package corpom;

public interface PageProcess
{
    public void setNext(PageProcess nextPage);
    public boolean process(PageRequest page);
}
