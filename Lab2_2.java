public class Lab2_2 {
    public static void main(String[] args) {
        bark();    
        int weight=50;
        float weight_float = weight;
        float GPA = 2.86f;
        int GPA_int = (int)GPA;
        double height = 173.5;
        float height_float=(float)height;
        char gender = 'm';
        int gender_int=gender;
        System.out.println("float --> int : "+GPA+" --> "+GPA_int);
        System.out.println("int --> float : "+weight+" --> "+weight_float);
        System.out.println("double --> float : "+height+" --> "+height_float);
        System.out.println("char --> int : "+gender+" --> "+gender_int);

        final String hello="Hello";
        // hello="world";
    }

    public static void bark(){
        String dogName="Bingsu";
        System.out.println("The Dog name = "+dogName+" bark");
    }
}
