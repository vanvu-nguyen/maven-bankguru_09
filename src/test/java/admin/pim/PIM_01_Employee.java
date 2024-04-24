package admin.pim;

import AdminPageUIs.PersonalDetailsPUI;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.admin.*;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

public class PIM_01_Employee extends BaseTest {
    private WebDriver driver;
    private String browserName, employeeId;
    private LoginPO loginPage;
    private DashboardPO dashboardPage;
    private EmployeeListPO employeeListPage;
    private AddEmployeePO addEmployeePage;
    private PersonalDetailsPO personalDetailsPage;

    @Parameters({"url", "browser"})
    @BeforeClass
    public void beforeClass(String url,String browser) {
        driver = getBrowserDriver(browser, url);
        browserName = browser;
        loginPage = PageGeneratorManager.getLoginPage(driver);

        loginPage.senkeyToUsernameTextbox();
        loginPage.senkeyToPasswordTextbox();
        dashboardPage = loginPage.clickToLoginButton();

        employeeListPage = dashboardPage.clickToPimModule();
    }

    @Test
    public void Employee_01_Add_New(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");
        addEmployeePage = employeeListPage.clickToAddEmployeeButton();
        employeeId = addEmployeePage.getEmployeeId();
        addEmployeePage.senkeyToFirstnameTextbox();
        addEmployeePage.senkeyToLastnameTextbox();
        personalDetailsPage = addEmployeePage.clickToSaveButton();

        personalDetailsPage.waitLoadingSpinnerInvisible();

        Assert.assertEquals(personalDetailsPage.getFirstnameValue(), GlobalConstants.ORANGEHRM_DATATEST_FIRSTNAME);
        Assert.assertEquals(personalDetailsPage.getLastnameValue(), GlobalConstants.ORANGEHRM_DATATEST_LASTNAME);
        Assert.assertEquals(personalDetailsPage.getEmployeeIdValue(), employeeId);

        employeeListPage = personalDetailsPage.clickToEmployeeListButton();
        employeeListPage.senkeyToEmployeeIdSearchbox(employeeId);
        employeeListPage.clickToSearchButton();

        Assert.assertEquals(employeeListPage.getRecordDataByColumnName("Id"), employeeId);
        Assert.assertEquals(employeeListPage.getRecordDataByColumnName("First (& Middle) Name"), GlobalConstants.ORANGEHRM_DATATEST_FIRSTNAME);
        Assert.assertEquals(employeeListPage.getRecordDataByColumnName("Last Name"), GlobalConstants.ORANGEHRM_DATATEST_LASTNAME);
    }

    @Test
    public void Employee_02_Personal_Details(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_02_Personal_Details");

        personalDetailsPage = employeeListPage.clickToEditButtonById(employeeId);

        //personalDetailsPage.isElementDisplayed(driver, PersonalDetailsPUI.PERSONAL_DETAILS_TITLE);
        personalDetailsPage.waitLoadingSpinnerInvisible();
        Assert.assertEquals(personalDetailsPage.getFirstnameValue(), GlobalConstants.ORANGEHRM_DATATEST_FIRSTNAME);
        Assert.assertEquals(personalDetailsPage.getLastnameValue(), GlobalConstants.ORANGEHRM_DATATEST_LASTNAME);
        Assert.assertEquals(personalDetailsPage.getEmployeeIdValue(), employeeId);

        personalDetailsPage.inputMiddleName();
        personalDetailsPage.inputOtherId();
        personalDetailsPage.inputDriverLicenseNumber();
        personalDetailsPage.inputLicenseExpiryDate();
        personalDetailsPage.selectNationality();
        personalDetailsPage.selectMaritalStatus();
        personalDetailsPage.inputDateOfBirth();
        personalDetailsPage.selectMaleGender();
        personalDetailsPage.clickToSaveButtonOfDetails();

        Assert.assertEquals(personalDetailsPage.getNationalityInfor(), "Japanese");
        Assert.assertEquals(personalDetailsPage.getMaritalStatus(), "Married");
    }

    @Test
    public void Employee_03_Contact_Details(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_03_Contact_Details");
    }

    @Test
    public void Employee_04_Emergency_Contacts(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_04_Emergency_Contacts");
    }

    @Test
    public void Employee_05_Dependents(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_05_Dependents");
    }

    @Test
    public void Employee_06_Immigration(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_06_Immigration");
    }

    @Test
    public void Employee_07_Job(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_07_Job");
    }

    @Test
    public void Employee_08_Salary(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_08_Salary");
    }

    @Test
    public void Employee_09_Report(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_09_Report");
    }

    @Test
    public void Employee_10_Qualifications(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_10_Qualifications");
    }

    @AfterClass
    public void afterClass() {
        closeBrowser(driver);
    }
}
