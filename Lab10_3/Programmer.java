package Lab10_3;


public class Programmer extends Employee{
    public static String position="Programmer";
    public static double salary=25000;

    public Programmer(String firstName,String lastName,double salary){
        super(firstName, lastName, salary, position);
    }
    public Programmer(String firstName,String lastName){
        super(firstName, lastName, salary, position);
    }

    public static void main(String[] args) {
        Programmer programmer1=new Programmer("Anuchit", "Raksaphon", 30000);
        Programmer programmer2=new Programmer("Anucha", "Raksaphon");
        System.out.println(programmer1.getSalary());
        System.out.println(programmer2.getSalary());

    }

    public void createWebsite(String template,String titleName){
        
    }

    public void installWindows(String version,String productKey){

    }
}
