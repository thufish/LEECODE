import java.util.*;

public class Solution {
	public void test(String casename) {
		if (casename == "twoSum") {
			int[] input = { 2, 7, 11, 12 };
			int[] result = new int[2];
			System.out.println("the inout array is ");
			for (int i = 0; i < input.length; i++) {
				System.out.println(input[i] + ",");
			}
			result = twoSum(input, 13);
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i] + ",");
			}
		}

		else if (casename == "threeSum") {
			int[] input = { -1, 0, 1, 2, -1, -4 };
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			result = threeSum(input);
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i) + ",");
			}
		}

		else if (casename == "hammingDistance") {
			int ret = hammingDistance(1, 4);
			System.out.println(ret + ",");
		}

		else if (casename == "largestPalindrome") {
			int ret = largestPalindrome(2);
			System.out.println(ret + ",");

		} else if (casename == "removeDuplicates") {
			int[] input = { 1,1,2};
			int ret = removeDuplicates(input);
			System.out.println();
			System.out.println("the return value is " + ret);
		}

	}

	/**
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}

		return result;

	}

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						ArrayList<Integer> al = new ArrayList<Integer>();
						al.add(nums[i]);
						al.add(nums[j]);
						al.add(nums[k]);
						result.add(al);
						count++;
					}
				}
			}
		}
		System.out.println(count);
		/*
		 * for(int i=0;i<3;i++){ for(int j=0;j<count;j++){
		 * if(result.get(i).get(j) } }
		 * 
		 * }
		 */
		return result;

	}

	public int hammingDistance(int x, int y) {
		int z = x ^ y;
		int count = 0;
		while (z != 0) {
			if (z % 2 != 0) {
				count++;
			}
			z = z / 2;
		}
		return count;
	}

	public int largestPalindrome(int n) {
		int ret_val = 0;
		if (n == 1) {
			ret_val = 9;
		} else {
			int max = (int) (Math.pow(10, n) - 1);
			int min = (int) (Math.pow(10, n - 1) - 1);
			long max_value = max * max;
			int begin_val = (int) (max_value / (Math.pow(10, n)));
			while (max > min) {
				long palindrome = create_palindrome(begin_val);
				if (palindrome % max != 0) {
					begin_val--;
					max--;
				} else {
					ret_val = (int) (palindrome / max);
				}
			}
		}
		return ret_val;
	}

	public long create_palindrome(int n) {
		String s1 = new StringBuilder().append(n).reverse().toString();
		String s2 = new String().valueOf(n);

		return Long.parseLong(s2 + s1);
	}

	public int removeDuplicates(int[] nums) {
		/*
		int end = nums.length;
		for (int i = 1; i < end; i++) {
			if (nums[i - 1] == nums[i]) {
				end--;
				for (int j = i; j < nums.length; j++) {
					// int tmp=nums[j];
					nums[j - 1] = nums[j];
				}
			}
		}
		System.out.println();

		for (int x = 0; x < end ; x++) {
			System.out.print(nums[x] + ",");
		}
		return end ;
		*/
		
		
	      int end=nums.length;
	        for(int i=0;i<end;i++){
	            if(nums[i]==nums[i+1]){
	                 end--;
	                for(int j=i;j<end;j++){
	                    nums[j]=nums[j+1];
	                }
	            }
	        }
	        return end+1;
	        
		/*
		  if (A.length==0) return 0;
		    int j=0;
		    for (int i=0; i<A.length; i++)
		        if (A[i]!=A[j]) A[++j]=A[i];
		    return ++j;
		    */
	}
}