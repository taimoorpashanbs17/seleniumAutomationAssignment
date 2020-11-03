package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(how=How.XPATH, using="//a[text()='Chapter1']")
    WebElement chapter1Link;

    public void clickOnChapter1Link(){
        chapter1Link.click();
    }

}