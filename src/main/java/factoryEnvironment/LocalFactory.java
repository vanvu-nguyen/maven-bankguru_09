package factoryEnvironment;

import commons.BrowserList;
import commons.EnvironmentList;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class LocalFactory {
    private String browserName;
    private WebDriver driver;
    public LocalFactory(String browserName) {
        this.browserName = browserName;
    }
    public WebDriver createDriver() {
        BrowserList browserName = BrowserList.valueOf(this.browserName.toUpperCase());
        switch (browserName) {
            case CHROME: driver = new ChromeDriver();
                break;
            case EDGE: driver = new EdgeDriver();
                break;
            case FIREFOX: driver = new FirefoxDriver();
                break;
            case SAFARI: driver = new SafariDriver();
                break;
            default: throw new RuntimeException("Browser name is not valid");
        }
        return driver;
    }
}
