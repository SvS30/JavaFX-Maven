# JavaFX-Maven

Proyecto de Maven para crear un archetype para aplicaciones JavaFX.

### Crear el proyecto
Para crear el proyecto base, se utilizo un Maven Archetype de [openjfx](https://openjfx.io/openjfx-docs/#maven). Este Arquetype genera un proyecto de JavaFX con el JDK que se le indique en `-Djavafx-version`
```
mvn archetype:generate -DgroupId=com.company -DartifactId=name-app -Dversion=1.0.0 -DarchetypeGroupId=org.openjfx -DarchetypeArtifactId=javafx-archetype-fxml -DarchetypeVersion=0.0.3 -Djavafx-version=11
```