FROM openjdk:17
ADD springboot-dev-integration.jar springboot-dev-integration.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar ispringboot-dev-integration.jar"]