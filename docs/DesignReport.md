# Design report


## Introduction:

  This report describes the initial design of our implementation of the game tic tac toe.

## Initial design:

* The game will be played with two human players, inputting commands on the same client. 
* The game uses the regular tic tac toe rules, X always begins, three in a row required to win etc .  
* The project will be kept in a source control environment.
* Gradle will be used for running builds, scripts and test.
* Travis will be used for continuous integration.
* All code will be stored on github
* All code will be written using TestDriven Development.
* The master branch in the git repository will be protected. All changes must pass unit tests and be reviewed before merging with the master branch. To ensure this pull request will be used.
 
* The program will consist of two layers, a domain layer and  an interface layer. We do not feel that a database layer is necessary due to the fact that we will not be saving any data. A playGame function in domain will oversee the gamePlay and call other functions.
 
### We designed a class diagram with three classes:

  View [class diagram](http://imgur.com/a/d1sg8).  


