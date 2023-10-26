package org.example.composite;

public class Developer implements Employee{
    private int empId;
    private String name;
    private String age;
    private  String gender;

    public Developer(int empId, String name, String age, String gender) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void shoEmployeeDetails() {
    System.out.println("Developer: "+empId+" "+name);
    }
}
