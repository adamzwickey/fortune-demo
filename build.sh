#!/usr/bin/env bash

docker build -t azwickey/fortune-demo .
docker push azwickey/fortune-demo:latest
