public class Lab5 {
    public static void main(String[] args) {
        eventOrOdd(5);
        int num1=5;
        int num2=2;
        int result=multiply(num1, num2);
        System.out.println(num1+" * "+num2+" = "+result);
    }
    
    public static void eventOrOdd(int num){
        if(num %2==0){
            System.out.println(num+" is event");
        }else{
            System.out.println(num+" is Odd");
        }
    }

    public static int multiply(int num1,int num2){
        return (num1*num2);
    }
}
