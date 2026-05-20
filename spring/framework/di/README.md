### Dependency Injection (DI)

With DI an object receive its dependencies from outside.  
It doesn't create the dependencies inside the class.   

DI is how IoC is implemented in Spring.

~~~java
class A {
    B b = new B(); // tightly coupled
}

class A {
    private final B b;

    public A(B b) { // dependency is injected
        this.b = b;
    }
}
~~~


### Types of DI

1) Constructor Injection

This is the recommended way because: 
- dependencies are required
- object is always valid
- easier to test

~~~java
class MessageService {
    public String getMessage() {
        return "Hello DI";
    }
}

class NotificationController {

    private final MessageService messageService;

    // dependency is REQUIRED and immutable
    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void print() {
        System.out.println(messageService.getMessage());
    }
}
~~~

2) Field Injection

Not recommended because: 
- hard to test
- hidden dependencies
- not immutable

~~~java
import org.springframework.beans.factory.annotation.Autowired;

class NotificationController {

    @Autowired
    private MessageService messageService;

    public void print() {
        System.out.println(messageService.getMessage());
    }
}
~~~


### IoC using DI

~~~xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring.version}</version>
    </dependency>
</dependencies>
~~~

@Service: Marks a class as a service component.  
@Configuration: Indicates that the class contains Spring configuration. 
@ComponentScan: Tells Spring to scan for components in the specified package. 

ApplicationContext: The Spring container that manages beans and their dependencies.  
 
In this example, OrderService depends on PaymentService, and Spring injects   
the dependency automatically when creating the OrderService bean.  

~~~java
/**
 * Dependecny Injection with Spring Framework:
 * ===========================================
 * Spring manages the creation and injection of dependencies.
 */
package dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

public class DependencyInjectionApp {
    public static void main(String[] args) {

        ApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService service = context.getBean(OrderService.class);
        service.processOrder();
            // Payment executed ...
            // Order processed.
    }
}

@Configuration
@ComponentScan(basePackages = "dependency_injection")
class AppConfig {
}

@Service
class PaymentService {
    
    public void pay() {
        System.out.println("Payment executed ...");
    }
}

@Service
class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder() {
        paymentService.pay();
        System.out.println("Order processed.");
    }
}
~~~