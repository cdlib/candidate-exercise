# CDL programming exercise

This small Spring Boot application is the first attempt at a REST service that retrieves information about an accordion inventory. 
An application that consumes this service can get a list of all the accordions, or filter it to see only accordions that match specific criteria that are ANDed together. For example a user can see all the accordions that have a "musette" tuning AND that have 41 treble keys.

However, a brief examination of the code reveals that it is a crude prototype and needs considerable refactoring before 
you can start the work of making any functional changes. It also needs improvements to make it testable, readable, and well documented.

Your first task is to clean up and restructure the code, so that it will be readable, testable, and scalable, following predictable conventions.

If there is refactoring that you would like to postpone until later, document using TODO comments in the code.

Once you have refactored, you can improve the code so that the values passed in the HTTP query are validated, exceptions are handled correctly, and alter the method of filtering based on the filter criteria so that it is scalable.

There is a lot to do, and we don't expect anyone to do everything, but just see how far you can get in the allotted time.
