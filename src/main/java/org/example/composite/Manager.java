package org.example.composite;

public class Manager implements Employee{
    private int empId;
    private String name;
    private String age;

    public Manager(int empId, String name, String age, String gender) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private  String gender;
    @Override
    public void shoEmployeeDetails() {
        System.out.println("Manager: "+empId+" "+name);
    }
}
