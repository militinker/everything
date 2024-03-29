package DBTest;

import java.sql.*;

public class DBTest {
    public static void main(String[] args) {
        /*
        to build the connection with the database
        we need 3 things url, username, password
         */

        String url="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username="syntax_hrm";
        String password="syntaxhrm123";

        //we need to establish the connection to the database
        try {
            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("connection is created");
            //create a statement to send sql queries
            Statement statement=conn.createStatement(); // now u are in position to write queries

            //when we send any query to the database then db returns
            //result set (tables with rows and columns)
            ResultSet rset=statement.executeQuery("select FirstName, LastName from person");
            rset.next();

            String fName=rset.getString("FirstName");
            String lName=rset.getString("LastName");
            System.out.println(fName+ " "+lName);

            rset.next(); // to print out next name
            fName=rset.getString("FirstName");
            lName=rset.getString("LastName");
            System.out.println(fName+ " "+lName);



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
