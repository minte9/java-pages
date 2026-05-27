## JVM / Java / SOLID / SRP

### 1. Single Responsibility Principle (SRP)

A class should have only one reason to change.  

This does not mean that a class must do only one thing.  
SRP talks about reason to change, not number of methods, not amount of logic.  


### 2. Bad Implementation (violates SRP)

This class has multiple reasons to change:

Change / Reason:  

- Salary rules change (HR / business policy)
- Report format changes (Reporting / presentation)
- Persistence changes (Infrastructure / database)

These reasons come from different actors (HR, finance, DBA, UI team).  
That’s the real SRP violation.  

~~~java
/**
 * SRP - Non complient example
 * ===========================
 * Employee with multiple legitimate beharviors
 */
package solid.srp.non_compliant;

public class BadPayrollApplication {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 1000);
        System.out.println(employee.generatePayrollReport());
        employee.saveToDatabase();

        /*
            Employee: John, Salary: 1200.0
            Saving employee to DB
        */
    }
}

class Employee {
    private final String name;
    private final double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary * 1.2;
    }

    String generatePayrollReport() {
        return "Employee: " + name + ", Salary: " + calculateSalary();
    }

    void saveToDatabase() {
        System.out.println("Saving employee to DB");
       
    }
}
~~~

### 3. SRP-compliant Implementation

In this example, Employee:

- Has behavior
- Has multiple methods
- Still SRP-compliant

Because:

- All changes to Employee come from one reason:
  changes in employee-related business rules

~~~java
/**
 * SRP - Compliant design
 * ======================
 * All changes to Employee come from one reason:
 * changes in employee-related business rules
 */
package solid.srp;

public class PayrollApplication {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 1000);
        PayrollReportService service = new PayrollReportService();
        EmployeeRepository repository = new EmployeeRepository();
        service.generate(employee);
        repository.save(employee);

        /*
            Employee: John / Salary: 1200.0
            Saving employee to DB: John
        */
    }
}

class Employee {
    private final String name;
    private final double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary * 1.2;
    }

    String getName() {
        return name;
    }
}

class PayrollReportService {
    void generate(Employee employee) {
        System.out.println(
            "Reports employee: " + employee.getName() + " / " + 
            "Salary: " + employee.calculateSalary()
        );
    }
}

class EmployeeRepository {
    void save(Employee employee) {
        System.out.println("Saving employee to DB: " + employee.getName());
    }
}
~~~

### 4. Key Insights (SRP)

SRP is about actors, not code size.  
A class should be responsible to only one actor.  

Ask these questions:

- Who will ask for this change?
- Are these changes requested by different people/teams?
- Whould these changes happen for different business reasons?

If the answer is yes, SRP is beaing violeted.  