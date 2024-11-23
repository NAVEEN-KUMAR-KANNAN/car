FROM eclipse-temurin:11
COPY target/car.jar car.jar
CMD [ "java","-jar","car.jar" ]