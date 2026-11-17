
public class MultiTable {
    public static void main(String[] args) {
        for (int num = 1; num <= 20; num++) {
            System.out.println("Multiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
            }
        }
    }
}
