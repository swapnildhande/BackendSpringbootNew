FROM openjdk:17
WORKDIR /app

COPY target/BackendSpringbootNew-0.0.1-SNAPSHOT.jar /app/BackendSpringbootNew-0.0.1-SNAPSHOT.jar
EXPOSE 8082
CMD ["java", "-jar", "BackendSpringbootNew-0.0.1-SNAPSHOT.jar"]
