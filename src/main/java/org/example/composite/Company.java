package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args){
        
        Developer dev1=new Developer(1,"nafisa","22","female");
        Developer dev2=new Developer(2,"nazia","22","female");

        Manager manager1=new Manager(3,"farhad","42","male");
        Manager manager2=new Manager(4,"farhana","15","female");

        Composite engineer=new Composite();
        engineer.addEmployee(dev1);
        engineer.addEmployee(dev2);

        Composite accDircetory=new Composite();
        accDircetory.addEmployee(manager1);
        accDircetory.addEmployee(manager2);

        Composite directory=new Composite();
        directory.addEmployee(accDircetory);
        directory.addEmployee(accDircetory);

        directory.shoEmployeeDetails();

        List<Integer> availableBooths= new ArrayList<>(5); 
        System.out.println(availableBooths);
        
    }
}
