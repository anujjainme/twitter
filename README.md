# Getting Started

### To start the service
* docker build -t twitter .
* docker run -d -p 8080:8080 twitter

### sample apis to hit
* http://localhost:8080/users/following?id=1
* http://localhost:8080/users/tweets?id=1


### to see or edit data
http://localhost:8080/h2-console
username sa
password password
