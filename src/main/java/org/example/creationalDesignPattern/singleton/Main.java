package org.example.creationalDesignPattern.singleton;

public class Main {

  public static void main(String[] args) {
    /*
     * when the instance is private
     * */
    BasicSingleton basicSingleton = BasicSingleton.getInstance();

    System.out.println(basicSingleton.getS());
    basicSingleton.setS("Hello");
    System.out.println(basicSingleton.getS());
/*
* when the instance is public
* */
//    System.out.println(BasicSingleton.instance.getS());
//    BasicSingleton.instance.setS("s");
//    System.out.println(BasicSingleton.instance.getS());
  }
}
