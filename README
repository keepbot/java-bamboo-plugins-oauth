# OAuth plugin for Atlassian Bamboo

## Install Atlassian SDK
* Install JDK 8
* Set `JAVA_HOME`
* Download [latest SDK](https://marketplace.atlassian.com/download/plugins/atlassian-plugin-sdk-windows)
* Install 
* Check `atlas-version`

## IntelliJ IDEA
* Import project
* navigate to **pom.xml** file
* Next-Next-Finish

## Shared Access Layer library

* Add to pom.xml dependency:
```xml
<dependency>
	<groupId>com.atlassian.sal</groupId>
	<artifactId>sal-api</artifactId>
	<version>2.0.17</version>
	<scope>provided</scope> <!-- Uses the application's SAL instead of bundling it into the plugin. -->
</dependency>
```

## ATLAS cheatsheet
* `atlas-run`   -- installs this plugin into the product and starts it on localhost
* `atlas-debug` -- same as atlas-run, but allows a debugger to attach at port 5005
* `atlas-cli`   -- after atlas-run or atlas-debug, opens a Maven command line window:
                 - 'pi' reinstalls the plugin into the running product instance
* `atlas-help`  -- prints description for all commands in the SDK

## Atlassian Documentation
Full documentation is always available [here](https://developer.atlassian.com/display/DOCS/Introduction+to+the+Atlassian+Plugin+SDK)
