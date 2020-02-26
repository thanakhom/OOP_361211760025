package lab9;

import java.sql.*;
import java.util.ArrayList;

public class TestJDBC {

    public static void main(String[] args) {
        System.out.println("Load driver successfully.");
        //step 1: load driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //step 2:Create Connection
        ArrayList <Employee>myEMP = new ArrayList<Employee>();

        String SQCONN = "jdbc:sqlite:company.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null) {
                System.out.println("Could not connect to database.");
            } else {
                System.out.println("Connected to database.");
            }
            //step 3: Create Statement
            Statement stmt = conn.createStatement();
            String sql = "select*from Employee";
            ResultSet rs = stmt.executeQuery(sql);

            //step 4: display data from database
 //           System.out.println("Employee Information");

            while (rs.next()) {
//                System.out.println("##########################");
   //             System.out.println("empID:" + rs.getInt(1));
  //              System.out.println("Name:" + rs.getString(2));
 //               System.out.println("Position:" + rs.getString(3));
 //               System.out.println("Saiary:" + rs.getDouble(4));
                Employee emp = new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4));
                myEMP.add(emp);
            }
            //step 5: Close Connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Display data as object
        System.out.println("Data as object:");
        for (Employee e:myEMP){
            System.out.println(e.toString());
        }

    }//main

}//class
