package com.syntax.review2;

public class ifStatement {
    public static void main(String[] args) {


        /* if statement - conditional statement

        if(boolean condition){....block of code
        }
        >, >=, <. <=, !=, ==
        */
        int day=2;

        if(day==1) {
            System.out.println("It is the first day of the month");
        }

        String month="December";

        if(month.equals("December")){
            System.out.println("It is Christmas Time");
        }


        boolean evening=true;
        // if it boolean condition u dont have to use ==signs
        if(evening){
            System.out.println("Might have  aclass at syntax");
        }
    }
}
