#!/bin/bash

set -xe

VERSION=$(cat version/number)

cd pre-release/
echo "saving file with version number: $VERSION"
cp $CF_APP-*.jar ../releases/$CF_APP-$VERSION.jar
