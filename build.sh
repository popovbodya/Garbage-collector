#!/bin/bash

# Copy mock google-services file
echo "Using mock google-services.json"
cp scripts/mock/mock-google-services.json app/google-services.json

# Build and test
./gradlew clean assembleDebug test