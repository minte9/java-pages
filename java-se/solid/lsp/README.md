## JVM / Java / SOLID / LSP

### 1. Liskov Substitution Principle (LSP)

Subtypes must be substituable for their base types.


### 2. Bad Implemenation (violates LSP)

Here, a subtype changes expected behavior.  
It throws an exception where the base type contract   
says it should process the payment.

~~~java
/**
 * LSB - Non compliant example
 * ===========================
 */
package solid.lsp.non_compliant;

public class BadPaymentApplication {
    public static void main(String[] args) {
        
        PaymentMethod p1 = new CreditCardPayment();
        PaymentMethod p2 = new FreeTrialPayment();  // problematic subtype

        p1.pay(200);
        p2.pay(300);  // This will break at runtime
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

/**
 * This class strengthens preconditions:
 * It does NOT allow payments above 100.
 * The base contract does not define such limitation. 
 * This violates LSP.
 */
class FreeTrialPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {

        if (amount > 100) {
            throw new UnsupportedOperationException(
                "FreeTrial cannot process payments above 100");
        }

        System.out.println("Free trial payment processed: $" + amount);
    }
}
~~~

### 3. LSB-compliant Implementation

Here, payment method defines a contract:

- pay (amount)
- validate (amount must be positive)

All implementation:

- validate the amount
- perform payment
- behave consistently 

All payment types behave consistently. 

~~~java
/**
 * LSP - Liskov Substitution Principle
 * ====================================
 * Subtypes must be substituable for their base types.
 * All payment types behave consistently. 
 */
package solid.lsp;

public class PaymentApplication {
    public static void main(String[] args) {
        PaymentMethod p1 = new CreditCardPayment();
        PaymentMethod p2 = new PayPalPayment();

        p1.pay(200);
        p2.pay(300);
    }
}

interface PaymentMethod {
    void pay(double amount);
}

abstract class BasePayment implements PaymentMethod {
    protected void validate(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
    }
}

class CreditCardPayment extends BasePayment {
    @Override
    public void pay(double amount) {
        validate(amount);
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class PayPalPayment extends BasePayment {
    @Override
    public void pay(double amount) {
        validate(amount);
        System.out.println("Paid $" + amount + " using PayPal");
    }
}
~~~