class ArrayCalculator {
    // B17
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static double sumOfArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    // B18
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            max = (arr[i] > max) ? arr[i] : max;
        return max;
    }
    public static double maxOfArray(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++)
            max = (arr[i] > max) ? arr[i] : max;
        return max;
    }
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            min = (arr[i] < min) ? arr[i] : min;
        return min;
    }
    public static double minOfArray(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++)
            min = (arr[i] < min) ? arr[i] : min;
        return min;
    }
}
