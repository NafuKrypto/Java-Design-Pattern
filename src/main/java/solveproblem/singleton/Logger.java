package solveproblem.singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {

  private static final Logger instance = new Logger();

  private List<String> logMessages;

  public Logger() {
    logMessages = new ArrayList<>();
  }

  public void addLogMessages(LogLevel logLevel, String message) {
    String formattedMessage = "[ " + logLevel + " ] " + message;
    logMessages.add(formattedMessage);
  }

  public List<String> getLogMessages() {
    return logMessages;
  }

  public static Logger getInstance() {
    return instance;
  }
}
