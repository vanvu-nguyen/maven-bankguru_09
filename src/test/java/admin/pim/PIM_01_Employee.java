package admin.pim;

import com.github.javafaker.Faker;
import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.admin.*;
import pojoData.AdminInfo;
import pojoData.EmployeeInfo;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;
import java.util.Locale;

public class PIM_01_Employee extends BaseTest {
    private WebDriver driver;
    private String browserName;
    private LoginPO loginPage;
    private DashboardPO dashboardPage;
    private EmployeeListPO employeeListPage;
    private AddEmployeePO addEmployeePage;
    private PersonalDetailsPO personalDetailsPage;
    private AdminInfo adminInfo;
    private EmployeeInfo employeeInfo;
    private Faker faker;

    @Parameters({"url", "browser"})
    @BeforeClass
    public void beforeClass(String url,String browser) {
        driver = getBrowserDriver(browser, url);
        browserName = browser;
        loginPage = PageGeneratorManager.getLoginPage(driver);

        /*loginPage.senkeyToUsernameTextbox();
        loginPage.senkeyToPasswordTextbox();
        dashboardPage = loginPage.clickToLoginButton();*/

        dashboardPage = loginPage.loginToAdminSite();
        employeeListPage = dashboardPage.clickToPimModule();

        adminInfo = AdminInfo.getAdmin();

        employeeInfo = EmployeeInfo.getEmployee();
        faker = new Faker(new Locale("en-US"));
        employeeInfo.setFirstName(faker.name().firstName());
        employeeInfo.setLastName(faker.name().lastName());
        employeeInfo.setMiddleName(faker.name().lastName());
        employeeInfo.setOtherId(faker.phoneNumber().cellPhone());
        employeeInfo.setDriverLicense(faker.idNumber().valid());
        employeeInfo.setLicenseExpiryDate("2029-09-13");
        employeeInfo.setNationality("Japanese");
        employeeInfo.setMaritalStatus("Married");
        employeeInfo.setDateOfBirth("2019-12-03");
    }

    @Test
    public void Employee_01_Add_New(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_01_Add_New");
        addEmployeePage = employeeListPage.clickToAddEmployeeButton();

        //employeeId = addEmployeePage.getEmployeeId();
        employeeInfo.setEmployeeId(addEmployeePage.getEmployeeId());

        /*addEmployeePage.senkeyToFirstnameTextbox(employeeInfo);
        addEmployeePage.senkeyToLastnameTextbox(employeeInfo);
        personalDetailsPage = addEmployeePage.clickToSaveButton();*/

        personalDetailsPage = addEmployeePage.updateEmployeeFirstnameAndLastname(employeeInfo);

        personalDetailsPage.waitLoadingSpinnerInvisible();

        Assert.assertEquals(personalDetailsPage.getFirstnameValue(), employeeInfo.getFirstName());
        Assert.assertEquals(personalDetailsPage.getLastnameValue(), employeeInfo.getLastName());
        Assert.assertEquals(personalDetailsPage.getEmployeeIdValue(), employeeInfo.getEmployeeId());

        employeeListPage = personalDetailsPage.clickToEmployeeListButton();
        employeeListPage.senkeyToEmployeeIdSearchbox(employeeInfo.getEmployeeId());
        employeeListPage.clickToSearchButton();

        Assert.assertEquals(employeeListPage.getRecordDataByColumnName("Id"), employeeInfo.getEmployeeId());
        Assert.assertEquals(employeeListPage.getRecordDataByColumnName("First (& Middle) Name"), employeeInfo.getFirstName());
        Assert.assertEquals(employeeListPage.getRecordDataByColumnName("Last Name"), employeeInfo.getLastName());
    }

    @Test
    public void Employee_02_Personal_Details(Method method) {
        ExtentTestManager.startTest(method.getName() + " - Run on " + browserName.toUpperCase(), "Employee_02_Personal_Details");

        personalDetailsPage = employeeListPage.clickToEditButtonById(employeeInfo.getEmployeeId());

        personalDetailsPage.waitLoadingSpinnerInvisible();

        Assert.assertEquals(personalDetailsPage.getFirstnameValue(), employeeInfo.getFirstName());
        Assert.assertEquals(personalDetailsPage.getLastnameValue(), employeeInfo.getLastName());
        Assert.assertEquals(personalDetailsPage.getEmployeeIdValue(), employeeInfo.getEmployeeId());

        /*personalDetailsPage.inputMiddleName(employeeInfo);
        personalDetailsPage.inputOtherId(employeeInfo);
        personalDetailsPage.inputDriverLicenseNumber(employeeInfo);
        personalDetailsPage.inputLicenseExpiryDate(employeeInfo);
        personalDetailsPage.selectNationality(employeeInfo);
        personalDetailsPage.selectMaritalStatus(employeeInfo);
        personalDetailsPage.inputDateOfBirth(employeeInfo);
        personalDetailsPage.selectMaleGender();
        personalDetailsPage.clickToSaveButtonOfDetails();*/

        personalDetailsPage.updateEmployeeInfo(employeeInfo);

        Assert.assertEquals(personalDetailsPage.getNationalityInfor(), employeeInfo.getNationality());
        Assert.assertEquals(personalDetailsPage.getMaritalStatus(), employeeInfo.getMaritalStatus());
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
