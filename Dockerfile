FROM openjdk

COPY ./target/maven-wrapper*.jar /usr/app/dockerDemo.jar

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java","-jar","maven-wrapper.jar"]
