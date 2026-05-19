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
