# Extend the tomcat docker image
FROM tomcat:9.0
# Copy the app into webapps folder
COPY ./target/azuresample.war /usr/local/tomcat/webapps/
