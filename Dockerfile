FROM openjdk:17
EXPOSE 8080
ADD target/springboot-dev-integration.jar springboot-dev-integration.jar
ENTRYPOINT ["java","-jar","/springboot-dev-integration"]
