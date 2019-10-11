#!/usr/bin/env bash

echo
echo "Archiving Application"

registry=$(jq -r .archive.registry pipeline.json)
repository=$(jq -r .archive.repository pipeline.json)
image="${registry}/${repository}:latest"

docker login \
    -u "saddamkhalil" \
    -p "allahisone" \
    "${registry}"
docker build -t "${image}" .
docker push "${image}"
