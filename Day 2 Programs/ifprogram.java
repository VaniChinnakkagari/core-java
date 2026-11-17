import java.util.Scanner;
public class ifprogram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a ");
        int a =sc.nextInt();
       if(a<=10){
        System.out.println("Condition is true");
       }
       else{
        System.out.println("Condition is false");
       }
    }
}