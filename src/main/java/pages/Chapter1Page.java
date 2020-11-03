package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chapter1Page {
    WebDriver driver;

    public Chapter1Page(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(how=How.ID, using="divontheleft")
    WebElement textToAssert;

    @FindBy(how=How.XPATH, using="//a[text()='Home Page']")
    WebElement homePageButton;

    public String getTextOnPageText(){
        return textToAssert.getText();
    }

    public boolean textToAssertDisplaying(){
        return textToAssert.isDisplayed();
    }

    public void navigateBackToHomePage(){
        homePageButton.click();
    }
}
