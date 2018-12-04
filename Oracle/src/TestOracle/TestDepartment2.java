/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOracle;

import Model_HR.*;

/**
 *
 * @author ELLEINA
 */
public class TestDepartment2 {

    public static void main(String[] args) {
        Department dept = new Department(10, "Administration");
        System.out.println(dept.getDepartment_name());
        dept.readEmployees();
        for (int i = 0; i < dept.getListEmployees().size(); i++) {
            System.out.println(dept.getListEmployees().get(i).toString());
        }

        Department dept1 = new Department(20, "Marketing");
        System.out.println("\n" + dept1.getDepartment_name());
        dept1.readEmployees();
        for (int i = 0; i < dept1.getListEmployees().size(); i++) {
            System.out.println(dept1.getListEmployees().get(i).toString());
        }

        dept.readManager();
        dept1.readManager();
        System.out.println("\n" + dept.getDepartment_name());
        for (int i = 0; i < dept.getListManager().size(); i++) {
            Employee man = dept.getListManager().get(i);
            System.out.println("Manager = " + man.toString());
        }
        System.out.println("\n" + dept1.getDepartment_name());
        for (int i = 0; i < dept1.getListManager().size(); i++) {
            Employee man = dept1.getListManager().get(i);
            System.out.println("Manager = " + man.toString());
        }
    }
}
