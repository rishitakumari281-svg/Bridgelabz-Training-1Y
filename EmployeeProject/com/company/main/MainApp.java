package com.company.main;

import com.company.hr.*;          // on-demand import
import com.company.payroll.Payroll;

public class MainApp {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Rishi", "IT", 50000);

        System.out.println("Employee Details:");
        emp.displayEmployee();

        Payroll payroll = new Payroll();
        double bonus = payroll.calculateBonus(emp);

        double finalSalary = emp.getSalary() + bonus;
        emp.setSalary(finalSalary);

        System.out.println("\nAfter 10% Bonus:");
        emp.displayEmployee();
    }
}