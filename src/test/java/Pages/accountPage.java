package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountPage extends PageObject {
    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/a/i")
    public WebElement account;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
    public WebElement register;

    @FindBy(id = "content")
    public WebElement registerAccount;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    public WebElement logOut;
    @FindBy(id = "content")
    public WebElement loggedOut;

}
