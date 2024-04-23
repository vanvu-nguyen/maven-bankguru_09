package commons;

import java.io.File;
import java.time.Duration;

public class GlobalConstants {
    // Server url: dev, testing, staging, production
    public static final String DEV_ADMIN_URL = "https://admin-demo.nopcommerce.com/";
    public static final String DEV_USER_URL = "https://demo.nopcommerce.com/";

    // Database: dev, testing, staging, production

    // Timeout: short, long
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 10;

    // Username, Password
    public static final String DEV_ADMIN_USERNAME = "admin@yourstore.com";
    public static final String DEV_ADMIN_PASSWORD = "admin";

    // OS name
    public static final String OS_NAME = System.getProperty("os.name");

    // Relative project path
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");

    // download/upload file folder
    public static final String DOWNLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "downloadFiles" + File.separator;
    public static final String UPLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "uploadFiles" + File.separator;

    // liveGuru
    public static final String LIVE_GURU_USER_URL = "http://live.techpanda.org/";
    public static final String LIVE_GURU_ADMIN_URL = "http://live.techpanda.org/index.php/backendlogin";

    // Registering test infor
    public static final String FIRST_NAME = "vu";
    public static final String LAST_NAME = "nguyen";
    public static final String PASSWORD = "123456";
    public static final String ADMIN_ID = "user01";
    public static final String ADMIN_PASS = "guru99com";


    public static final String REPORTING_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator + "reportNGImage" + File.separator;

    public static final String JAVA_VERSION = System.getProperty("java.version");

    // OrangeHRM Login account

    public static final String ORANGEHRM_ADMIN_USERNAME = "automationfc";
    public static final String ORANGEHRM_ADMIN_PASSWORD = "Automationfc1$";

    // OrangeHRM Data test
    public static final String ORANGEHRM_DATATEST_FIRSTNAME = "vu";
    public static final String ORANGEHRM_DATATEST_LASTNAME = "nguyen";
    public static final String ORANGEHRM_DATATEST_MIDDLENAME = "van";
    public static final String ORANGEHRM_DATATEST_OTHERID = "VU29";
    public static final String ORANGEHRM_DATATEST_DRIVER_LICENSE = "DL002";
    public static final String ORANGEHRM_DATATEST_LICENSE_EXPIRY_DATE = "2030-12-01";
    public static final String ORANGEHRM_DATATEST_DOB = "1999-09-02";

    // Browser extention folder
    public static final String BROWSER_EXTENTION_PATH = RELATIVE_PROJECT_PATH + File.separator + "browserExtension" + File.separator;

    // Browser log folder
    public static final String BROWSER_LOG_FOLDER = RELATIVE_PROJECT_PATH + File.separator + "browserLog" + File.separator;
}
