# First Project

Ein einfaches Java-Lernprojekt zur Demonstration von grundlegenden Java-Konzepten.

## Features

- Grundlegende Datentypkonvertierungen
- Kontrollstrukturen (if/else, switch, Schleifen)
- Methoden und Rückgabewerte
- Getter und Setter (mit Lombok)
- HashMap-Datenstrukturen
- Exception-Handling

## Requirements

- Java 21 oder höher
- Maven 3.8+

## Build

```bash
mvn clean compile
```

## Ausführung

```bash
mvn exec:java -Dexec.mainClass="org.example.MainClass"
```

## Package

```bash
mvn package
```

Die ausführbare JAR-Datei wird in `target/firstproject-1.0-SNAPSHOT.jar` erstellt.
