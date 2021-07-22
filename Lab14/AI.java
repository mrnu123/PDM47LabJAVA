package Lab14;

public class AI implements IWebsiteCreator {
    public String nameAI;
    public String programmingLanguage;
    public AI(String nameAI,String programmingLanguage){
        this.nameAI=nameAI;
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public String getFirstName(){
        return this.nameAI;
    }
    @Override
    public String getLastName(){
        return this.programmingLanguage;
    }
    @Override
    public double getSalary(){
        return 0;
    }
}
