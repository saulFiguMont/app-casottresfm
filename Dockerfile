FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:go-offline
COPY src ./src
RUN mvn -B package

# Etapa 2: imagen final ligera, solo con Java
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/app-caso2-1.0.0.jar app.jar
CMD ["java", "-jar", "app.jar"]