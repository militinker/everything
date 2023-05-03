package com.syntax.review2;

public class ifElse {
    public static void main(String[] args) {

        /*
         if statement
         if (boolean condition) {... block of code A
         } else {.. block of code B
         }

         */

        int num= 12;

        if(num>100){
            System.out.println(num+" is greater than 100");
        }else{
            System.out.println(num+" is smaller than 100");
        }

        String button="Enroll today";

        if(button.equals("Enroll Today")){
            System.out.println("Test Case Pass");
        }else{
            System.out.println("Test case Failed");
        }


    }
}
