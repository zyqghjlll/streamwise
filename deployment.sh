#!/bin/bash
./mvnw clean package -DskipTests
docker build -t streamwise-app -f Dockerfile .
docker-compose -f compose.app.yaml up -d
