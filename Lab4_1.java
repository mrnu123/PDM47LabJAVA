public class Lab4_1 {
    public static void main(String[] args) {
        float score = 49.6f;
        boolean isHandSome = true;
        if (isHandSome) {
            System.out.println("Good");
        } else {
            if (score >= 80) {
                System.out.println("Good");
            } else if (score >= 50) {
                System.out.println("normal");
            } else {
                System.out.println("fail");
            }
        }
    }
}
