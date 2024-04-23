package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class JobPO extends BaseAction {
    private WebDriver driver;

    public JobPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
