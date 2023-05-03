package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static AddEmployeePage addEmp;
    public static void initializePageObjects(){
       login=new LoginPage();
       addEmp=new AddEmployeePage();


    }


}

// this class will manage the object creation of different page objects in our framework
// Instead of calling hte page objects again and again, this class will take good care of it
