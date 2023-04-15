FROM openjdk:17
EXPOSE 8080
ADD target/java-docker-jenkins-integration.jar java-docker-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/java-docker-jenkins-integration"]
