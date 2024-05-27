package commons;

import lombok.Getter;

import java.io.File;
@Getter
public class GlobalConstants {
    private static GlobalConstants globalConstants;
    private GlobalConstants() {
    }
    public synchronized static GlobalConstants getGlobalConstants() {
        if (globalConstants == null) {
            globalConstants = new GlobalConstants();
        }
        return globalConstants;
    }

    // Server url: dev, testing, staging, production

    // Database: dev, testing, staging, production

    // Timeout: short, long
    private final long shortTimeout = 5;
    private final long longTimeout = 10;

    // OS name
    private final String osName = System.getProperty("os.name");

    // Relative project path
    private final String relativeProjectPath = System.getProperty("user.dir");

    // download/upload file folder
    private final String downloadPath = relativeProjectPath + File.separator + "downloadFiles" + File.separator;
    private final String uploadPath = relativeProjectPath + File.separator + "uploadFiles" + File.separator;

    // Browser extention folder
    private final String browserExtentionPath = relativeProjectPath + File.separator + "browserExtension" + File.separator;

    // Browser log folder
    private final String browserLogFolder = relativeProjectPath + File.separator + "browserLog" + File.separator;

    private final String reportingImagePath = relativeProjectPath + File.separator + "reportNGImage" + File.separator;
    private final String javaVersion = System.getProperty("java.version");

    // OrangeHRM test account
    private final String usernameAdminAccount = "automationfc";
    private final String passwordAdminAccount = "Automationfc1$";

    // SauceDemo test account
    private final String usernameSaucedemo = "standard_user";
    private final String passwordSaucedemo = "secret_sauce";

    // Wordpress (DB name: automationtesting)
    private final String username = "automationtesting";
    private final String password = "VN8jCVAlb7c3XckUFZ";

}
