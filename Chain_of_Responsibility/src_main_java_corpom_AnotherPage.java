package corpom;

public class AnotherPage implements PageProcess
{
    private PageProcess nextPage;
    @Override
    public void setNext(PageProcess nextPage)
    {
        this.nextPage = nextPage;
    }

    @Override
    public boolean process(PageRequest page) {
        System.out.println("Another Page Displayed");
        //Actual Another Page implementation can be written here
        System.out.println("Interacting with Another Page");
        return false;
    }
}
