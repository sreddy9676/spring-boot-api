## Setting Up this project on a VM

### Build Application
  ```
    mvn clean package
    
  ```
  This generates jar file (fat jar)
  
 
### Run this application

```
  Install Java 1.8
  
  java -jar jarfile-name

```

### Test application

Open browser and try
http://localhost:8080/welcome
http://localhost:8080/employees

### How to post data into mongo db

curl -H "Content-Type: application/json" -X POST --data '{"id": "1","name": "Hari"}'  http://<your-ip>:8080/employee
  
curl -H "Content-Type: application/json" -X POST --data '{"id": "2","name": "Muni"}'  http://<your-ip>:8080/employee

curl -H "Content-Type: application/json" -X POST --data '{"id": "3","name": "Siva"}'  http://<your-ip>:8080/employee

### Fetch data from emp-api

http://<your-ip>:8080/employees












