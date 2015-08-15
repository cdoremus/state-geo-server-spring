# state-geo-server-spring

#### This is the server side component of the state-geo app, designed for learning and testing knowledge of state geography.

This project uses Spring Boot and Spring Data MongoDB to build a RESTful interface to a MongoDB database called 'states'.

This project is designed to run as the back-end for an AngularJS 1.x client in the state-geo-server-angular project. 
To run the application go to the client project and use the gulp command to build the Angular project and then come back to
this project and start the Jetty server using the gradle task bootRun. 

The application's URL is http://localhost:8080/. 