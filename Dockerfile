FROM eclipse-temurin:17
COPY target/devjen.jar devopjen.jar
CMD [ "java","-jar","devopjen.jar" ]
