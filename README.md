# Courier ASAP

Courier ASAP is a Java-based web application designed for booking and tracking courier deliveries. The project follows a decoupled architecture, divided into a frontend web application for user interactions and a RESTful backend API for data management and tracking services.

## 📁 Project Structure

The repository is divided into two main modules, both built using Maven:

### 1. `courierASAPproject` (Web Application)
This is the frontend component of the application responsible for user interaction. It processes user requests via Java Servlets and serves views using JSP.
* **Key Components:** `OrderServlet`, `TrackServlet`, and JSP pages (`index.jsp`, `bookingConfirm.jsp`, `viewOrder.jsp`).
* **Packaging:** `.war` (Web Application Archive)
* **Server Support:** Configured with the Payara Micro Maven plugin.

### 2. `restbackend` (REST API & Persistence)
This module acts as the backend engine, providing a RESTful web service to handle courier tracking data. It manages database transactions and entity mapping using Hibernate/JPA.
* **Key Components:** `TrackingResource` (JAX-RS), `TrackingService`, and Domain entities (`Tracking.java`).
* **Persistence:** Configured with Hibernate, utilizing `hibernate.cfg.xml` and `persistence.xml` to interact with the database.
* **Packaging:** `.war`

## 🛠️ Technologies & Dependencies

Both modules share a common set of enterprise Java technologies configured for **Java 8**:

* **Java EE / Jakarta EE 8:** For REST APIs (JAX-RS), Servlets, and Dependency Injection.
* **Maven:** Dependency management and build automation.
* **Hibernate (5.4.12.Final):** Object-Relational Mapping (ORM) framework for database persistence.
* **Database:** Supports both **H2 Database** (for lightweight/in-memory testing) and **MySQL** (Connector 8.0.19 included).
* **Application Server:** Compatible with Jakarta EE servers like **Payara** (version 5.201.0 defined in POM) or GlassFish.

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 1.8
* Apache Maven
* A Java EE compliant application server (e.g., Payara Server, GlassFish)
* MySQL Server (if using the production database configuration)

### Build Instructions
To build the project, navigate to the respective module directories and run Maven to generate the `.war` files:

```bash
# Build the backend API
cd restbackend
mvn clean install

# Build the frontend web app
cd ../courierASAPproject
mvn clean install
```

### Deployment
1. Ensure your database (MySQL or H2) is running and the connection strings in `hibernate.cfg.xml` / `persistence.xml` (inside `restbackend`) are properly configured.
2. Deploy the `rest-backend.war` to your application server to initialize the REST APIs.
3. Deploy the `asapproject.war` to your application server to launch the frontend UI.
4. Navigate to the server's local host address (e.g., `http://localhost:8080/asapproject`) to access the `index.jsp` landing page.
