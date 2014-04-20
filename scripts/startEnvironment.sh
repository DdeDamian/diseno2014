#!/bin/bash

sudo sh /var/lib/apache-tomcat-6.0.39/bin/startup.sh &

java -classpath ./war/WEB-INF/lib/hsqldb.jar org.hsqldb.Server -database test &
