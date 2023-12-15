# Sirius-based Docker network diagrams

This project provides a Sirius-based notation to describe the basic features of a Docker Compose-based application.
You can describe:

* Networks involved
* Machines (IP addresses) in those networks
* The ports opened on those machines
* The processes that connect to some of those ports, and listen on other ports

The project includes two sample models that compare what the "development-time" and "production-like" networks look like for the `book-microservice` used as a lab model solution in the ENG2 module.

## Development time

During development, we run the `book-microservice` directly from our IDE. To avoid having to constantly tweak settings with the IP addresses set up by Docker for the MariaDB and Kafka containers, we map their ports to various ports in our `localhost`.

![Development-time Port Mappings](runtime/uk.ac.york.docker.network.model/images/Development%20Port%20Mappings.png)

Once the mappings are ready, the microservice connects to the `localhost` ports. The `book-cli` command-line client connects to `localhost:8080`, which is where our microservice is listening for connections.

![Development-time Process Connections](runtime/uk.ac.york.docker.network.model/images/Development%20Process%20Connections.png)

*Note:* a green line with a dot means that the process listens on that port. A red line with an arrowhead means that the process connects to that port.

## Production-like

In a production-like environment, we run the `book-microservice` in a container that uses the Docker image produced via `./gradlew dockerBuild`.

Since the microservice is now running within the network set up by Docker Compose, it can directly connect to the MariaDB and Kafka containers by name.
This means we only need to map `localhost:8080` to port 8080 of the Docker container for the microservice.
In general, in a production-like environment you want to expose as little as possible to the outside world.

![Production-like Port Mappings](runtime/uk.ac.york.docker.network.model/images/Production%20Port%20Mappings.png)

If we look at the connections, we can see now that the microservice listens at the port of its Docker container, and connects directly to the other containers in the network. The `book-cli` still connects to `localhost:8080` as usual, but this time it has been mapped to port 8080 of the microservice's Docker container.

![Production-like Process Connections](runtime/uk.ac.york.docker.network.model/images/Production%20Process%20Connections.png)

## Trying the notation yourself

You will need a recent version of the Eclipse Modeling Tools.
Recent releases will usually come with [Eclipse Sirius](https://eclipse.dev/sirius/).

Start Eclipse, and import the projects in the `metamodels` folder.
Right-click on the `uk.ac.york.docker.network` project, and select "Run as - Eclipse Application".

In the nested Eclipse instance, import the projects in the `runtime` folder.

Switch to the "Modeling" perspective, and try opening the representations of the `.dockernetwork` files inside the `uk.ac.york.docker.network.model` project.

The Sirius editors include the necessary tools to create nodes and links.
To delete links, use the Properties view to unset them.