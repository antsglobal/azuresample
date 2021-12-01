# Extend the tomcat docker image
FROM tomcat:9.0
# Copy the app into webapps folder
RUN cp ./target/azuresample.war /usr/local/tomcat/webapps/
