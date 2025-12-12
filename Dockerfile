# Base image con Eclipse Temurin JDK 17
FROM eclipse-temurin:17-jdk

# Cartella di lavoro nel container
WORKDIR /app

# Copia il JAR prodotto da Maven
COPY target/challenge-0.0.1-SNAPSHOT.jar app.jar

# Esegui l'app
ENTRYPOINT ["java", "-jar", "app.jar"]

