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