### Annotations

Annotation mechanism (@Something) is a Java language feature.    
The @Configuration, @Bean are Spring Framework features.  

Annotations do nothing by themselves unless something process them.  
Spring reads these annotations and changes behavior at runtime. 

@Configuration → marks class as source of bean  definitions
@Bean → tell Springs: "this method creates an object you should manage"

~~~java
@Configuration
class AppConfig {

    @Bean
    MessageService messageService() {
        return new MessageService();
    }
}
~~~

### IoC using annotations

Instead of writing "recipes" (@Bean methods), we mark classes and let Spring:

- detect them
- create them
- inject dependencies

We did NOT write:

~~~java
new MessageService()
new NotificationController(...)
~~~

Spring did everything based on annotations + classpath scanning. 

~~~java
import org.springframework.stereotype.Component;

@Component
class MessageService {
    public String getMessage() {
        return "Hello from MessageService";
    }
}
~~~

### Annotations Example App

~~~xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring.version}</version>
    </dependency>
</dependencies>
~~~
~~~java
/**
 * IoC example (using only annotations)
 * ====================================
 * Enable component scanning (Configuration minimal)
 * Mark classes as Spring-managed (@Component)
 * Constructor injection (NotificationController)
 */

package annotations_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class AnnotationsExampleApp {
    public static void main(String[] args) {
        
        ApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationController controller = 
            context.getBean(NotificationController.class);

        controller.print();  
            // Hello from Message Service
    }    
}

@Configuration
@ComponentScan(basePackages = "annotations_example")
class AppConfig {
    // No explicit bean definitions needed due to @ComponentScan
}

@Component
class MessageService {
    public String getMessage() {
        return "Hello from Message Service";
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