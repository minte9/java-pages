## JVM / Java / SOLID / OCP

### 1. Open/Close Principle (OCP)

Open for extension, closed for modification.  


### 2. Bad Implementation (violates OCP)

In this example, every time you add a new type:

- You modify the service class
- You risk breaking existing code
- You recompile and retest

This violetes OCP.
 
Whenever you see if (type == ...)   
That's usually a smell that OCP can improve the design.

~~~java
/**
 * OCP - Non compliant example
 * ============================
 */
package solid.ocp.non_compliant;

public class BadNotificationApplication {
    public static void main(String[] args) {
        Bad_NotificationService service = new Bad_NotificationService();

        service.send("email", "Welcome!");
        service.send("sms", "Your code is 1234");
        service.send("push", "New message received");
    }
}

class Bad_NotificationService {
    public void send(String type, String message) {

        if (type.equals("email")) {
            System.out.println("Sending EMAIL: " + message);
        } else
        if (type.equals("sms")) {
            System.out.println("Sending SMS: " + message);
        } else
        if (type.equals("push")) {
            System.out.println("Sending PUSH: " + message);
        }

    }
}
~~~

### 3. OCP-compliant Implementation

Here, we can add new notification types WITHOUT changing existing classes.  

If tommorrow you need a SlackNotification, just add a new class.  
This DO NOT change:  

- NotificationService
- EmailService
- Any existing code

~~~java
/**
 * OCP - Open/Closed Principle
 * ======================
 */
package solid.ocp;

public class NotificationApplication {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.send(new EmailNotification(), "Welcome!");
        service.send(new SmsNotification(), "Your code is 1234");
        service.send(new PushNotification(), "New message received");

        /*
            Sending EMAIL: Welcome!
            Sending SMS: Your code is 1234
            Sending PUSH: New message received
        */
    }
}

// Contract
interface Notification   {
    void send(String message);    
}

// Service
class NotificationService {

    // Open for extension / Closed for modifications
    public void send(Notification notification, String message) {
        notification.send(message);
    }
} 

// Extensions
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
~~~


### 4. Why interfaces are perfect for OCP?  

Interfaces allow: 

- Polymorphism
- Loose coupling
- Independent implementations
- Runtime substitution