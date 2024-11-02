package sept.ex_09102024_inheritance_single_inheritance;

public class TestCase extends BaseTest{
    void getURL()
    {
        startingBrowser();
        openChrome();
        System.out.println("Getting URL");
        closingBrowser();
    }

}
