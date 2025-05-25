import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter all elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("All elements of the array: ");
        printArr(arr);
       
        // System.out.println("Max of array: " + maxOfArr(arr));
        
        // System.out.print("All even elements of the array: ");
        // printEvenElements(arr);
               
        // System.out.println("Sum of array: " + sumOfArr(arr));
                
        // System.out.print("Enter the number to compare: ");
		// int k = sc.nextInt();
        // System.out.println("The number of elements equal to " + k + ": " + countElementEqualToValue(arr, k));

        // int start = 0;
        // int end = 10;
        // System.out.print("All elements of the array from " + start + " to " + end + ": ");
        // printElementsInRange(arr, start, end);

        sortAscending(arr);
        System.out.print("Array after sorting ascending: ");
        printArr(arr);



        // String[] arr = new String[n];
		// for (int i = 0; i < n; i++)
		// 	arr[i] = sc.next();
    }



    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int maxOfArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void printEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int sumOfArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static int countElementEqualToValue(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value)
                count++;
        return count;
    }

    public static void printElementsInRange(int[] arr, int start, int end) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] >= start && arr[i] <= end)
                System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }



    public static void strsWhoseLengthGrtThanLen(String[] arr, int len) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].length() > len)
                System.out.print(arr[i] + " ");
        System.out.println();
    }
}