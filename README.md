Archived Project
================

This project is no longer maintained and has thus been archived. If you're interested in new versions of this library, it has been renamed JButler and the latest version is [hosted and maintained by LabES](https://gitlab.labes.inf.ufes.br/labes/jbutler).

Nemo Utilities
==============

This repository is composed of projects that contain utility classes and small frameworks that might be useful for other projects at Nemo, especially ones based on Java standards for the Web. The code is available under the [GNU Public License, version 2 license](https://github.com/nemo-ufes/nemo-utils/blob/master/LICENSE):

* _nemo-utils-java_: for generic Java projects;
* _nemo-utils-jee-wp_: for Java EE, Web Profile projects;
* _nemo-utils-jee-full_: for Java EE, Full Profile projects.

The projects are managed using [Maven2](http://maven.apache.org) and are published in the Nemo Maven2 repository. To set one of the above projects as a Maven2 dependency, add the following repository to your project's `pom.xml`

```xml
<repository>
	<releases>
		<enabled>true</enabled>
		<updatePolicy>always</updatePolicy>
		<checksumPolicy>fail</checksumPolicy>
	</releases>
	<id>br.ufes.inf.nemo</id>
	<name>Nemo Maven Repository</name>
	<url>http://dev.nemo.inf.ufes.br/maven2</url>
	<layout>default</layout>
</repository>
```

Then you can define one of the projects as a dependency, e.g.:

```xml
<dependency>
	<groupId>br.ufes.inf.nemo</groupId>
	<artifactId>nemo-utils-jee-wp</artifactId>
	<version>1.1</version>
</dependency>
```
