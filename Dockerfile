FROM openjdk
COPY ./target/MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
<<<<<<< HEAD
CMD ["java", "-jar", "MMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
=======
CMD ["java", "-jar", "MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
>>>>>>> origin/master
