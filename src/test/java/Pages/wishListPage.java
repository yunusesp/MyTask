package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishListPage extends PageObject{


    @FindBy(xpath = "//*[@id='content']")
    public WebElement wishListPage   ;
    @FindBy(xpath = "//*[@id='content']/div[1]/table")
    public WebElement table ;
    @FindBy(xpath = "//*[@id='content']/div[2]/div/a" )
    public WebElement  wishListcontinueBtn ;
    @FindBy(xpath = "//*[@id='account-account']/ul/li[1]/a/i")
    public WebElement backHomePage;

}
