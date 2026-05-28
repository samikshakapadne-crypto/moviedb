FROM eclipse-temurin:17

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw clean package -Dmaven.test.skip=true

EXPOSE 8080

CMD ["java", "-jar", "target/moviedb-0.0.1-SNAPSHOT.jar"]