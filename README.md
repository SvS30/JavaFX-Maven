# JavaFX-Maven
Proyecto de Maven para crear un `archetype` para aplicaciones **JavaFX con pruebas**.

### Crear el proyecto
Para crear el proyecto base, se utilizo un Maven Archetype de [openjfx](https://openjfx.io/openjfx-docs/#maven). Este Arquetype genera un proyecto de JavaFX con el JDK que se le indique en `-Djavafx-version`
```
mvn archetype:generate -DgroupId=com.company -DartifactId=name-app -Dversion=1.0.0 -DarchetypeGroupId=org.openjfx -DarchetypeArtifactId=javafx-archetype-fxml -DarchetypeVersion=0.0.3 -Djavafx-version=11
```

### Ejecutable
Para realizar un `.jar` se utilizo [Maven Assembly Plugin](https://maven.apache.org/plugins/maven-assembly-plugin/usage.html), esto permite agregar el resultado del proyecto junto con sus dependencias, módulos, documentación del sitio y otros archivos en un solo paquete ejecutable.

Se necesito crear una nueva clase [*Main*](/src/main/java/com/svs/Main.java) que no extendiera desde JavaFX/Application. Esto para no requerir los [JavaFX Runtime Components](https://openjfx.io/openjfx-docs/#install-javafx) al ejecutar el `.jar`.

### Pruebas
Librerias para realizar las pruebas:
1. [TestFX Core and JUnit](https://github.com/TestFX/TestFX)
2. [JUnit](http://junit.org/)
3. [Org.Loadui.TestFx](https://github.com/SmartBear/TestFX)

### Scripts
En el directorio del proyecto, puede ejecutar:

##### `mvn clean`
Limpia todas las clases compiladas del proyecto.

##### `mvn javafx:run`
Ejecuta la aplicación en el modo de desarrollo.

##### `mvn test`
Ejecuta los casos de prueba.

##### `mvn package`
Empaqueta el proyecto (si es un proyecto java simple, genera un jar, si es un proyecto web, un war, etc…).
Este fase incluye `mvn compile` y `mvn test`.

### Nota
El `.jar` viene con los graficos de Linux.
Si usted necesita ejecutar el `.jar` en:
- Windows
    - Modifique el `classifier` por `win` en la [linea 48](https://github.com/SvS30/JavaFX-Maven/blob/master/pom.xml#L48).
    ```xml
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics</artifactId>
            <version>11</version>
            <classifier>win</classifier>
        </dependency>
    ```
- Mac
    - Modifique el `classifier` por `mac` en la [linea 48](https://github.com/SvS30/JavaFX-Maven/blob/master/pom.xml#L48).
    ```xml
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics</artifactId>
            <version>11</version>
            <classifier>mac</classifier>
        </dependency>
    ```
Después de esto, vuelva a generar el `.jar`