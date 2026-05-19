/**
 * Factory pattern (plain Java)
 * ============================
 */
package factory_pattern;

public class FactoryPatternApp {
    public static void main(String[] args) {

        NotificationController controller = AppFactory.createNotificationController();
        controller.print();  // Hello from Service / Factory Pattern
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
