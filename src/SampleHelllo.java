import java.util.Scanner;

public class SampleHelllo {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;

        System.out.println("Result: " + c);
    }
}



