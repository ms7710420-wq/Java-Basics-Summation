import java.util.Scanner;

public class IfCondition {
public static void main(String[]args){
   Scanner S=new Scanner(System.in); 
    System.out.println("Enter a number");

    int num=S.nextInt();
    if(num<0){
        System.out.println("The number is negative");
    }else{
        System.out.println("The number is positive");
    }
    }
}
