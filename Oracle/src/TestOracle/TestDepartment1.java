/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOracle;

import Model_HR.*;

/**
 *
 * @author admin
 */
public class TestDepartment1 {

    public static void main(String[] args) {
        System.out.println("Department Administrator");
        Department dept = new Department(10, "Administration");
        dept.readEmployees();
        for (int i = 0; i < dept.getListEmployees().size(); i++) {
            System.out.println(dept.getListEmployees().get(i).toString());
        }
        System.out.println("\nDepartment Marketing");
        Department dept1 = new Department(20, "Marketing");
        dept1.readEmployees();
        for (int i = 0; i < dept1.getListEmployees().size(); i++) {
            System.out.println(dept1.getListEmployees().get(i).toString());
        }
    }

}
