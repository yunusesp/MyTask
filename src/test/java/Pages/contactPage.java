package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactPage extends PageObject {

    @FindBy(xpath = "//*[@id='top-links']/ul/li[1]/a/i")
    public WebElement contacnt;

    @FindBy(id = "content")
    public WebElement ContactDisplayed;
}
