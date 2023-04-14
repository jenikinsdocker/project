FROM openjdk:17
ADD target/springboot-test.jar springboot-test.jar
EXPOSE 8081
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar springboot-test.jar"]