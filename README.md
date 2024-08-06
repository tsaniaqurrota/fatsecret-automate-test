# FatSecret Automate Test

This repository contains automated tests for the FatSecret Android application using Katalon Studio. This project is part of the Verification and Validation course.

**Test Cases : [FatSecret TC](https://docs.google.com/spreadsheets/d/1RuvDAix3R9fAf9lySlgYW_ELf7H50cw_RBC1x1qpjUo/edit?gid=0#gid=0)**

**FatSecret application ID : com.fatsecret.android**

## Prerequisites

### 1. Installation

- **[Katalon Studio](https://katalon.com/download)**
  
- **[Vysor](https://www.vysor.io/)**
  
- **[Node.js](https://nodejs.org/en)**
  
- **Appium**  
Install Appium via npm:
`` npm install -g appium ``

- **UiAutomator2 Driver**
Install the UiAutomator2 driver:
``appium driver install uiautomator2``

###  2. Configuration

**Setting up the device**
1. Open your device settings.
2. Navigate to Settings > About > Software Information.
3. Click Build Number 7 times to enable Developer Options.
4. Go to System > Developer Options and enable USB Debugging.

**Vysor**
1. Connect your Android device to your computer via USB.
2. Launch Vysor and connect to your Android device.
