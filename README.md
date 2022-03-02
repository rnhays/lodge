# lodge

For the JDK need an Enviorment variable named JAVA_HOME pointed to the folder the JDK is deployed. Version 11 for this project

execute build: gradlew clean build jar

Execute Jar file: java -jar C:\DEV\workspace\lodge\build\libs\lodge-0.0.1-SNAPSHOT.jar

Hello world rest test http://localhost:8080/greeting
Output:
{"id":1,"content":"Hello, World!"}

Four levels of the application
Controller, Service, Repository, Model

view h2 console: http://localhost:8080/h2-console
datasource is testdb

User Stories:

1. Admin be able to Add, Edit, Delete a Person
2. User able to see all persons
3. User to see persons by ranks, lodge, Order by last name, City
4. Admin be able to Add, Edit, Delete Lodges
5. Users able to view lodges
6. Admin able to assign Users to a lodge
7. Admin be able to CRUD phone numbers, addresses
8. Other Entities. Emails, communications, officers, reciepts, disbursments, 