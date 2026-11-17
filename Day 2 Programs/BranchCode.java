
import java.util.Scanner;
public class BranchCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your branch name:");
        int branch = sc.nextInt();
        switch (branch) {
            case 1:
                System.out.println("CSE");
                break;
            case 2:
                System.out.println("CAI");
                break;
            case 3:
                System.out.println("MECH");
                break;
            case 4:
                System.out.println("CIVIL");
                break;
            case 5:
                System.out.println("CSM");
                break;

            case 6:
                System.out.println("CSC");
                break;
            case 7:
                System.out.println("EEE");
                break;
            case 8:
                System.out.println("ECE");
                break;
            case 9:
                System.out.println("MBA");
                break;
            case 10:
                System.out.println("MCA");
                break;
            default:
                System.out.println("Invalid Branch Name");
        }

        sc.close();
    }
}
