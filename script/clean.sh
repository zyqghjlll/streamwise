#!/bin/bash
echo "Stopping and removing containers, volumes, networks..."
docker-compose down -v --remove-orphans

#
#echo "Stopping all running containers..."
## shellcheck disable=SC2046
#docker stop $(docker ps -q)
#
#echo "Removing all containers..."
## shellcheck disable=SC2046
#docker rm $(docker ps -aq)
#
#echo "Removing unused networks..."
#docker network prune -f
#
#echo "Removing dangling volumes..."
#docker volume prune -f
#
#echo "Removing unused images..."
#docker image prune -a -f
#
#echo "Cleaning build cache..."
#docker builder prune -f
#
#echo "Docker cleanup complete."