FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/SimpleAPI-0.0.1-SNAPSHOT.jar
ARG YML_FILE=SimpleAPI.yml
COPY ${JAR_FILE} app.jar
COPY ${YML_FILE} SimpleAPI.yml
ENTRYPOINT ["sh","-c","java ${JAVA_OPTS} -jar /app.jar ${0} ${@}"]