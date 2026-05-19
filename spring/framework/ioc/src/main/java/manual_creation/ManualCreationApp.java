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
