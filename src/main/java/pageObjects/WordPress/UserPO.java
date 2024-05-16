package pageObjects.WordPress;

import AdminPageUIs.WordPressUserPUI;
import commons.BaseAction;
import jdbcTest.MySQLConnUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserPO extends BaseAction {
    WebDriver driver;
    public UserPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isUserNumberCorrect() throws SQLException {
        int displayingUserNumber = getListElementSize(driver, WordPressUserPUI.RECORD_ITEMS);
        Connection conn = MySQLConnUtils.getMySQLConnection();
        Statement statement = conn.createStatement();
        String userNumberQueryingSyntax = "Select * from `wp_users`";
        ResultSet rsUser = statement.executeQuery(userNumberQueryingSyntax);
        ArrayList listOfUserId = new ArrayList<>();
        while (rsUser.next()) {
            listOfUserId.add(rsUser.getString("display_name"));
        }
        int userNumberFromDB = listOfUserId.size();
        return verifyEquals(userNumberFromDB, displayingUserNumber);
    }
}
