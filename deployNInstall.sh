#!/bin/bash
# Run ./gradlew clean
# ./gradlew clean

# Run ./gradlew assembleDebug
# ./gradlew assembleDebug

# If successful, install app on phone
adb install -r app/build/outputs/apk/debug/app-debug.apk
