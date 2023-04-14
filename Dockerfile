FROM openjdk:17
EXPOSE 8080
ADD target/docker-dev-integration.jar docker-dev-integration.jar
ENTRYPOINT ["java","-jar","/docker-dev-integration"]
