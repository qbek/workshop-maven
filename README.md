# workshop-maven
Training materials for "Maven for QA tutorial"


# Sections (git tags)

+ 01-start
+ 02-test_execution
+ 03-profiles
+ 04-system_properties
+ 05-gradle-intro
+ 06_gradle-tasks


# 01-start

+ project structure (dirs and pom)
  + src/main/
  + src/test/
  + target/
  + pom.xml structure
+ dependencies and repository hierarchy
  + local repository (~/.m2)
  + remote repositories (~/.m2/settings.xml)
  + http://mvnrepository.com
+ maven phases
  + validate
  + compile
  + test
  + package
  + verify
  + install
  + deploy
  + clean

# 02-test_execution

+ unit tests -> surefire
+ integration tests -> failsafe
+ includes/excludes
+ skipTests (cmd line: `-DskipTests`)
+ testFailureIgnore
+ cmd line: `mvn test -Dtest=<className>#<testName>`

# 03-profiles

+ properties, plugins... etc...
+ profile execution `mvn verify -P<profileName>`
+ default profile

```xml
    <activation>
      <activeByDefault>true</activeByDefault>
    </activation>
```

# 04-system_properties

+ pom level configuration
+ cmd line `mvn verify -D<key>=<value>`


# 05-gradle-intro

+ project structure
  + settings.gradle / build.gradle  
  + src / test directories https://docs.gradle.org/current/userguide/java_plugin.html
  + build directory
+ plugins: java, maven, groovy....
+ gradle wrapper
+ test execution

# 06_gradle-tasks

+ custom tasks
+ configuration phase
+ doFirst, doLast
+ dependsOn
