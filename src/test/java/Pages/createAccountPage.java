package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createAccountPage extends PageObject{
    @FindBy(name = "firstname")
    public WebElement name;
    @FindBy(name = "lastname")
    public WebElement lastname;
    @FindBy(name = "email")
    public WebElement mail;
    @FindBy(name = "telephone")
    public WebElement phoneNumber;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(id = "input-confirm")
    public WebElement passwordConfirm;
    @FindBy(xpath = "//*[@id='content']/form/fieldset[3]/div/div/label[2]")
    public WebElement ignoreSubsribe;

    @FindBy(name = "agree")
    public WebElement privacyPolicyAccept;
    @FindBy(xpath= "//input[@type='submit']")
    public WebElement continueButton;
    @FindBy(id= "content")
    public WebElement accountCreated;






}
