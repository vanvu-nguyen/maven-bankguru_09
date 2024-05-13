package pojoData;

import lombok.Getter;
import lombok.Setter;

public class EmployeeInfo {

    public static EmployeeInfo getEmployee() {
        return new EmployeeInfo();
    }

    @Setter @Getter
    private String employeeId;

    @Setter @Getter
    private String firstName;

    @Setter @Getter
    private String lastName;

    @Setter @Getter
    private String middleName;

    @Setter @Getter
    private String otherId;

    @Setter @Getter
    private String driverLicense;

    @Setter @Getter
    private String licenseExpiryDate;

    @Setter @Getter
    private String nationality;

    @Setter @Getter
    private String maritalStatus;

    @Setter @Getter
    private String dateOfBirth;

}
