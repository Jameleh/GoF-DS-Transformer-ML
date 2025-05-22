package corpom;

public class LoginPage implements PageProcess
{
    private PageProcess nextPage;
    @Override
    public void setNext(PageProcess nextPage)
    {
        this.nextPage = nextPage;
    }

    @Override
    public boolean process(PageRequest page) {
        System.out.println("Login Page Displayed");
        //Actual Login Page implementation can be written here
        System.out.println("User Logged in!!");
        return nextPage.process(page);
    }
}
