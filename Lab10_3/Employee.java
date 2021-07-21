package Lab10_3;

public class Employee {
    public String firstName;
    public String lastName;
    public double salary;
    public String position;
    public Employee(String firstName, String lastName, double salary, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("FirstName" + i, "LastName" + i, 20000 * (i + 1), "Programmer" + i);
            System.out.println(employees[i].firstName +" "+ employees[i].lastName +" "+ employees[i].salary +" "+ employees[i].position);
        }

        Employee employee1=new Employee("Anuchit", "Raksaphon", 27000, "HR");
        employee1.checkPosition();

    }

    public double getSalary(){
        return this.salary;
    }
    public void checkPosition(){
        System.out.println(this.position);
    }

}
