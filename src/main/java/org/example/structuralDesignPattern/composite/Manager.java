package org.example.structuralDesignPattern.composite;

public class Manager implements Employee{
    private int empId;
    private String name;
    private String age;
    private Developer company;
    public Manager(int empId, String name, String age, String gender) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private  String gender;

    public Developer getCompany() {
        return company;
    }

    public void setCompany(Developer company) {
        this.company = company;
    }

    public Manager() {
        
    }

    @Override
    public void shoEmployeeDetails() {
        System.out.println("Manager: "+empId+" "+name);
    }
}
