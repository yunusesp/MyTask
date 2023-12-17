package Pages;

import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentPage extends PageObject{
    @FindBy(xpath ="//*[@id='content']/div[3]/div[2]/a" )
    public WebElement checkOut;

    @FindBy(id = "input-payment-firstname")
    public WebElement firstName;
    @FindBy(id = "input-payment-lastname")
    public WebElement lastName;
    @FindBy(id = "input-payment-address-1")
    public WebElement adress;
    @FindBy(id = "input-payment-city")
    public WebElement city;
    @FindBy(id = "input-payment-postcode")
    public WebElement postalCode;
    @FindBy(id = "input-payment-country")
    public WebElement country;
    @FindBy(id ="input-payment-zone" )
    public WebElement ragionState;
    @FindBy(id = "button-payment-address")
    public WebElement confrimBtn;
    @FindBy(id ="button-shipping-address" )
    public WebElement shippingContinueButton;
    @FindBy(id = "button-shipping-method")
    public WebElement delivryMethodContinueButton;
    @FindBy(name= "agree")
    public WebElement agree;
    @FindBy(id = "button-payment-method")
    public WebElement paymentMEthodContinueButton;
    @FindBy(id ="button-confirm" )
    public WebElement confirmButton;
    @FindBy(id = "content")
    public WebElement orderComplate;
   // @FindBy(className = "btn btn-primary")
    //public WebElement complateContunieButton;
}
