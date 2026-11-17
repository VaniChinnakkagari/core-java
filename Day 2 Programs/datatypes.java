import java.util.Scanner;
public class datatypes {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=13;
        String result = (num%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}