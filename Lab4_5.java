public class Lab4_5 {
    public static void main(String[] args) {
        Lab9();
        Lab10();
    }


    //1
    public static void Lab9(){
        System.out.println("Lab 9");
        for(int count=20;count>0;count--){
            if(count==11){
                System.out.println(count);
                continue;
            }
            System.out.println(count);
        }
    }


    //2
    public static void Lab10(){
        System.out.println("Lab 10");
        for(int i=0;i<10;i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}
