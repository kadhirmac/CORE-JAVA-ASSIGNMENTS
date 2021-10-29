package com.company;

public class Main {


    public static void main(String[] args) {
        Labour d1=new Labour(1,"X" ,20000);
        Labour d2=new Labour(2,"Y" ,15000);
        Manager m2=new Manager(2,"Z" ,50000);

        System.out.println("Name of Labour:" +d1.getEmployeeName()+"---"+"Salary:"+d1.getSalary());
        System.out.println("Name of Employee:" +d2.getEmployeeName()+"---"+"Salary:"+d2.getSalary());
        System.out.println("Name of Manager:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
    }
}