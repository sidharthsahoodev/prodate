# Prodate

Prodate is a Java-based application utilizing Gradle and Spring Boot. It's designed to provide a robust backend, leveraging Firebase for its authentication services.

## Prerequisites

- Java 17

## Configuration

The application uses Firebase for its services. Ensure you have the `firebase-adminsdk.json` file renamed appropriately and placed in the project's root directory.

## Build and Run

The project uses Gradle for building and managing dependencies. To build the project, run:

```shell
./gradlew build
```

To start the application, use:

```shell
./gradlew bootRun
```

## Dependencies

The `build.gradle` file includes the following key dependencies:

- Spring Boot Starter Web
- Firebase Admin SDK

For a complete list of dependencies, refer to the [build.gradle](https://github.com/sidharthsahoodev/prodate/blob/main/build.gradle) file.

## Firebase Configuration

The Firebase configuration is managed in the `FirebaseConfig.java` file. Ensure to update the path to your Firebase Admin SDK JSON file in the following line:


GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream("./your-firebase-adminsdk.json"));

Make sure to replace `./your-firebase-adminsdk.json` with the actual path and filename of your Firebase Admin SDK JSON file before adding this to your repository.

 
