FROM openjdk
COPY ./target/MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "MMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]

