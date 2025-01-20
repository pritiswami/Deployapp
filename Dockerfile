FROM openjdk:17
EXPOSE 9191
WORKDIR /app
COPY target/DeployApp-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/app/DeployApp-0.0.1-SNAPSHOT.jar"]