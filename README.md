# Selenium Test Project

Este proyecto es una plantilla básica para pruebas automatizadas usando Selenium WebDriver y JUnit.

## Tecnologías utilizadas

- 💻 macOS
- ☕ JAVA JDK 23
- 🔨 Maven 3.9.9
- 📝 Zed IDE

## Creación del proyecto

Para crear un nuevo proyecto Maven usando el arquetipo básico, ejecuta el siguiente comando:

```bash
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=selenium-test \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false
```

### Explicación de los parámetros:

- `archetype:generate`: Comando para generar un nuevo proyecto usando un arquetipo
- `-DgroupId`: Identificador del grupo del proyecto (formato de paquete Java)
- `-DartifactId`: Nombre del proyecto/módulo
- `-DarchetypeArtifactId`: Tipo de arquetipo a usar
- `-DarchetypeVersion`: Versión del arquetipo
- `-DinteractiveMode`: Modo no interactivo para automatización

## Configuración del pom.xml

Añade las siguientes dependencias al archivo `pom.xml`:

```xml

<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>23</maven.compiler.source>
    <maven.compiler.target>23</maven.compiler.target>
</properties>

<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
    
    <!-- Selenium WebDriver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.29.0</version>
    </dependency>
</dependencies>

<build>
  <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
    <plugins>
      <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
      <plugin>
        <artifactId>maven-clean-plugin</artifactId>
        <version>3.1.0</version>
      </plugin>
      <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
      <plugin>
        <artifactId>maven-resources-plugin</artifactId>
        <version>3.0.2</version>
      </plugin>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version>
      </plugin>
      <plugin>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.22.1</version>
      </plugin>
      <plugin>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.0.2</version>
      </plugin>
      <plugin>
        <artifactId>maven-install-plugin</artifactId>
        <version>2.5.2</version>
      </plugin>
      <plugin>
        <artifactId>maven-deploy-plugin</artifactId>
        <version>2.8.2</version>
      </plugin>
      <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
      <plugin>
        <artifactId>maven-site-plugin</artifactId>
        <version>3.7.1</version>
      </plugin>
      <plugin>
        <artifactId>maven-project-info-reports-plugin</artifactId>
        <version>3.0.0</version>
      </plugin>      
    </plugins>
  </pluginManagement>
</build>
```

Asegurate de agregar el siguiente plugin agragando la informacion correspondiente a tu proyecto y clase main. Después de </pluginManagement>

```xml
<plugins>
    <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>3.5.0</version>
        <configuration>
            <mainClass>org.tu-groupId.tu-main-class</mainClass>
        </configuration>
    </plugin>
</plugins>
```

## Estructura del proyecto

```
selenium-test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
├── pom.xml
└── README.md
```

## Compilación y ejecución

Para ejecutar el proyecto(clase main):
```bash
mvn exec:java
```

Para compilar el proyecto:
```bash
mvn clean compile
```

Para ejecutar las pruebas:
```bash
mvn test
```

[!TIP]
MacOS por defecto tiene integrado un WEBDRIVER (Safari/Chrome) en su sistema, por lo que NO tienes que instanciar su ruta.


## Notas adicionales

- Asegúrate de tener una conexión a Internet para descargar las dependencias
- Se recomienda usar la última versión estable de las dependencias


## Recursos útiles

- [Documentación de Selenium](https://www.selenium.dev/documentation/)
- [Documentación de JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Central Repository](https://mvnrepository.com/)
