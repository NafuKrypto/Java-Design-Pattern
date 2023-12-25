package org.example.creationalDesignPattern.singleton;

public class BasicSingleton {

  private static final BasicSingleton instance = new BasicSingleton();

  private String s;

  private BasicSingleton() {
   s = "Hello World";
  }

//  must make them public if not we can't access as the instance is 
  public static BasicSingleton getInstance() {
    return instance;  //A static method can only access static variables
  }

  public void setS(String s) {
    this.s = s;
  }

  public String getS() {
    return s;
  }
}
