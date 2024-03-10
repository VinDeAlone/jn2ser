

FROM openjdk:17-alpine
WORKDIR /opt
ENV port=8042
EXPOSE 8042
COPY /target/demoServiceJMySQL.jar /opt/demoServiceJMySQL.jar
CMD [ "java", "-jar", "/opt/demoServiceJMySQL.jar" ]