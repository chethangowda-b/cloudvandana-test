import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(originalArray);

        System.out.println("Shuffled Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
	}
	 public static void shuffleArray(int[] arr) {
	        Random rand = new Random();

	        for (int i = arr.length - 1; i > 0; i--) {
	            int j = rand.nextInt(i);

	            // Swap arr[i] and arr[j]
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
}
