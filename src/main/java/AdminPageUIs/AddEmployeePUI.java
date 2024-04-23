package AdminPageUIs;

public class AddEmployeePUI {
    //public static final String EMPLOYEE_ID_TEXTBOX = "XPATH=//label[contains(string(),'Employee Id')]/parent::div/following-sibling::div/input";
    public static final String EMPLOYEE_ID_TEXTBOX = "XPATH=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String FIRSTNAME_TEXTBOX = "XPATH=//input[@name='firstName']";
    public static final String LASTNAME_TEXTBOX = "XPATH=//input[@name='lastName']";
    public static final String SAVE_BUTTON = "XPATH=//button[contains(string(),'Save')]";
}
