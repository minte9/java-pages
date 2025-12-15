## Local File Organizer 

### What it does

- Scans a folder (e.g. Downloads)
- Groups files by extension (pdf, jpg, zip, etc.)
- Moves them into subfolders

### Concepts used

    Classes / Objects
    Arrays, Lists, Maps
    Loops
    Strings
    Regexp (file extensions)
    Exceptions (IO)
    Streams (filtering, grouping)
    Static utility methods
    JUnit tests for extension parsing

### Example features

- Dry-run mode (no actual move)
- Ignore hidden files
- Configurable via .properties

### Why it’s good

 - You’ll actually use it and learn java.io / java.nio.file


------

### Compile and run a project

pom.xml (example)

    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="
            http://maven.apache.org/POM/4.0.0
            https://maven.apache.org/xsd/maven-4.0.0.xsd">

        <modelVersion>4.0.0</modelVersion>

        <!-- If this is a standalone module -->
        <groupId>com.catalin.projects</groupId>
        <artifactId>local-file-organizer</artifactId>
        <version>1.0.0</version>
        <packaging>jar</packaging>

        <name>Local File Organizer</name>
        <description>CLI tool to organize files by extension</description>

        <!-- ================= -->
        <!-- Java configuration -->
        <!-- ================= -->
        <properties>
            <maven.compiler.source>17</maven.compiler.source>
            <maven.compiler.target>17</maven.compiler.target>
            <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        </properties>

        <!-- ================= -->
        <!-- Build configuration -->
        <!-- ================= -->
        <build>

            <!-- Name of the generated jar -->
            <finalName>local-file-organizer</finalName>

            <plugins>

                <!-- Compile with correct Java version -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>3.11.0</version>
                    <configuration>
                        <release>17</release>
                    </configuration>
                </plugin>

                <!-- Executable JAR -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-jar-plugin</artifactId>
                    <version>3.3.0</version>
                    <configuration>
                        <archive>
                            <manifest>
                                <mainClass>
                                    projects.local_file_organizer.FileOrganizer
                                </mainClass>
                            </manifest>
                        </archive>
                    </configuration>
                </plugin>

            </plugins>
        </build>

    </project>


Compile:

    mvn clean package

Run: 

    java -jar target/local-file-organizer.jar 