public class Lab7 {
    public static void main(String[] args) {
        String string1 = "You and Me";
        String string2 = "you and me";
        System.out.println(string1.equals(string2));

        if (string1.contains("and")){
            System.out.println("and");
        }
        System.out.println(string1.length());
        System.out.println(string1.substring(1, 4));
        System.out.println(string1.replace(" ", ""));
        System.out.println(string1.toUpperCase());
        System.out.println(string2.trim().toUpperCase());
    }
}
