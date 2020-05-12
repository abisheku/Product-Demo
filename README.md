# Sample Rest Application For Demonstration

## Software Requirements
- Java
- Tomcat (https://mirrors.estointernet.in/apache/tomcat/tomcat-9/v9.0.35/bin/apache-tomcat-9.0.35-windows-x64.zip)
- Git
- Postman or SOAPUI or curl

## Implementation features
- Provides two different Endpoints with GET protocol
- Basic Authentication enabled on two different URLs

## API Endpoint
- GET /ProductDemo/api/getProductDetails
- GET /ProductDemo/api/getConfigDetails

## Step By Step Build Instructions
- Install java
- Install Git
- Clone this git repo
```shell
git clone https://github.com/abisheku/Product-Demo.git
```
- Execute the gradle Command in the cloned repo
```shell
gradlew.bat clean build
```
- war file be generated in the location {Repo}/build/libs

- Download Tomcat from the URL :(https://mirrors.estointernet.in/apache/tomcat/tomcat-9/v9.0.35/bin/apache-tomcat-9.0.35-windows-x64.zip)

- Copy the gradle generated war into the webapps directory
- Navigate to the tomcat's bin folder and run the below command in cmd window
```shell
catalina.bat run
```

## Authentication for the API Endpoint
- GET /ProductDemo/api/getProductDetails
```shell
Username : productAdmin
Password : productAdminPass
```

```shell
GET /ProductDemo/api/getProductDetails HTTP/1.1
Host: localhost:8080
Authorization: Basic cHJvZHVjdEFkbWluOnByb2R1Y3RBZG1pblBhc3M=
```

- GET /ProductDemo/api/getConfigDetails
```shell
Username : configAdmin
Password : configAdminPass
```

```shell
GET /ProductDemo/api/getConfigDetails HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Basic Y29uZmlnQWRtaW46Y29uZmlnQWRtaW5QYXNz
```



