FROM openjdk:17
EXPOSE 8080
ADD target/springboot-test.jar springboot-test.jar
ENTRYPOINT ["java","-jar","/springboot-test.jar springboot-test.jar"]