# BackendSpringbootNew
This is simple backend springboot app of department with AWS MySQL RDS
Dockerizing Springboot Backend app with AWS MySQL RDS
Step 1: Get the code from github repository
By command
$ git clone 
We have this Springboot backend app code:
![Picture1](https://user-images.githubusercontent.com/117855172/225542079-fa0e8f65-70e6-4239-bb95-de98dc92dd82.jpg)

Step 2: Create AWS MySQL RDS
We have created AWS MySQL RDS:  
![Picture2-1](https://user-images.githubusercontent.com/117855172/225552182-c15a0012-1993-46e9-b734-c49dad2af03b.jpg)
![Picture2-2](https://user-images.githubusercontent.com/117855172/225552281-670f9765-1c91-45c6-94f4-8d82324657a9.png)

Created database with following settings
![Picture2-3](https://user-images.githubusercontent.com/117855172/225552321-4810b484-5da5-4919-8c18-3f25333c4dd0.jpg)
With username: root
Password: <enter-your-password>
Once RDS is up and running
Step 3: Configure this database details in our project code’s “backend-app/src/main/resources/application.properties” file:
And also we have configured Port: 8082 here
![Picture3-1](https://user-images.githubusercontent.com/117855172/225552466-1093d7d9-e590-472e-b636-5300d18bbdbf.jpg)
 
Like shown in above image





Step 4: Build the code and create jar file
Now build the project using maven clean and install
![Picture4-1](https://user-images.githubusercontent.com/117855172/225552531-41c5d834-a855-452b-83de-095dabe69075.jpg)
This will create a jar file of our project in Backend-app/target/BackendSpringbootNew-0.0.1-Snapshot.jar

In pom.xml our jar files nomenclature details are given. It will create a jar file with name given here.
![Picture4-2](https://user-images.githubusercontent.com/117855172/225552704-d9d60fc4-3cc4-4f31-89c3-13cd4be3b286.jpg)

Step 5:Create Dockerfile for our app in app’s main folder
![Picture5-1](https://user-images.githubusercontent.com/117855172/225552724-21a4b17c-3d1f-4d42-8399-5e25f1476a7d.jpg)
![Picture5-2](https://user-images.githubusercontent.com/117855172/225552750-fa968eb8-dbd5-45f1-adaa-ad4b14630982.jpg)

 
Step 6: Now build the Dockerfile to create an image With command
$ docker build -t springboot-image .
This will create image with name springboot-image
![Picture6](https://user-images.githubusercontent.com/117855172/225552791-9b2228ea-408c-4e9f-b063-5ebadad85246.jpg)
 
Step 7: Run image to create conainer
$ docker run --name springboot-container -p 8082:8082 springboot-image:latest
This will create a container with name springboot-container
![Picture7](https://user-images.githubusercontent.com/117855172/225552835-611a7a4a-f34a-41fa-a6a6-b3d110521f35.jpg)
 
Step 8: Verify output
App is running in container
![Picture8-1](https://user-images.githubusercontent.com/117855172/225552863-1598f7d7-dbea-4e6e-809c-25652347b83e.jpg)
 
Now check for output in browser by connecting to http://localhost:8082/
![Picture8-2](https://user-images.githubusercontent.com/117855172/225552891-f6a9eda8-ba86-45ab-a29e-7c8e46d3c821.jpg)
 
Our app running
To check data entries into the database connect with postman app
![Picture8-3](https://user-images.githubusercontent.com/117855172/225552937-dfa071fb-f07a-4c04-a290-f9b904ef5923.jpg)
 
We are getting data from database
![Picture8-4](https://user-images.githubusercontent.com/117855172/225552971-df8c7b8e-9f07-42b5-8736-0f0061b234ab.jpg)
 
We can also put data into database.
This means we have deployed our app successfully with docker.


