import java.util.Scanner;
 public class elseifladder {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks for a Student");
    int marks=sc.nextInt();
    if(marks>=90&&marks<=100)
        {
        System.out.println("Grade A-First Class");
        }
    else if(marks>=80){
        System.out.println("Distinction");
        }
    else if(marks<80&&marks>60){
        System.out.println("Average");
        }
    else if(marks<50&&marks>35){
        System.out.println("Poor");
    }
    else{
        System.out.println("Fail");
    }
    }
}
