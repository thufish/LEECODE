
public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[10];
		for (int i = 0; i < input.length; i++) {
			input[i] = (int) (Math.random() * 100);
		}
		for (int x : input) {
			System.out.print(x + ",");
		}

		int size = input.length, temp, j;
		for (int i = 1; i < size; i++) {
			temp = input[i];
			for (j = i; j > 0 && temp < input[j - 1]; j--){
				input[j] = input[j - 1];
			}
			input[j] = temp;
		}
		System.out.println("after");
		for (int x : input) {
			System.out.print(x + ",");
		}

	}

}
