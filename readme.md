deors-plugins-sonarqube-idemetadata
===================================

SonarQube IDE Metadata plugin gathers and displays information from IDE metadata files,
including project type (based on natures/facets) and declared dependencies.

Introduction
------------

This is an example of a simple SonarQube plug-in that declares a few metrics at the
project level containing information extracted from IDE Metadata configuration files
(currently only Eclipse IDE is supported but other extractors can be easily created).

To install this plug-in, follow these steps:

A) Create the plug-in binary with this command:

    mvn clean package

B) Copy the file to your SonarQube installation:

    copy target/deors-plugins-sonarqube-idemetadata-1.0.jar $SONARQUBE_HOME/extensions/plugins

C) Restart SonarQube

D) Add the widget to a dashboard

E) Analyse a project and enjoy!
