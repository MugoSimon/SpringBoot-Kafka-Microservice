# Spring Boot Kafka Microservice

Welcome to the Spring Boot Kafka Microservice project! This project orchestrates communication between multiple microservices including Email, Stock, Domain, and Order Services using Apache Kafka as the messaging backbone.

## Features

- Unified messaging infrastructure powered by Apache Kafka.
- Modular service architecture with separate modules for each microservice.
- Event-driven communication for real-time responsiveness.
- Scalability and fault tolerance provided by Kafka's distributed nature.
- Integration with external systems such as email servers, stock market APIs, and more.
- Monitoring and management capabilities for Kafka topics and message processing.

## Running the Project (Windows)

### Prerequisites

- Java JDK installed on your machine.
- Apache Kafka installed locally.

### Starting Zookeeper

```bash
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

### Starting Kafka Server

```bash
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

### Running Microservices

- Build the project using Maven:

```bash
mvn clean package
```

- Run the Spring Boot application:

```bash
java -jar target/spring-boot-kafka-microservice.jar
```

## How to Use

1. Ensure that Zookeeper and Kafka server are running.
2. Navigate to the respective microservice endpoints to read and write events.
3. Check the logs for event processing and message consumption.
4. Enjoy the seamless communication between microservices facilitated by Kafka!

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for any improvements or suggestions.

## License

This project is licensed under the [MIT License](LICENSE).

## Joke Of The Day

Why did the developer go broke?

Because he used up all his cache!

---
