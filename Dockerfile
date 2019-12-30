FROM openjdk:8
VOLUME /tmp
EXPOSE 8090
ADD ./target/apiGateway-0.0.1-SNAPSHOT.jar api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]