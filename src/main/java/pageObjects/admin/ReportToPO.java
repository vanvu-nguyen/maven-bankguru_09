package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ReportToPO extends BaseAction {
    private WebDriver driver;

    public ReportToPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}