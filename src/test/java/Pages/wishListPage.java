package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addWishListPage extends PageObject{
    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/div[3]/button[2]")
    public WebElement macbookAddWishList  ;
    @FindBy(xpath = "//*[@id='content']/div[2]/div[2]/div/div[3]/button[2]")
    public WebElement iphoneAddWishList  ;
    @FindBy(xpath ="//*[@id='content']/div[2]/div[3]/div/div[3]/button[2]" )
    public WebElement appleCinemaMonitorAddWishList ;
    @FindBy(xpath = "//*[@id='content']/div[2]/div[4]/div/div[3]/button[2]")
    public WebElement canonCameraAddWishList  ;
    @FindBy(xpath = "//*[@id='wishlist-total']/i")
    public WebElement wishList  ;
    @FindBy(xpath = "//*[@id='content']")
    public WebElement wishListPage   ;
    @FindBy(xpath = "//*[@id='content']/div[1]/table")
    public WebElement table ;
    @FindBy(xpath = "//*[@id='content']/div[2]/div/a" )
    public WebElement  wishListcontinueBtn ;
    @FindBy
    public WebElement  ;
    @FindBy
    public WebElement  ;

}
