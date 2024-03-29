package Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DBUtility {

    static Connection conn = null;
    static Statement statement= null;
    private static ResultSet rset;
    private static ResultSetMetaData rSetMetaDeta;

    //this method create connection to db, execute query and return object for resultset

    public static ResultSet getResultSet(String sqlQuery){
        try {
            conn = DriverManager.getConnection(
                    ConfigReader.getPropertyValue("urldb"),
                    ConfigReader.getPropertyValue("usernamedb"),
                    ConfigReader.getPropertyValue("passworddb"));

            statement = conn.createStatement();
            rset = statement.executeQuery(sqlQuery);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return rset;
    }

    // this method will return the object of rsetmetadata

    public static ResultSetMetaData getrSetMetaDeta(String query){
        rset = getResultSet(query);
        rSetMetaDeta = null;
        // we use this line to get the data in tabular format so that
        // we can use these in colum keys and values for retrivaloperation
        try {
            rSetMetaDeta = rset.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rSetMetaDeta;
    }

    //this method is extracting the data which will be stored in list of maps
    public static List<Map<String,String>> getListOfMapsFromRset(String query){
       rSetMetaDeta= getrSetMetaDeta(query);
       List<Map<String,String>> listFromRset= new ArrayList<>();
       try{
       while (rset.next()){
           Map<String,String> map= new LinkedHashMap<>();
           for (int i = 1; i <=rSetMetaDeta.getColumnCount(); i++) {
               //fetching key and value from the columns
               String key= rSetMetaDeta.getColumnName(i);
               String value=rset.getString(key);
               map.put(key, value);
           }
           System.out.println(map);
           listFromRset.add(map);
       }
       }catch (SQLException e) {
           e.printStackTrace();
       }finally{
           DBUtility.closeResultSet(rset);
           DBUtility.closeStatement(statement);
           DBUtility.closeConnection(conn);

    }return listFromRset;
       }

       //close resultset
    //close statement
    //close connection

    public static void closeResultSet(ResultSet rset){
        if(rset!=null){
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
    public static void closeStatement(Statement statement){
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
