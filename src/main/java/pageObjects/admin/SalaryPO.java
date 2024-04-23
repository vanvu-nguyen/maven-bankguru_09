package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class SalaryPO extends BaseAction {
    private WebDriver driver;

    public SalaryPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}