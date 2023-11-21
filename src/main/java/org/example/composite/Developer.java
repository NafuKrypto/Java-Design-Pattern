package org.example.composite;

public class Developer implements Employee{
    private int empId;
    private String name;
    private String age;
    private  String gender;

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

    public Developer(int empId, String name, String age, String gender) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Developer() {
    }

    @Override
    public void shoEmployeeDetails() {
    System.out.println("Developer: "+empId+" "+name);
    }
}
