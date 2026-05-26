## JVM / Spring / Framework / Inversion of Control


### 1. Inversion of Control (IoC)

With IoC the control of creating and wiring objects is moved out of your code  
and into a container/framework.

In plain java, we often wire objects ourselves (with new).  

In Spring, the IoC `container` creates objects and connects their dependencies.  
In Spring, that container is commonly represented by `ApplicationContext`.  

When a framework manages object creation, your classes can focus on business logic.

Spring's container is responsible for instantianting, configuring, and assembling `beans`  
based on configuration metadata such as configuration classes and `@Bean` methods. 


### 2. Manual creation (objects)

We crete dependencies manually with new keyword.  
This is simple for small programs, but in larger apps it becomes hard to manage.  

~~~java
/**
 * Manual Creation (plain Java)
 * ============================
 */
package manual_creation;

public class ManualCreationApp {
    public static void main(String[] args) {

        MessageService service = new MessageService();

        NotificationController controller = new NotificationController(service);
        controller.print();  // Hello from Service / Manual Creation
    }
}

class MessageService {
    public String getMessage() {
        return "Hello from Service / Manual Creation";
    }
}

class NotificationController {
    private final MessageService messageService;

    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println(messageService.getMessage());
    }
}
~~~

### 3. Factory pattern

Using Factory Pattern the creation is centralized, but still controlled by our code. 

~~~java
/**
 * Factory pattern (plain Java)
 * ============================
 */
package factory_pattern;

public class FactoryPatternApp {
    public static void main(String[] args) {

        NotificationController controller = AppFactory.createNotificationController();
        controller.print();  // Hello from MessageService
    }
}

class AppFactory {
    public static NotificationController createNotificationController() {

        MessageService service = new MessageService();
        return new NotificationController(service);
    }
}

class NotificationController {
    private final MessageService messageService;

    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println(messageService.getMessage());
    }

}

class MessageService {
    public String getMessage() {
        return "Hello from Service / Factory Pattern";
    }
}
~~~


### 4. Spring IoC

Spring Framework does the important wiring work:

- creates MessageService
- creates NotificationController
- injects MessageService into NotificationController

That is IoC: control moved from you app code to the Spring container.  

Spring supports Java-based configuration through `@Configuration` and `@Bean`,  
and `ApplicationContext` is the central IoC container interface.  

~~~xml
<!-- ========================================
     Maven build file for plain Spring Framework
     No Spring Boot
     Java 17
     ======================================== -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example.ioc</groupId>
    <artifactId>demo</artifactId>
    <version>1.0</version>
    <name>ioc</name>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <spring.version>6.2.17</spring.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
    </dependencies>
</project>
~~~

~~~java
package spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SpringIocApp {
    public static void main(String[] args) {

        ApplicationContext context =
                 new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationController controller = 
            context.getBean(NotificationController.class);

        controller.print();  // Hello from Service / Spring IoC
    }
}

// Configuration

@Configuration
class AppConfig {

    @Bean
    MessageService messageService() {
        return new MessageService();
    }

    @Bean
    NotificationController notificationController(MessageService messageService) {
        return new NotificationController(messageService);
    }
}

// Beans

class MessageService {
    public String getMessage() {
        return "Hello from Service / Spring IoC";
    }
}

class NotificationController {
    private final MessageService messageService;

    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println(messageService.getMessage());
    }
}
~~~

### 5. Spring Boot

Spring Boot still uses Spring IoC and ApplicationContext.  

Instead of manually defining many beans, Spring Boot configures common infrastructure automatically.   
Spring Boot does not replace Spring Framework - it sits on top of Spring and makes setup faster.  

~~~xml
<!-- Spring Boot -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>
~~~
~~~java
package spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringBootApp.class, args);

        NotificationController controller = 
            context.getBean(NotificationController.class);

        controller.print();  // Hello from Service / Spring Boot
    }
}

@Service
class MessageService {

    public String getMessage() {
        return "Hello from Service / Spring Boot";
    }
}

@Component
class NotificationController {

    private final MessageService messageService;

    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println(messageService.getMessage());
    }
}
~~~