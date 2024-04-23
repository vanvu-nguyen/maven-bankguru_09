package commons;

import AdminPageUIs.BaseElement;
import org.openqa.selenium.WebDriver;

public class BaseAction extends BasePage {
    WebDriver driver;

    public BaseAction(WebDriver driver) {
        this.driver = driver;
    }

    public void waitLoadingSpinnerInvisible() {
        waitForListElementInvisible(driver, BaseElement.LOADING_SPINNER);
    }
}

