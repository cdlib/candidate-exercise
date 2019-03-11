# CDL programming exercise

## Introduction

This 2 1/2 hour exercise is designed to give us an understanding of your approach to writing code.  There is no one right answer.  Every candidate will have a different take on the best way to do this exercise.  

In evaluating your answer, we will be looking at two things:
* How you made the code more readable, maintainable, testable and scalable.
* How you added functionality to make the code more useful to users.

While this code is written in Java, this is not a Java test.  In fact, if you would like to rewrite it in Python you are more than welcome to do so.  

If you have questions, please don't hesitate to contact me at judy.dobry@ucop.edu.

**Please leave yourself time to get your files to me before 2 1/2 hours are up.** You can get the code to me in one of two ways:
* Zip up the files and mail them to me at judy.dobry@ucop.edu.
* Put them somewhere where I can easily download them.  Good places include Google Drive, box.net or **your own** Github repository.  If you take this approach, don't forget to send me an email letting me know where you've stored them.

## Exercise
This small application is the first attempt at a command-line service that retrieves information about an accordion inventory. This application can get a list of all the accordions available, or filter the list to see only accordions that match a specific criterion (tuning).


A brief examination of the code reveals that it is a crude prototype and needs considerable refactoring before you can start the work of making any functional changes.

Your first task is to clean up and restructure the code, so that it will be readable, testable, and scalable, following predictable conventions, so that you can start moving forward with development of a production application.

After you have completed the refactoring, start thinking about what new functionality would be useful. If you have time to implement the functionality, great, but if you don't have time, you can create stub classes or methods with comments indicating how you would like them to work. Or use some other method to indicate how you would implement this functionality.

Keep in mind that to actually build a production application would take a lot of time, so that is NOT an expectation.

The exercise uses Java 8 and expects that your system will have its JAVA_HOME environment variable set. 

Before running the project, run compile:

./mvnw compile

To see a list of all the accordions, you can use the command:

./mvnw exec:java

Or, you can pass a single argument to filter the accordion list by tuning, for example:

./mvnw exec:java -Dexec.args="musette"
