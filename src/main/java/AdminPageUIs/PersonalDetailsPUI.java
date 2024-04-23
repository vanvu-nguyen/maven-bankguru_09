package AdminPageUIs;

public class PersonalDetailsPUI {
    public static final String FIRSTNAME_TEXTBOX = "XPATH=//input[@name='firstName']";
    public static final String LASTNAME_TEXTBOX = "XPATH=//input[@name='lastName']";
    public static final String EMPLOYEE_ID_TEXTBOX = "XPATH=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String EMPLOYEE_LIST_BUTTON = "XPATH=//a[text()='Employee List']";
    public static final String DETAILS_MIDDLENAME_TEXTBOX = "XPATH=//input[@name='middleName']";
    public static final String DETAILS_OTHERID_TEXTBOX = "XPATH=//label[text()='Other Id']/parent::div/following-sibling::div/input";
    public static final String DETAILS_DRIVER_LICENSE_TEXTBOX = "XPATH=//label[contains(string(),'License Number')]/parent::div/following-sibling::div/input";
    public static final String DETAILS_LICENSE_EXPIRY_DATE_DROPDOWN = "XPATH=//label[text()='License Expiry Date']/parent::div/following-sibling::div//input";
    public static final String DETAILS_PARENT_NATIONALITY = "XPATH=//label[text()='Nationality']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text-input')]";
    public static final String DETAILS_CHILD_NATIONALITY = "XPATH=//label[text()='Nationality']/parent::div/following-sibling::div//div[@role='listbox']//span[text()='Japanese']";
    public static final String DETAILS_SELECTED_NATIONALITY = "XPATH=//label[text()='Nationality']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text--active')]/div[@class='oxd-select-text-input']";
    public static final String DETAILS_PARENT_MARITAL = "XPATH=//label[text()='Marital Status']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text-input')]";
    public static final String DETAILS_CHILD_MARITAL = "XPATH=//label[text()='Marital Status']/parent::div/following-sibling::div//div[@role='listbox']//span[text()='Married']/parent::div";
    public static final String DETAILS_SELECTED_MARITAL = "XPATH=//label[text()='Marital Status']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text--active')]/div[@class='oxd-select-text-input']";
    public static final String DETAILS_DOB_DROPDOWN = "XPATH=//label[text()='Date of Birth']/parent::div/following-sibling::div//input";
    public static final String DETAILS_MALE_GENDER = "XPATH=//label[text()='Male']";
    public static final String MAIN_INFOR_SAVE_BUTTON = "XPATH=//h6[text()='Personal Details']/following-sibling::form//button[contains(string(),'Save')]";
    public static final String PERSONAL_DETAILS_TITLE = "XPATH=//h6[text()='Personal Details']";
}
