package Pages;

import org.openqa.selenium.WebDriver;

public class BaseDriver {

    protected WebDriver driver;

    public BaseDriver(WebDriver driver){
        this.driver = driver;
    }

}