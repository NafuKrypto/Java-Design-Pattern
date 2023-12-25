package solveproblem.singleton;

public class Main {

  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    logger.addLogMessages(LogLevel.INFO,"what the hell man");
    logger.addLogMessages(LogLevel.ERROR,"This is not working");
    logger.addLogMessages(LogLevel.WARNING,"Leave or you will die");
    
    System.out.println(logger.getLogMessages());
    
//     or nice way
    
    for(String message: logger.getLogMessages()){
      System.out.println(message);
    }
  }
}
