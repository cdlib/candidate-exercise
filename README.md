# CDL programming exercise

This small Spring Boot application is the first attempt at a REST service that retrieves information about an accordion inventory. 
An application that consumes this service can get a list of all the accordions, or filter it to see only accordions that match a specific criterion (tuning).
In the future the application will be able to filter the list of accordions based on multiple criteria (such as the number of treble keys AND tuning).

However, a brief examination of the code reveals that it is a crude prototype and needs considerable refactoring before you can start the work of making any functional changes.

Your task is to begin refactoring the code so that you can start moving forward with development of a production web service. Keep in mind that to actually build 
a production web service would take a lot of time, so that is NOT an expectation.

If there is refactoring that you would like to postpone until later, you can document it using TODO comments in the code.

The exercise uses Java 8 and expects that your system will have its JAVA_HOME environment variable set. It includes a Maven wrapper, 
so you do not need to have Maven installed on your system to run project.

