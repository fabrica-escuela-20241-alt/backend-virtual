FROM maven:3-amazoncorretto-17-debian AS builder

WORKDIR /app

COPY pom.xml ./

COPY src/ ./src/

RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine3.17-jdk

WORKDIR /app

COPY --from=builder /app/target/backend-virtual-1.0.0.jar ./backend-virtual-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "backend-virtual-1.0.0.jar"]