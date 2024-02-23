FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER Lion Li

RUN mkdir -p /mikgeek/gen/logs

WORKDIR /mikgeek/gen

ENV SERVER_PORT=9202

EXPOSE ${SERVER_PORT}

ADD ./target/mikgeek-gen.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dserver.port=${SERVER_PORT}", "-jar", "app.jar"]
