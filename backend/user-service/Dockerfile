FROM maven:3.9-eclipse-temurin-25 AS builder
WORKDIR /app

COPY pom.xml .
RUN mvn -q dependency:go-offline

COPY src ./src
RUN mvn -q clean package -DskipTests

FROM eclipse-temurin:25-jre AS runtime
WORKDIR /app

COPY --from=builder /app/target/user-service-*.jar app.jar

EXPOSE 8001
ENTRYPOINT ["java", "-jar", "app.jar"]