#!/bin/bash

#java -cp ./ -Dcgi.content_type=$CONTENT_TYPE -Dcgi.content_length=$CONTENT_LENGTH -Dcgi.query_string=$QUERY_STRING -Dcgi.server_name=$SERVER_NAME -Dcgi.script_name=$SCRIPT_NAME -Dcgi.path_info=$PATH_INFO CgiTest
QUERY_STRING=`echo $QUERY_STRING | cut -d\& -f1`
java -jar -Dquery_string=$QUERY_STRING CarRentalWeb-0.0.1.jar