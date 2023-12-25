package org.example.creationalDesignPattern.singleton;

public class Main {

  public static void main(String[] args) {
    BasicSingleton basicSingleton = BasicSingleton.getInstance();
    
    System.out.println(basicSingleton.getS());
    basicSingleton.setS("Hello");
    System.out.println(basicSingleton.getS());
  }
}
