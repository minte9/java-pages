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
