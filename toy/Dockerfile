FROM openjdk:8-alpine

COPY target/uberjar/toy.jar /toy/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/toy/app.jar"]
