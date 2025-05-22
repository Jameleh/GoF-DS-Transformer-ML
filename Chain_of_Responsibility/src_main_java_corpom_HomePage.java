package corpom;

public class HomePage implements PageProcess
{
    private PageProcess nextPage;
    @Override
    public void setNext(PageProcess nextPage)
    {
        this.nextPage = nextPage;
    }

    @Override
    public boolean process(PageRequest page) {
        System.out.println("Home Page Displayed");
        //Actual Home Page implementation can be written here
        System.out.println("Interacting with HomePage");
        return nextPage.process(page);
    }
}
