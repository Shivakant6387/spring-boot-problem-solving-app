FROM openjdk:11
COPY target/spring-boot-problem-solving-application-0.0.1-SNAPSHOT.jar spring-boot-problem-solving-application-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-problem-solving-application-0.0.1-SNAPSHOT.jar"]