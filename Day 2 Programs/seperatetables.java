
public class seperatetables{
    public static void main(String[] args) {
        System.out.println("ODD NUMBER TABLES");
        for (int num = 1; num <= 40; num++) {
            if (num % 2 != 0) {
                System.out.println("\nTable of " + num);
                System.out.println(num+" Table is starting.....");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " X " + i + " = " + (num * i));
                }
                System.out.println(num+" table is ending........");
            }
        }
        System.out.println("\nEVEN NUMBER TABLES");
        for (int num = 1; num <= 40; num++) {
            if (num % 2 == 0) {
                System.out.println("\nTable of " + num);
                System.out.println(num+" Table is starting.....");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " X " + i + " = " + (num * i));

                }
                System.out.println(num+" table is ended........");
            }
        }
    }
}
