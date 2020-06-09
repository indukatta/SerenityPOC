## The visachecks project

### The project directory structure
```Gherkin
src
  + test
    + java                          
      + visachecks                  Test runners and supporting code
        + pages
        + stepdefinitions
        + steps
        CucumberTestRunner.java           
    + resources
      + features                    Feature files
        + api
        + ui
      + webdriver                   Bundled webdriver binaries
```

### Tool set used:
```
    o	Serenity
    o	Cucumber
    o	Java
    o	Junit
    o	RestAssured
    o	Maven
    o	Intellij IDE
```

### Test Execution : 
Option 1: Run command "mvn clean verify". This will generate Serenity report file 

The test results will be recorded in the `target/site/serenity/index.html` directory file.

Option 2: Run the `CucumberTestRunner` test runner class

### Scenario coverage :

    • Confirm whether a visa is required to visit the UK for:
    
        o	Japan and Study
        o	Japan and Tourism
        o	Russia and Tourism
        
    • Query a postcode and receive a 200 response

## Serenity configuration file:
Serenity uses the `serenity.conf` file in the `src/test/resources` directory to configure test execution options.  

Ex: webdrivers, headless mode, screenshots, environment urls 

