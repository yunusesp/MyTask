package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class appleMonitor extends PageObject{


    @FindBy(name= "option[218]")
    public WebElement selectInch;

    @FindBy(name = "option[223][]")
    public WebElement checkBox;

    @FindBy(id = "input-option208")
    public WebElement testBox;

    @FindBy(id = "button-upload222")
    public WebElement uploadFile;

    @FindBy(xpath = "//*[@id='input-option217']")
    public WebElement selectColor;
    @FindBy(xpath = "//*[@id='input-option209']")
    public WebElement textArea ;
    @FindBy(id = "input-option219")
    public WebElement dateSelector;
    @FindBy(id = "input-option221")
    public WebElement hourSelector;
    @FindBy(id = "input-option220")
    public WebElement dateAndTimeSelector;
    @FindBy(id = "input-quantity")
    public WebElement qty;

}
