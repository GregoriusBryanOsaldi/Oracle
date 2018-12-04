/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class TestOracle1 {

    public static void main(String[] args) {
        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //step2 create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@172.23.9.185:1521:orcl", "MHS175314111", "MHS175314111");
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery("SELECT emp.FIRST_NAME,emp.LAST_NAME,dep.DEPARTMENT_NAME,mgr.FIRST_NAME AS MANAGER_NAME FROM MHS175314111.EMPLOYEES emp,MHS175314111.DEPARTMENTS dep,MHS175314111.EMPLOYEES mgr WHERE emp.DEPARTMENT_ID = dep.DEPARTMENT_ID AND emp.MANAGER_ID = mgr.EMPLOYEE_ID");
            System.out.printf("%-20s", "First Name");
            System.out.printf("%-20s", "Last Name");
            System.out.printf("%-20s", "Department Name");
            System.out.printf("%-20s", "Manager Name");

            while (rs.next()) {
                System.out.println("");
                System.out.printf("%-20s", rs.getString(1));
                System.out.printf("%-20s", rs.getString(2));
                System.out.printf("%-20s", rs.getString(3));
                System.out.printf("%-20s", rs.getString(4));
            }
            //step5 close the connection object
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestOracle1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
