# Error handling with Spring  - Simple Examples
The project should be seen as an example that strives to illustrate some ways of error handling with Spring. 
The examples cover the use of a custom error page (Spring MVC doesn't offer a default (fall-back) error page 
and at startup Spring Boot tries to find a mapping for "/error"), controller-based error handling (illustration with @ExceptionHandler & @ResponseStatus annotations),
global application exception handling (classes annotated with @ControllerAdvice annotation), custom error objects (in the case of rest)

## Getting Started
* [Spring Initializer](https://start.spring.io/) - Spring Initializer is used for initial setup of the project

### Prerequisites

* Java 11

## Built With

* [Spring](https://spring.io/) - The web framework used is Spring
* [Maven](https://maven.apache.org/) - Dependency Management

## Useful Tools

* Postman 

## Author

* **Eve Lin**


## Acknowledgments

* Part of the Java Web course (Software Engineering Program)