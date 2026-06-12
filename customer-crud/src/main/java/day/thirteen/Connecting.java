package day.thirteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connecting {
    public static Connection getConnect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/insurance",
                "root",
                "Dee@12mysql"
            );
        }catch(SQLException se){}
        return connection;
    }
}