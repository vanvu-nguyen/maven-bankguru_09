package commons;

import java.io.File;

public class GlobalConstants {
    // Server url: dev, testing, staging, production

    // Database: dev, testing, staging, production

    // Timeout: short, long
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 10;

    // OS name
    public static final String OS_NAME = System.getProperty("os.name");

    // Relative project path
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");

    // download/upload file folder
    public static final String DOWNLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "downloadFiles" + File.separator;
    public static final String UPLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "uploadFiles" + File.separator;

    // Browser extention folder
    public static final String BROWSER_EXTENTION_PATH = RELATIVE_PROJECT_PATH + File.separator + "browserExtension" + File.separator;

    // Browser log folder
    public static final String BROWSER_LOG_FOLDER = RELATIVE_PROJECT_PATH + File.separator + "browserLog" + File.separator;

    public static final String REPORTING_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator + "reportNGImage" + File.separator;
    public static final String JAVA_VERSION = System.getProperty("java.version");

    // OrangeHRM test account
    public static final String USERNAME_ADMIN_ACCOUNT = "automationfc";
    public static final String PASSWORD_ADMIN_ACCOUNT = "Automationfc1$";

    // SauceDemo test account
    public static final String USERNAME_SAUCEDEMO = "standard_user";
    public static final String PASSWORD_SAUCEDEMO = "secret_sauce";

    // Wordpress (DB name: automationtesting)
    public static final String USERNAME = "automationtesting";
    public static final String PASSWORD = "VN8jCVAlb7c3XckUFZ";

}
