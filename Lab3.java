public class Lab3 {
    public static void main(String[] args) {
        int i =20;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
    
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);

        float num1= 20.5f;
        float num2 = 52.3f;

        if((num1==20.5f)&&(num2==52.3f)){
            System.out.println("num1 : 20.5 and num2 : 52.3");
        }


        char a='a';
        char b='b';
        if((a=='a')||(b=='q')){
            System.out.println("a : 'a' or b : 'b'");
        }
    }
}
