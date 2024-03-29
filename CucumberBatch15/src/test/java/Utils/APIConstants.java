package Utils;

import io.restassured.RestAssured;

public class APIConstants {
    public static final String BaseURI= RestAssured.baseURI="hrm.syntaxtechs.net/syntaxapi/api";
    public static final String GENERATE_TOKEN_URI= BaseURI+"/generateToken.php";
    public static final String CREATE_EMPLOYEE_URI= BaseURI+"/createEmployee.php";
    public static final String GET_ONE_EMPLOYEE_URI= BaseURI+"/getOneEmployee.php";
    public static final String UPDATE_EMPLOYEE_URI= BaseURI+"/updateEmployee.php";
    public static final String GET_ALL_EMPLOYEE_URI= BaseURI+"/getAllEmployees.php";
    public static final String PARTIALY_UPDATE_EMPLOYEE_URI= BaseURI+"/updatePartialEmplyees.php";
    public static final String GET_EMPLOYEE_STATUS_URI= BaseURI+"/employeeStatus.php";
    public static final String DELETE_EMPLOYEE_URI= BaseURI+"/deleteEmployee.php";
    public static final String JOB_TITLE_EMPLOYEE_URI= BaseURI+"/jobTitle.php";

    //creating constants for headers
    public static final String HEADER_KEY_CONTENT_TYPE="Content-Type";
    public static final String HEADER_VALUE_CONTENT_TYPE="application/json";
    public static final String HEADER_KEY_AUTHORIZATION="Authorization";
}
