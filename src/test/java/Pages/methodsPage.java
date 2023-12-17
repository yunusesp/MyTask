package Pages;

import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.LocalTime;

public class methodsPage extends  PageObject{
    public static String password(){
        String passwordsend = methodsPage.methods().internet().password();
        return passwordsend;
    }
    public static LocalDate dateSelect(){
        LocalDate localDate = LocalDate.now();

        return localDate;
    }
    public static Faker methods(){
        Faker faker = new Faker();
        return faker;
    }
    public static Select slctMethods(WebElement element){
        Select select = new Select(element);
        return select;
    }
    public static String paths(){
        String pathFile = System.getProperty("user.dir");
        String srcPath = "/src/test/resources/apple_cinema_30-228x228.jpg";
        String fullPath = pathFile + srcPath;
        return fullPath;
    }
    public static LocalDate datePicker(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
    public static int timePicker(){
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        return hour;

    }

    public void scrollAndclick(WebElement element){
        scrollInto(element);
        element.click();
    }

    public void scrollInto(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        //jse.executeScript("arguments[0].scrollIntoView();",element);
        jse.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void scrollDown(int size){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+size+")", "");
    }

}
