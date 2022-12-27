FROM maven:latest as builder
WORKDIR /usr/local/
COPY pom.xml /usr/local/pom.xml
COPY src  /usr/local/src
RUN cd /usr/local/
RUN mvn clean install

FROM openjdk:17-oracle
COPY   --from=builder /usr/local/redo/server/target/cicdpractice-0.0.1-SNAPSHOT.jar product.jar
ENTRYPOINT ["java","-jar","product.jar"]