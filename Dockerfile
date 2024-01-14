FROM bellsoft/liberica-openjre-alpine:17.0.8

# install curl and jq
RUN apk add curl jq

#workspace
WORKDIR /home/selenium-docker

# Add required file to run the test

ADD target/docker-resources     ./
ADD runner.sh              runner.sh


#Start the runner.sh
ENTRYPOINT sh runner.sh

