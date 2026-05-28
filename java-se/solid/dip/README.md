## JVM / Java / SOLID / DIP

### 1. Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules.  
Both should depend on abstractions.  

Abstractions should not depend on details.  
Details should depend on abstractions.  

This principle is the backbone of clean arhitecture.  


### 2. Bad Implementation (violates DIP)

Imagine a Checkout feature in an e-commerce backend.  

Business rule: "Process a payment"
Technical details: "Use Stripe today, maybe PayPal tomorrow"

This is exactly where DIP matters.  

~~~java
package solid.dip.non_compliant;

public class BadCheckoutApplication {
    public static void main(String[] args) {
        
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(100); // Charging with Stripe: 100.0
    }
}

class CheckoutService {
    private final StripePaymentProvider stripe;

    public CheckoutService() {
        this.stripe = new StripePaymentProvider();
    }

    public void checkout(double amount) {
        stripe.charge(amount);
    }
}

class StripePaymentProvider {

    public void charge(double amount) {
        System.out.println("Charging with Stripe: " + amount);
    }
}
~~~


### 3. DIP-compliant Implementation

Make low-level details depend on the abstraction.  
The interface represents what the business needs, not how it is done.  

~~~java
package solid.dip;

public class CheckoutApplication {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new StripePaymentProcessor();
        CheckoutService checkoutService = new CheckoutService(paymentProcessor);
        checkoutService.checkout(100);

        PaymentProcessor paymentProcessor2 = new PayPalPaymentProcessor();
        CheckoutService checkoutService2 = new CheckoutService(paymentProcessor2);
        checkoutService2.checkout(200);

        /*
            Charging with Stripe: 100.0
            Paying with PayPal: 200.0
        */
    }
}

interface PaymentProcessor {
    void process(double amount);
}

// Low-level details depend on the abstraction
class StripePaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Charging with Stripe: " + amount);
    }
}

class PayPalPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Paying with PayPal: " + amount);
    }
}

// High-level module depends only on the abstraction
class CheckoutService {

    private final PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        paymentProcessor.process(amount);
    }
}
~~~


### 4. Spring Projects (DIP)

How this looks in real Spring projects.  

~~~java
@Component
public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Stripe payment");
    }
}
~~~
~~~java
@Service
public class CheckoutService {

    private final PaymentProcessor processor;

    public CheckoutService(PaymentProcessor processor) {
        this.processor = processor;
    }
}
~~~

Spring:

- creates the concrete implementation
- injects it via the interface
- DIP done without ceremony


### 5. Important Clarification (DIP)

DIP doesn NOT mean:

- Always create interfaces
- Everything must be abstract
- One interface per class

DIP DOES mean:

- High-level policy must NOT know low-level details
- Dependencies point INWARD
- The direction of dependency is REVERSED

The business defines the interface.  
Infrastructure implements it.  