CacherPoc
=========
This sample repository contains a simple web application called CacherPoc and 4 satellite EJB applications (that are injected in the web project). CacherPoc listens for HTTP requests sent to <host>:<port>/CacherPoc[/*], and responds with information about the request and the server.

Running in Eclipse

Download and install Eclipse.
Clone this repository.
Import the CacherPoc contents into Eclipse using File -> Import -> Maven -> Existing Maven Projects option.
Deploy the applications on your web application server. Right click on the CacherPoc web project and select Run As -> Run on Server option. 
Go to: http://localhost:8080/CacherPoc
Running with Maven

This project can be build with Apache Maven and deployed on any web application server.



