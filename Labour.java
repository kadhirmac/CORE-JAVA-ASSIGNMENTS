package com.company;

public class Labour extends Employee{
    public static final double BONUSPERCENT=0.1;

    public Labour(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    public double getSalary() {

        return salary+salary*BONUSPERCENT;
    }
}
