package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class EmergencyContactsPO extends BaseAction {
    private WebDriver driver;

    public EmergencyContactsPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}