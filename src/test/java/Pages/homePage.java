package Pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.LocalTime;


public class homePage extends PageObject {


    // TODO
    @FindBy(id = "logo")
    public WebElement title;

    @FindBy(xpath = "//*[@id='form-currency']/div/button")
    public WebElement checkMoney;

    @FindBy(name = "GBP")
    public WebElement MoneyFormat;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]/i")
    public WebElement macbookAddShoppingCart;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[2]/div/div[3]/button[1]")
    public WebElement iphoneAddShoppingCart;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[3]/div/div[3]/button[1]/i")
    public WebElement appleMonitorAddShoppingCart;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/div[3]/button[2]/i")
    public WebElement macbookAddWishList;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[2]/div/div[3]/button[2]/i")
    public WebElement iphoneAddWishList;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[3]/div/div[3]/button[2]")
    public WebElement appleCinemaMonitorAddWishList;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[4]/div/div[3]/button[2]/i")
    public WebElement canonCameraAddWishList;

    @FindBy(xpath = "//*[@id='wishlist-total']/i")
    public WebElement wishList;

    @FindBy(id = "button-cart")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id='logo']/h1/a")
    public WebElement backHomePage;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[4]/div/div[3]/button[1]/i")
    public WebElement canonCameraAddShoppingCart;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[4]/a/i")
    public WebElement shoppingCartBtn;

    @FindBy(id = "form-currency")
    public WebElement moneyPound;


}
