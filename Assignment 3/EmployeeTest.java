import java.util.*;

class Employee {
    String name, address, job_title;
    float salary, bonus;

    void data(Scanner sc) {
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextFloat();
        System.out.println("Enter bonus:");
        bonus = sc.nextFloat();
        sc.nextLine(); 
    }
}

class Manager extends Employee {
    void display() {
        System.out.println("Manager Info*");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: Manager");
        System.out.println("Salary: " + salary);
        System.out.println("Salary after getting bonus: " + (salary + bonus));
    }
}

class Developer extends Employee {
    void display() {
        System.out.println("Developer Info*");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: Developer");
        System.out.println("Salary: " + salary);
        System.out.println("Salary after getting bonus: " + (salary + bonus));
    }
}

class Programmer extends Employee {
    void display() {
        System.out.println("Programmer Info*");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: Programmer");
        System.out.println("Salary: " + salary);
        System.out.println("Salary after getting bonus: " + (salary + bonus));
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m1 = new Manager();
        m1.data(sc);
        m1.display();

        Developer d1 = new Developer();
        d1.data(sc);
        d1.display();

        Programmer p1 = new Programmer();
        p1.data(sc);
        p1.display();

        sc.close();
    }
}