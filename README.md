# jetty-jdbc-example

Because Java doesn't have to be confusing.

## Setup

Make sure you have Maven installed and SQLite installed

```sh
which mvn && which sqlite3
```

If not, install them however you install software on your computer, e.g. brew or apt.

Build the database.

```sh
cat init.sql | sqlite3 example.db
```

Build the project.

```sh
mvn clean package
```

Run the server.

```sh
java -jar target/jetty-jdbc-example-jar-with-dependencies.jar
```

And check your browser [here](http://localhost:8080/) and [here](http://localhost:8080/starwars).
