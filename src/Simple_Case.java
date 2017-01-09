import java.util.ArrayList;

public class Simple_Case {
	public void log_int(int num) {
		System.out.print(num + ',');
	}

	public void log_string(String str) {
		System.out.println(str);
	}

	public void log(Object obj) {
		System.out.println(obj);
	}

	public int[] reverse(int[] nums) {

		log_string("begin reverse");
		for (int j = 0; j < nums.length / 2; j++) {
			int tmp = nums[j];
			nums[j] = nums[nums.length - 1 - j];
			nums[nums.length - 1 - j] = tmp;
		}
		return nums;

	}

	public int max(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	public int[] move1(int[] input) {
		int tmp = input[input.length - 1];
		for (int i = input.length - 1; i > 0; i--) {
			input[i] = input[i - 1];
		}
		input[0] = tmp;
		return input;

	}

	public float average(int[] input, ArrayList<Integer> output) {
		System.out.println();
		log("enter func average");
		int total = 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}
		float average_val = total / input.length;
		log("the average_val is " + average_val);
		for (int i = 0; i < input.length; i++) {
			if (input[i] < average_val) {
				log("found a value below avergae:" + input[i] + " < " + average_val);
				output.add(input[i]);
			}
		}
		return average_val;
	}

	public void mod(int[] a) {
		System.out.println();
		int[] b = new int[10];
		for (int i = 0; i < a.length; i++) {
			b[a[i] % 10]++;
		}

		for (int x : b) {
			System.out.println(x);
		}

	}

	public void looplist(int[] looplist, int index) {
		System.out.println();
		int length = looplist.length;
		for (int x = 0; x < length; x++) {
			if (x != index - 1) {
				System.out.println();
				for (int i = x; i < length; i++) {
					if (i != index - 1) {
						System.out.print(looplist[i] + ",");
					}
				}
				for (int j = 0; j < x; j++) {
					if (j != index - 1) {
						System.out.print(looplist[j] + ",");
					}
				}
			} else {
				continue;
			}

		}

	}

	public void maxsubstring(String input) {
		System.out.println();
		String output = new String();

		int pivot = 0;
		// System.out.println();
		while (pivot++ < input.length()) {
			int max = 0;
			for (int i = pivot; i < input.length(); i++) {
				if (input.charAt(i) > max) {
					max = input.charAt(i);
					pivot = i;
				}
			}

			output += (char) max;
		}

		System.out.println(output);
	}

	/**
	 * 1、快速找出一个数组中的最大数、第二大数。
	 * 
	 * @param input
	 * @return
	 */
	public int[] max_secondmax(int[] input) {
		int output[] = new int[2];
		int max_value = input[0];
		int second_value = input[0];
		if (input.length <= 2) {
			output = input;
		} else {
			for (int i = 0; i < input.length; i++) {
				if (input[i] > max_value) {
					max_value = input[i];
				}
			}

			for (int i = 0; i < input.length; i++) {
				if (input[i] > second_value && input[i] != max_value) {
					second_value = input[i];
				}
			}
		}
		System.out.print(max_value + "," + second_value);
		return output;
	}

	/**
	 * 2、试着用最小的比较次数去寻找数组中的最大值和最小值。
	 * 
	 * @param input
	 */
	public void minmax(int[] input) {
		int min = input[0];
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			} else {
				min = input[i];
			}

		}
		System.out.print(max + "," + min);

	}

	/**
	 * 3、重排问题 给定含有n个元素的整型数组a，其中包括0元素和非0元素，对数组进行排序，要求：
	 * 1、排序后所有0元素在前，所有非零元素在后，且非零元素排序前后相对位置不变 2、不能使用额外存储空间 例子如下 输入 0、3、0、2、1、0、0
	 * 输出 0、0、0、0、3、2、1
	 */
	public void reorder(int[] input) {
		int j = 0;
		for (int i = input.length-1; i > 0; i--) {
			if (input[i] == 0) {
				// find the 1st not 0,begin to move
				for (j = 0; j < input.length; j++) {
					// find the 1st not zero one
					if (input[j] != 0) {
						for(int k=input.length-1;k>j;k--)
						{
							input[k]=input[k-1];
						}
						break;
					}
				}
				input[j] = 0;
			}
		}
		for(int x:input)
		{
			System.out.print(x+",");
		}
	}

}
