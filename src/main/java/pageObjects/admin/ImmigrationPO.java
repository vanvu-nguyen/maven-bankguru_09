package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ImmigrationPO extends BaseAction {
    private WebDriver driver;

    public ImmigrationPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
