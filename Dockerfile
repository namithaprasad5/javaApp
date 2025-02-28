# Use official Tomcat as base image
FROM tomcat:9-jdk11

# Set environment variables
ENV CATALINA_HOME=/usr/local/tomcat

# Copy the WAR file to the webapps directory
COPY target/demo.war $CATALINA_HOME/webapps/

# Expose Tomcat's port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
