FROM maven:3-amazoncorretto-17-debian AS builder

WORKDIR /app

COPY pom.xml ./

COPY src/ ./src/

RUN gradle build --no-daemon -x test

FROM amazoncorretto:17-alpine3.17-jdk

WORKDIR /app

# ENV SPRING_PROFILES_ACTIVE='pdn'

COPY --from=builder /app/build/libs/red-nacional-investigacion-cancer-1.0.0.jar ./red-nacional-investigacion-cancer-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "red-nacional-investigacion-cancer-1.0.0.jar"]