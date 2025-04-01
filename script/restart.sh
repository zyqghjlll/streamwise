#!/bin/bash
echo "Restarting all streamwise stack..."
docker-compose down && docker-compose up -d --build