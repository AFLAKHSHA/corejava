public class greatestnumberfromarray {
	public static void main(String[] args) {
		int array[] = { 27, 26, 28, 29, 30, };
		int largest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest)
				
			largest = array[i];
		}
		System.out.println(largest);
	}
}