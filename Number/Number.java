import java.util.Scanner;

public class Number {
    public static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static int factorial(int n) {
	    if (n == 1) return 1;
	    return n * factorial(n - 1);
	}

    public static int numOfFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;
        return count;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isEven(n))
            System.out.println(n + " is an even number");
        else
            System.out.println(n + " is an odd number");

        System.out.println("Factorial of " + n + ": " + factorial(n));

        /* int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(max3(a, b, c)); */
	}
}