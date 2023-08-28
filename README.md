#hepsiburada-mobile used tools: Java, Appium 2.0, Maven, Testng, Extent Reports, Log4j

I used Java, Appium and Testng for my test scripts, Extent Reports for reporting, Log4j for logging.

For parallel running: You should change suiteXmlFile at pom.xml below of surefire plugin or you can directly run ParallelTestSeuite.xml file

You can change the device and browser from testng.xml files

Requirements to run the project:
* Install appium 2.0 using this command to your terminal: npm install -g appium@next
* Check appium version using this command: appium -v
* Install Appium drivers using these commands: appium driver install xcuitest, appium driver install uiautomator2
* List appium drivers using this command to see the drivers: appium driver list
* Give ANDROID_HOME and JAVA_HOME paths to server using this command: source ~/.bash_profile
* Install element-wait plugin using this command: appium plugin install element-wait
* Start Appium server using this command: appium --use-plugins element-wait
* Create the emulator with these features: Pixel API 29, version 10.0
* You need to install apk to the emulator

Script for running the project: mvn clean test