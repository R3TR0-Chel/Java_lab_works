public class employee {
        public static void main(String[] args) {
            Employee fte = new FullTimeEmployee("Alice", 101, 5000);
            Employee cte = new ContractEmployee("Bob", 102, 0, 50, 160);

            fte.displayEmployeeInfo();
            System.out.println("Full-time salary: " + fte.calculateSalary());
            System.out.println();

            cte.displayEmployeeInfo();
            System.out.println("Contract salary: " + cte.calculateSalary());
        }
}


abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

interface Payable {
    double getPaymentAmount();
}

class FullTimeEmployee extends Employee implements Payable {
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.20);
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}



class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double baseSalary, double hourlyRate, int hoursWorked) {
        super(name, id, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}