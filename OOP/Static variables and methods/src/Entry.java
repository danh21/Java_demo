class Entry {
	public static void main(String[] args) {
        // B15
		/*System.out.println(Math.PI);
		System.out.println(Math.abs(-2));
		System.out.println(Math.add(2, 3));
		System.out.println(Math.subtract(2, 3));
		System.out.println(Math.min(2, 3));
		System.out.println(Math.max(2, 3));
		System.out.println(Math.pow(2, 3));*/

        // B17
        /*int[] arr1 = new int[] {3, 4, 2};
		double[] arr2 = new double[] {1.3, 4.2, 6.7};
		System.out.println(ArrayCalculator.sumOfArray(arr1));
		System.out.println(ArrayCalculator.sumOfArray(arr2));*/

        // B18
        /*int[] arr1 = new int[] { 3, 4, 2 };
		double[] arr2 = new double[] { 1.3, 4.2, 6.7 };	
		System.out.println(ArrayCalculator.minOfArray(arr1));
		System.out.println(ArrayCalculator.minOfArray(arr2));
		System.out.println(ArrayCalculator.maxOfArray(arr1));
		System.out.println(ArrayCalculator.maxOfArray(arr2));*/

        // B19
        Student s1 = new Student();
		s1.display();
		Student s2 = new Student("Quang");
		s2.display();
		Student s3 = new Student('m');
		s3.display();
		Student s4 = new Student("Thu", 'f');
		s4.display();
	}
}