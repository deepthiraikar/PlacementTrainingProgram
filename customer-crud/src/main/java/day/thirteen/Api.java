package day.thirteen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class Api {

    private Connection connection;

    public Api() {
        connection = Connecting.getConnect();
    }

    public void findAll() {
        try {
            String qry = "SELECT * FROM Customer";
            PreparedStatement stmt = connection.prepareStatement(qry);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getString("CustomerID") + " " +
                    rs.getString("CustomerName") + " " +
                    rs.getDate("DOB") + " " +
                    rs.getString("ContactNo")
                );
            }

            stmt.close();

        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    public void createTable() {
        try {
            String qry = "CREATE TABLE Customer(" +
                         "CustomerID VARCHAR(10) PRIMARY KEY," +
                         "CustomerName VARCHAR(50)," +
                         "DOB DATE," +
                         "ContactNo VARCHAR(15))";

            PreparedStatement stmt = connection.prepareStatement(qry);
            stmt.execute();

            System.out.println("Table created successfully");

            stmt.close();

        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    public void insertRecord(String id, String nm, String dob, String cn) {

        try {
            String qry =
                "INSERT INTO Customer(CustomerID, CustomerName, DOB, ContactNo) VALUES(?,?,?,?)";

            PreparedStatement stmt = connection.prepareStatement(qry);

            stmt.setString(1, id);
            stmt.setString(2, nm);
            stmt.setDate(3, Date.valueOf(dob));
            stmt.setString(4, cn);

            int count = stmt.executeUpdate();

            if (count > 0)
                System.out.println("Customer " + nm + " registered successfully");
            else
                System.out.println("Registration failed");

            stmt.close();

        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    public void findByDOB(String dob) {

        try {
            String qry = "SELECT * FROM Customer WHERE DOB = ?";

            PreparedStatement stmt = connection.prepareStatement(qry);

            stmt.setDate(1, Date.valueOf(dob));

            ResultSet rs = stmt.executeQuery();

            System.out.println("\nCustomers having DOB = " + dob);

            while (rs.next()) {
                System.out.println(
                    rs.getString("CustomerID") + " " +
                    rs.getString("CustomerName") + " " +
                    rs.getDate("DOB") + " " +
                    rs.getString("ContactNo")
                );
            }

            stmt.close();

        } catch (SQLException s) {
            s.printStackTrace();
        }
    }
}