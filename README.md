# day0
Day 0

This repository is used to host FizzBuzz with Junit testing. Junit allows us to test our application using unit testing. This allows the developer to create test by specifying variables, calling methods, and checking calculations. This is helpful because it allows the developer to test the code without implicitly changing the code. This allows the test to be tested by multiple developers without having to add and remove testing code.

Day 0 also implements archetypes. Maven archetype is defined as an original pattern or model from which other things of the same kind are made. In other words, it is a template for application design. Using archetypes allows the developer to develop applications which follows an industry standard without having to manually set all variables, imports, or other trivial implementations.

Day0 was created using the following maven archetype command:

mvn archetype:generate -DarchetypeGroupId=org.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

Executing this command within the eclipse workspace creates a template which can be used to create a java application and implement Junit testing.
