import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Order {

	public static void swap(int[] input, int x, int y) {

	}

	public void order_begin() {
	}

	public void insert_sort() {

		int[] input = new int[20];
		System.out.println("the oringnal one");
		for (int i = 0; i < input.length; i++) {
			input[i] = (int) (100 * Math.random());
			System.out.print(input[i]+",");
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				// move one position
				if (input[j] < input[i]) {
					int tmp = input[j];
					for (int k = j; k > i; k--) {
						input[k] = input[k - 1];
					}
					input[i] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("after order");
		for(int x:input)
		{
			System.out.print(x+",");
		}
	}

	public void bubble() {
		// Simple_Case simp = new Simple_Case();
		ArrayList<Integer> input = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 20; i++) {
			int x = (int) (100 * Math.random());
			input.add(x);
		}

		for (int i = 0; i < 5; i++) {
			int x = (int) (100 * Math.random());
			set.add(x);
		}

		for (int x = 0; x < input.size(); x++) {
			System.out.print(input.get(x));
			System.out.print(",");

		}
		Iterator<Integer> iterator = set.iterator();
		System.out.println();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + ",");
		}

		System.out.println();
		System.out.println("now output the MIX->MAX");

		for (int i = input.size(); i > 0; i--) {
			for (int j = 1; j < i; j++) {
				if (input.get(j - 1) > input.get(j)) {
					int tmp = input.get(j);
					input.set(j, input.get(j - 1));
					input.set(j - 1, tmp);
				}

			}
		}

		for (int x = 0; x < input.size(); x++) {
			System.out.print(input.get(x));
			System.out.print(",");
		}

		for (int i = input.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (input.get(j) < input.get(j + 1)) {
					int tmp = input.get(j);
					input.set(j, input.get(j + 1));
					input.set(j + 1, tmp);
				}
			}
		}
		System.out.println();
		System.out.println("now output the MAX>MIN");

		for (int x = 0; x < input.size(); x++) {
			System.out.print(input.get(x));
			System.out.print(",");
		}
	}
}
