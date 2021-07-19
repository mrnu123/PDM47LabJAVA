import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Lab6();
        Lab7();
        Lab8();
    }

    public static void Lab6(){
        
        //1
        int i =0;
        while(i<=10){
            System.out.println(i);
            i++;
        }


        //2
        int sum=0;
        int num=1;
        while(num<=10){
            sum +=num;
            num++;
        }
        System.out.println("1+2+3+...+10 = "+sum);


        //3
        int j=1;
        System.out.println("Numbers 1 to 100 are divisible by 12");
        while(j<=100){
            if((j%12)==0){
                System.out.println(j);
            }
            j++;
        }

        //4
        System.out.println("Foreach");
        int[] numbers={1,2,3,4,5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void Lab7(){
        //1
        System.out.println("Print 20 to 0");
        int i=20;
        do{
            System.out.println(i--);
        }while(i>=0);


        //2
        String oddEvent;
        do{
            System.out.print("Please input integer : ");
            Scanner myNum = new Scanner(System.in);
            oddEvent =  myNum.nextLine();
        }while((Integer.parseInt(oddEvent)%2)==0);
    }

    public static void Lab8(){
        for(int count=20;count>0;count--){
            if(count==11){
                System.out.println(count);
                break;
            }
            System.out.println(count);
        }
    }
}
