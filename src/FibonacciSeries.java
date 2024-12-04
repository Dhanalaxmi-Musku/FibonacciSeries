import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter the number of terms to print in the Fibonacci series: ");
        int n = scan.nextInt();
        int a = 0, b = 1;       
        System.out.println("Fibonacci Series up to " + n + " terms:"); 
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

	}

}
