package pageObjects.admin;

import commons.BaseAction;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class QualificationsPO extends BaseAction {
    private WebDriver driver;

    public QualificationsPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}