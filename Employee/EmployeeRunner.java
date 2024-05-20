package Employee;

public class EmployeeRunner {
    public static void main(String[] args){
        Employee Seb = new Employee(40000.0);
        Seb.increase(2000.0);
        double p = Seb.getPay();
        System.out.println("Salary is " + p);

        Seb.increase(-500.0);
        p = Seb.getPay();
        System.out.println("Salary is " + p);
        
        Seb.increase(3000.0);
        p = Seb.getPay();
        System.out.println("Salary is " + p);
    }
}
