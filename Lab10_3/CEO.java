package Lab10_3;

public class CEO extends Employee {
    public static String position="CEO";
    public CEO (String firstName, String lastName, double salary) {
        super(firstName, lastName, salary, position);
    }
}
