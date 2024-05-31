package org.example;

import org.example.enums.Plan;


public class Main {
    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(11,"a okul", Plan.BASIC);
        Healthplan healthplan1 = new Healthplan(12,"b okul", Plan.MEDIUMS);
        System.out.println(healthplan1.toString());
        System.out.println(healthplan.toString());

        String[] healtPlans = new String[3];
        healtPlans[0] = healthplan.getName();
        healtPlans[1] = healthplan1.getName();
        Employee employee = new Employee(1,"Hilal Bilun Kara","hilal@hotmail.com","123456",healtPlans);
        employee.addHealthplan(2,"c okul");
        employee.addHealthplan(2,"e okul");
        employee.addHealthplan(-1,"d okul");
        employee.addHealthplan(0,"f okul");
        employee.addHealthplan(8,"g okul");
        System.out.println(employee.toString());

        System.out.println("*******");

        String[] developerNames = new String[4];
        Company company = new Company(1,"İclal",100000, developerNames);
        developerNames[0] = employee.getFullName();
        company.addEmployee(1,"Gizem ");
        company.addEmployee(3,"Gökçen ");
        System.out.println(company.toString());
        }
}