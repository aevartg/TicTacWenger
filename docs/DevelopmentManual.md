# Development manual

## Introduction:

This manual is intended for developers so that they will be able to start working productively as soon as possible. Following these instructions will make your machine ready to start commiting code into the repository. 
## To be able to build and commit to the project TicTacWenger the following has to be installed and running on the machine:

* [Java](https://www.java.com/en/download/): Java JDK8 to be installed to compile and build the project.
	* "`$ sudo apt-get install oracle-java8-installer`" 
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git): Is a version control system. The game is hosted in the github repository "`https://github.com/aevartg/TicTacWenger`"
	* "`sudo apt-get install git`" on ubuntu
* [Gradle](https://gradle.org/gradle-download/?_ga=1.199802794.561824733.1477161886): Is a build automation system to simplify the build process.
	* [For ubuntu](https://gradle.org/gradle-download/)
* [Pandoc](http://pandoc.org/installing.html): This needs to be installed to convert markdown into html for the reports/manuals.
	* "`$ sudo apt-get install pandoc`" on ubuntu


## Get Going. 
 
1. Start by launching your preferred command line client on your machine.

2. Clone the repository onto your computer
* Navigate to your desire location and clone the repository using the command "`git clone git@github.com:aevartg/TicTacWenger.git`".

3. Now you can start editing the code! You can use the following commands in the root of the repository.
* "`sh ./bin/compile`" Compiles all the java code in the repository
* "`sh ./bin/unit_test`" Runs all the unit test from the test directory
* "`sh ./bin/clean`" Deletes the executeable jar file for the program if it exists
* "`sh ./bin/package`" Builds the program and creates executable files
* "`sh ./bin/deploy`"  Is the main build script, cleans up the executable jar file , builds the program , runs the unit tests and creates javadoc documentation for the code. It also converts all the markdown reports into html and places the executeable jar file in the /tmp file in the root of the operating system.      


