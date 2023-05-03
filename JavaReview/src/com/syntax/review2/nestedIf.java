package com.syntax.review2;

public class nestedIf {
    public static void main(String[] args) {

        /*
        nested if is 1 is statement inside another if statement
        when we have 1 condition that depends on another
         */

        boolean vaccine= true;
        int dose=2;

        if(vaccine){
            System.out.println("How many doses do you have");

            if(dose==1){
                System.out.println("You need a second dose");
            }else {
                System.out.println("You are fully vaccinated");
            }


        }



    }
}
