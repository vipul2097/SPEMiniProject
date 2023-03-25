FROM openjdk:11
COPY ./target/MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]

