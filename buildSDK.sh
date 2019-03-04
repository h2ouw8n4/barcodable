#!/usr/bin/env bash
export openAPISpec="barcodableOpenAPI.yaml"
rm -rf ./sdk
mkdir -p ./sdk
openapi-generator list -s | tr ',' '\n' | while read -r line; do mkdir -p ./sdk/"$line" && npx openapi-generator generate -i ./"$openAPISpec" -o ./sdk/"$line" -g "$line"; done
find . -name "git_push.sh" -type f -delete