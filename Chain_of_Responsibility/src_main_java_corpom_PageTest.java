package corpom;

public class PageTest
{

    public static void main(String[] args)
    {
        PageProcess loginPage = new LoginPage();
        PageProcess homePage = new HomePage();
        PageProcess anotherPage = new AnotherPage();

        loginPage.setNext(homePage);
        homePage.setNext(anotherPage);

        PageRequest req = new PageInfo();
        req.setPage();
        loginPage.process(req);
    }
}
