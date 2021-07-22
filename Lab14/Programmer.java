package Lab14;

public class Programmer extends Employee implements IWebsiteCreator {

    public Programmer(String firstName,String lastName,double salary){
        super(firstName, lastName, salary);
    }


    public void work(){
        CreateWebsite();
        FixPC();
        InstallWindows();
    }
    private void CreateWebsite(){

    }
    private void FixPC(){

    }
    private void InstallWindows(){

    }

    public void hello(){
        System.out.println("Hello "+super.firstName);
    }

    @Override
    public String getFirstName(){
        return this.firstName;
    }
    @Override
    public String getLastName(){
        return this.lastName;
    }
    @Override
    public double getSalary(){
        return this.salary;
    }
}
