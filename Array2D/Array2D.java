import java.util.Collections;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter row: ");
        int n = sc.nextInt();
        System.out.print("Enter column: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];


        System.out.println("Enter all elements of the array: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();


        System.out.println("All elements of the array: ");
        printArr(arr);
        
        
        System.out.println("Sum of array: " + sumOfArr(arr));


        
        
        

        // B68: tổng các phần tử chia hết cho 5
        /* int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (arr[i][j] % 5 == 0)
                    sum += arr[i][j];
        System.out.println(sum); */
    }



    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static int sumOfArr(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                sum += arr[i][j];
        return sum;
    }
}