package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matcher.*;

import static io.restassured.RestAssured.given;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardCodedExamples {
   String baseURI= RestAssured.baseURI ="http://hrm.syntaxtechs.net/syntaxapi/api";
   String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODQ5Mzc0NzIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NDk4MDY3MiwidXNlcklkIjoiNTIxNyJ9.de0lIG0dILUz8-3NvjYhS4TBQQUuRMnKDpGz3NpPw1c";
   static String employee_id;

   @Test
   public void createEmployee(){
    // prepare the request
    RequestSpecification preparedRequest=given().header("Content-Type","application/json").
                                                 header("Authorization",token).
                                                  body("{\n" +
                                                          "    \"emp_firstname\": \"belena\",\n" +
                                                          "    \"emp_lastname\": \"baria\",\n" +
                                                          "    \"emp_middle_name\": \"ms\",\n" +
                                                          "    \"emp_gender\": \"F\",\n" +
                                                          "    \"emp_birthday\": \"2009-05-20\",\n" +
                                                          "    \"emp_status\": \"confirmed\",\n" +
                                                          "    \"emp_job_title\": \"engineer\"\n" +
                                                          "}");
    // hitting the end point
    Response response= preparedRequest.when().post("/createEmployee.php");

    // verify the assertions
    response.then().assertThat().statusCode(201);

    // we are capturing employee id fom the respond
     employee_id=  response.jsonPath().getString("Employee.employee_id");
       System.out.println(employee_id);

    // to print the output in the console
    response.prettyPrint();

    //verifying the first name in the response
    response.then().assertThat().
    body("Employee.emp_firstname",equalTo("belena"));
       response.then().assertThat().
               body("Employee.emp_lastname",equalTo("baria"));

       //verifying response header
       response.then().assertThat().header("Content-Type","application/json");


       System.out.println("my test case is passed");
}

@Test
    public void getCreatedEmployee(){
    RequestSpecification preparedRequest=given().
    header("Content-Type","application/json").
            header("Authorization", token).
            queryParam("employee_id",employee_id);

    //hitting the end point
    Response response= preparedRequest.when().get("/getOneEmployee.php");

    //verify the response
    response.then().assertThat().statusCode(200);

    String tempEmpId= response.jsonPath().getString("employee.employee_id");

    // we have 2 emp id, one is global and 2nd is local
    Assert.assertEquals(employee_id,tempEmpId);

    }

    // in homework create a mehod to get all empl
    // oyee status and job title
    @Test
    public void updateEmployee(){

       RequestSpecification preparedRequest=given().
               header("Content-Type","application/json").
        header("Authorization", token).
               body("{\n" +
                       "  \"employee_id\": \""+employee_id+"\",\n" +
                       "  \"emp_firstname\": \"visnja\",\n" +
                       "  \"emp_lastname\": \"savic\",\n" +
                       "  \"emp_middle_name\": \"nema\",\n" +
                       "  \"emp_gender\": \"F\",\n" +
                       "  \"emp_birthday\": \"2003-05-20\",\n" +
                       "  \"emp_status\": \"in jail\",\n" +
                       "  \"emp_job_title\": \"pretty\"\n" +
                       "}");
       Response response=preparedRequest.when().put("/updateEmployee.php");
       response.then().assertThat().statusCode(200);
       response.then().assertThat().body("Message",equalTo("Employee record updated"));

    }

    @Test
    public void getUpdatedEmployee(){
        RequestSpecification preparedRequest=given().
                header("Content-Type","application/json").
                header("Authorization", token).
                queryParam("employee_id",employee_id);

        Response response= preparedRequest.when().get("/getOneEmployee.php");
        response.prettyPrint();

        response.then().assertThat().statusCode(200);

        // if you want to verify the body of the response
        //you can do that using hamcrest matchers



    }

}
