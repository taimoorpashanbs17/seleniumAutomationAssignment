package methods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Chapter1Page;
import java.util.logging.Logger;


public class Chapter1TextVerificationTest extends TestBase {
    String textToVerify = "Assert that this text is on the page";
    private static final Logger log = Logger.getLogger(Thread.currentThread().
            getStackTrace()[0].getClassName());

    @Test
    public void verifyTextDisplaying() throws Exception {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    Chapter1Page chapter1page = PageFactory.initElements(driver, Chapter1Page.class);
    homePage.clickOnChapter1Link();
    Assert.assertTrue(chapter1page.textToAssertDisplaying());
    log.info("Text Message is Displaying");
    Assert.assertEquals(chapter1page.getTextOnPageText(), textToVerify);
    log.info("Correct Text Message is Displaying");
    chapter1page.navigateBackToHomePage();
    log.info("Navigate Back to Home Page");
    }
}
