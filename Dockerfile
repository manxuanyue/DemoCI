FROM caiyun.heyteago.com/library/openjdk:8u151-alpine3.7

COPY target/democi.jar  /usr/src/myapp/

WORKDIR /usr/src/myapp/
RUN ls /usr/src/myapp
ENTRYPOINT java -jar democi.jar
EXPOSE 8080
