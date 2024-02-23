FROM openjdk
LABEL maintainer = "abc@mail.com"
EXPOSE 8092
WORKDIR /app
COPY target/docker-demo.jar /app/docker-demo.jar
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]
