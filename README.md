# CDL programming exercise

This small Spring Boot application is the first attempt at a REST service that retrieves information about an accordion inventory. 
An application that consumes this service can get a list of all the accordions, or filter it to see only accordions that match specific criteria that are ANDed together. For example a user can see all the accordions that have a "musette" tuning AND that have 41 treble keys.

However, a brief examination of the code reveals that it is a crude prototype and needs considerable refactoring before 
you can start the work of making any functional changes. It also needs improvements to make it testable, readable, and well documented.

Your task is to clean up and restructure the code, so that it will be readable, testable, and scalable, following normal conventions, as you or your teammates starts to add new functionality.

Once you have refactored, you can the code so that the values passed in the HTTP query are validated, and alter the method of filtering based on the user criteria so that it is scalable to a longer list of criteria (remembering that the list of filter criteria will grow over time).

If there is refactoring that you would like to postpone until later, document using TODO comments in the code.




