package Lab14;

public class CEO extends Employee{
    public CEO(String firstName,String lastName,double salary){
        super(firstName, lastName, salary);
    }
    public void work(){
        Seminar();
        Hire();
        Golf();
        Fire();
    }
    private void Seminar(){

        
    }
    private void Hire(){

    }
    private void Golf(){

    }
    private void Fire(){

    }

    public void hello(){
        System.out.println("Hi nice to meet you. "+super.firstName+"!");
    }

}
