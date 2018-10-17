# CDL programming exercise

This small application is the first attempt at a command-line service that retrieves information about an accordion inventory. An application can get a list of all the accordions available, or filter the list to see only accordions that match a specific criterion (tuning).

A brief examination of the code reveals that it is a crude prototype and needs considerable refactoring before you can start the work of making any functional changes.

Your first task is to clean up and restructure the code, so that it will be readable, testable, and scalable, following predictable conventions, so that you can start moving forward with development of a production application.

After you have completed the refactoring, start thinking about what new functionality would be useful. If you have time to implement the functionality, great, but if you don't have time, you can create stub classes or methods with comments indicating how you would like them to work. Or use some other method to indicate how you would implement this functionality.

Keep in mind that to actually build a production application would take a lot of time, so that is NOT an expectation.

The exercise uses Java 8 and expects that your system will have its JAVA_HOME environment variable set. It includes a Maven wrapper, so you do not need to have Maven installed on your system to run the project.

The project is run using the Maven exec plugin. To see a list of all the accordions, you can use the command:

./mvnw exec:java

Or, you can pass a single argument to filter the accordion list by tuning, for example:

./mvnw exec:java -Dexec.args="musette"