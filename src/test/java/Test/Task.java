package Test;

import Pages.*;
import Utilities.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task extends BaseTest {
    @Test
    public void DisplayHomeScreen() {
        extentLogger = reports.createTest("DisplayHomeScreen");
        extentLogger.info("The User Going To URL");
        WebElement title = driver.findElement(By.xpath("//*[@id='logo']/h1/a"));
        Assert.assertTrue(title.isDisplayed(), "The Page Did Not Displayed");

    }

    @Test
    public void GeneralControl() throws InterruptedException {
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        accountPage accountPage = new accountPage();
        createAccountPage createAccountPage = new createAccountPage();
        methodsPage methodsPage = new methodsPage();
        wishListPage wishListPage = new wishListPage();
        appleMonitor appleMonitor = new appleMonitor();
        paymentPage paymentPage = new paymentPage();


        extentLogger = reports.createTest("GeneralControl");
        extentLogger.info("User Visiting URL ");
        extentLogger.info("User Confirm That Can see Home Page ");
        Assert.assertTrue(homePage.title.isDisplayed(), "The Page Did Not Displayed");


        extentLogger.info("User Checking If user Changes Money Format The All Prices will changes(Exp: money Format $ but he changes for pound £ )");
        extentLogger.info("User Clicking To money dropdowns");
        homePage.checkMoney.click();

        Thread.sleep(1000);
        extentLogger.info("User Clicking To £ money type");
        homePage.MoneyFormat.click();

        Thread.sleep(2000);
        if (homePage.moneyPound.isDisplayed()) {
            extentLogger.info("All Prices are Changed");
        } else {
            extentLogger.info("Prices cannot changed");
        }
        extentLogger.info("User clicking to a Contact Us button");
        contactPage.contacnt.click();
        Thread.sleep(2000);
        Assert.assertTrue(contactPage.ContactDisplayed.isDisplayed(), "Contact Us Cant displayed");

        extentLogger.info("User Going To Previous Page");
        driver.navigate().back();
        Thread.sleep(2000);
        extentLogger.info("User Check  user can create a account In own  mobile");
        accountPage.account.click();
        extentLogger.info("User clicking to register button");
        accountPage.register.click();
        Thread.sleep(2000);
        extentLogger.info("User Checking register account displayed?");
        Assert.assertTrue(accountPage.registerAccount.isDisplayed(), "Register Account Page Could'nt Displayed");

        extentLogger.info("User Entering a  name");
        createAccountPage.name.sendKeys(methodsPage.methods().name().firstName());
        extentLogger.info("User Entering a last name");

        createAccountPage.lastname.sendKeys(methodsPage.methods().name().lastName());
        extentLogger.info("User Entering a Email Adress");

        createAccountPage.mail.sendKeys(methodsPage.methods().internet().emailAddress());
        extentLogger.info("User Entering a phone number");

        createAccountPage.phoneNumber.sendKeys(methodsPage.methods().phoneNumber().cellPhone());
        extentLogger.info("User Entering a password");

        String password = methodsPage.password();
        createAccountPage.password.sendKeys(password);
        extentLogger.info("User Entering a password confirm");
        createAccountPage.passwordConfirm.sendKeys(password);
        extentLogger.info("User Clicking to Ignore Subscribe Button");
        createAccountPage.ignoreSubsribe.click();
        extentLogger.info("User Accepting Privacy Policy");
        createAccountPage.privacyPolicyAccept.click();
        extentLogger.info("User Cliiking to Countinue button");
        createAccountPage.continueButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(createAccountPage.accountCreated.isDisplayed(), "Account Cannot Created");
        extentLogger.info("User Going To Home Page");
        homePage.backHomePage.click();
        Thread.sleep(2000);
        extentLogger.info("User Adding Products To Shopping List");
        extentLogger.info("User Clicking To add shopping cart button for macbook");
        homePage.macbookAddShoppingCart.click();

//        extentLogger.info("User Clicking To add shopping cart button for iphone");
        //addShoppingCart.iphoneAddShoppingCart.click();
        Thread.sleep(2000);

        extentLogger.info("User Clicking To add shopping cart button for Apple MOnitor");
        homePage.appleMonitorAddShoppingCart.click();
        Thread.sleep(2000);

        extentLogger.info("User Selecting a inch for monitor");
        //  methodsPage.scrollDown(4500);
        methodsPage.scrollAndclick(appleMonitor.selectInch);
        Thread.sleep(3000);
        // appleMonitor.selectInch.click();


        extentLogger.info("User clicking to check box ");
        appleMonitor.checkBox.click();

        extentLogger.info("User Send Message To TestBox");
        appleMonitor.testBox.clear();
        appleMonitor.testBox.sendKeys("Test123");
        extentLogger.info("User Clicking to weich color want");
        methodsPage.slctMethods(appleMonitor.selectColor).selectByValue("3");

        appleMonitor.uploadFile.sendKeys(methodsPage.paths());
        extentLogger.info("User Typing Some Message To Text Area");
        appleMonitor.textArea.sendKeys("Blablablabla");
        methodsPage.scrollDown(300);
        extentLogger.info("User Sending File");
        appleMonitor.uploadFile.sendKeys(methodsPage.paths());
        extentLogger.info("User Entering a Date");
        appleMonitor.dateSelector.sendKeys(methodsPage.datePicker().toString());
        extentLogger.info("User selecting a Hour");
        appleMonitor.hourSelector.sendKeys(String.valueOf(methodsPage.timePicker()));
        extentLogger.info("User Entering a date and time");
        appleMonitor.dateAndTimeSelector.sendKeys(methodsPage.datePicker().toString() + String.valueOf(methodsPage.datePicker()));
        extentLogger.info("User Selecting a Quantity of product");
        appleMonitor.qty.clear();
        appleMonitor.qty.sendKeys("2");
        extentLogger.info("User Clicking to add to cart button");
        homePage.addToCart.click();
        extentLogger.info("User Going to previous page");
        homePage.backHomePage.click();


//        extentLogger.info("User Clicking To add shopping cart button for Canon Camera");
//        loginPage.canonCameraAddShoppingCart.click();


//        extentLogger.info("User Clicking to Shopping Cart button for check products are there");


        extentLogger.info("User Adding Prodcuts To Wish List");

        extentLogger.info("User Clicking to Macbook Add To Wish List");
        homePage.macbookAddWishList.click();

        extentLogger.info("User Clicking To iphone Add to wish list");
        homePage.iphoneAddWishList.click();

        extentLogger.info("User clicking to apple cinma monitor add to wish list");
        homePage.appleCinemaMonitorAddWishList.click();
        extentLogger.info("User Clicking to canon Camera add to wish list");
        homePage.canonCameraAddWishList.click();
        Thread.sleep(2000);
        extentLogger.info("User Check Product Are In Wish List");
        homePage.wishList.click();
        Thread.sleep(2000);

        Assert.assertTrue(wishListPage.wishListPage.isDisplayed(), "User Couldnt See My Wish List Page");
        String tableString = wishListPage.table.getText();
        Assert.assertTrue(tableString.contains("Canon EOS 5D"), "Camera Cannot Added to Wish List");
        Assert.assertTrue(tableString.contains("iPhone"), "iPhone Cannot Added To Wish List");
        Assert.assertTrue(tableString.contains("Apple Cinema 30"), "Apple Monitor Cannot Added To wish list");
        Assert.assertTrue(tableString.contains("MacBook"), "Macbook Cannot Added to wish list");
        wishListPage.wishListcontinueBtn.click();

        wishListPage.backHomePage.click();

        // Normalde Asagidaki Kodlar 246. satira Kadar Calisiyor

       /* extentLogger.info("User Ckecking out");
        Thread.sleep(2000);


        homePage.shoppingCartBtn.click();
        Thread.sleep(2000);

        paymentPage.checkOut.click();
        Thread.sleep(2000);

        extentLogger.info("User Entering a name");
        paymentPage.firstName.sendKeys(methodsPage.methods().name().firstName());
        extentLogger.info("User Entering a lastname");

        paymentPage.lastName.sendKeys(methodsPage.methods().name().lastName());

        extentLogger.info("User entering a shipping adress");
        paymentPage.adress.sendKeys(methodsPage.methods().address().streetAddress());
        extentLogger.info("User entering a shipping city");
        paymentPage.city.sendKeys(methodsPage.methods().address().city());
        extentLogger.info("User Entering A postalcode");
        paymentPage.postalCode.sendKeys(methodsPage.methods().address().zipCode());
        extentLogger.info("User Entering A country");

        methodsPage.slctMethods(paymentPage.country).selectByValue("74");
        extentLogger.info("User Enterin a Region and state");

        methodsPage.slctMethods(paymentPage.ragionState).selectByValue("1202");

        paymentPage.confrimBtn.click();
        extentLogger.info("User clicking to continue button");
        paymentPage.shippingContinueButton.click();
        extentLogger.info("User Clicking to continue button on delivery page");

        paymentPage.delivryMethodContinueButton.click();
        extentLogger.info("User Accepting Privacy");
        paymentPage.agree.click();
        Thread.sleep(2000);
        extentLogger.info("User clicking to continue button on payment method page");
       paymentPage.paymentMEthodContinueButton.click();
        Thread.sleep(2000);
        extentLogger.info("User Clicking to Confirm Button");

        paymentPage.confirmButton.click();
        Thread.sleep(2000);
        extentLogger.info("User Buying To Products");

        Assert.assertTrue(paymentPage.orderComplate.isDisplayed(), "Order Isnt Complate");

        paymentPage.complateContunieButton.click();*/
        Thread.sleep(2000);
        extentLogger.info("User Loging Out");
        accountPage.account.click();
        Thread.sleep(2000);

        accountPage.logOut.click();
        Thread.sleep(2000);

        Thread.sleep(2000);
        Assert.assertTrue(accountPage.loggedOut.isDisplayed(), "Cannot Logged out");
        Thread.sleep(2000);


    }

}
