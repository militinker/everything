package com.syntax.review2;

public class ifElseIf {
    public static void main(String[] args) {

        /*
         when we have more conditions to test

         if (boolean condition) {... block of code A
         } else if(boolean condition) {.. block of code B
         }
         */

        int assignment=12;

        if(assignment>25){
            System.out.println("great Job");
        }else if(assignment>20) {
            System.out.println("good Job");
        }else if (assignment>15){
            System.out.println("ok job");
        }else if (assignment>5){
            System.out.println("not good job");
        }

        System.out.println("  ----------------   ");

        String browser = "chrome";

        if(browser.equals("chrome")){
            System.out.println("Test cases excetuted on chrome");

        }else if(browser.equals("safari")){
            System.out.println("Test cases excetuted on Safari");

        }else if(browser.equals("Firefox")){
            System.out.println("System tests on firefox");

        }else {
            System.out.println("Browser is not supported");
        }


    }
}
