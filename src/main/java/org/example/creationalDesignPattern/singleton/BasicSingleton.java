package org.example.creationalDesignPattern.singleton;

public class BasicSingleton {
/* we can declare this public and dont need getInstancr() then
* but then it will locad when the class loads not when it's
* requested
* */
  private static final BasicSingleton instance = new BasicSingleton();

  private String s;

  private BasicSingleton() {
   s = "Hello World";
  }

//  must make it public if not we can't access as the instance is 
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
