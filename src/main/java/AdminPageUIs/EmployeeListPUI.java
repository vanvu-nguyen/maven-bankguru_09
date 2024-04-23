package AdminPageUIs;

public class EmployeeListPUI {
    public static final String ADD_EMPLOYEE_BUTTON = "XPATH=//a[text()='Add Employee']";
    public static final String EMPLOYEE_ID_SEARCHBOX = "XPATH=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String EMPLOYEE_SEARCH_BUTTON = "XPATH=//button[contains(string(),'Search')]";
    public static final String PRECEDING_SIBLING_OF_COLUMN = "XPATH=//div[@class='oxd-table-header']//div[text()='%s']/preceding-sibling::div";
    public static final String RECORD_DATA_LOCATOR = "XPATH=//div[@class='oxd-table-body']//div[@role='cell'][%s]/div";
    public static final String EDIT_BUTTON_BY_ID = "XPATH=(//div[text()='%s']/parent::div/following-sibling::div)[last()]//i[contains(@class,'bi-pencil-fill')]/parent::button";
}
