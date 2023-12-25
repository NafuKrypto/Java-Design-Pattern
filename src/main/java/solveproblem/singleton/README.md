### Problem:
You are tasked with implementing a logging system for a software application. The logging system should be designed as a singleton to ensure that there is only one instance of the logger throughout the application. The logger should provide methods to log messages at different log levels (e.g., INFO, WARNING, ERROR) and store these messages for later retrieval.

Design a Java singleton class for the logging system, considering the following requirements:

The logger should have a private collection to store log messages.
Provide a method to add a log message along with the log level.
Provide a method to retrieve all log messages.
Ensure thread safety for the singleton instance, especially when adding log messages from multiple threads.
Demonstrate the usage of the logger in a simple Java program.