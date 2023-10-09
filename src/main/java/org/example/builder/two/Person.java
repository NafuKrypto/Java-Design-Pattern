package org.example.builder.two;

public class Person {
    public  String name;
    public String age;
    public String address;
    public Person(){
    }
    public static class Builder {
        Person person=new Person();
        public Builder setName(String name){
            person.name=name;
            return this;
        }
        public Builder setAge(String age){
            person.age=age;
            return  this;
        }

        public Builder setAddress(String address){
            person.address=address;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
