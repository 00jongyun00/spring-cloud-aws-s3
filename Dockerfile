FROM openjdk:11
ARG JAR_FILE=build/libs/aws-s3-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} aws-s3-service.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod", "/aws-s3-service.jar"]
EXPOSE 60010