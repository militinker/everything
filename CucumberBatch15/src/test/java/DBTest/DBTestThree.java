package DBTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DBTestThree {
    public static void main(String[] args) {
        String url="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username="syntax_hrm";
        String password="syntaxhrm123";

        try {
            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("connection is created");
            Statement statement=conn.createStatement();

            String query="select * from person;";
            ResultSet rset= statement.executeQuery(query);

            //extract data from resultset and store it in java data structure
            List<Map<String,String>> listFromRset=new ArrayList<>();
            ResultSetMetaData rsmdata=rset.getMetaData();
            // iterate thoru rows
            while (rset.next()) {
                Map<String, String> map = new LinkedHashMap<>();
// iterate throu columns
                for (int i = 1; i <=rsmdata.getColumnCount(); i++) {
                    //fetching key and value from the columns
                    String key= rsmdata.getColumnName(i);
                    String value=rset.getString(key);
                    map.put(key, value);
                }
                System.out.println(map);
                listFromRset.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

