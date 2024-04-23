package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class DependentsPO extends BaseAction {
    private WebDriver driver;

    public DependentsPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}