import java.util.ArrayList;
import java.util.Collections;

public class MAIN {
	public static void log(Object obj) {
		System.out.println(obj);
	}
	public static void log_line(Object obj) {
		System.out.print(obj);
	}
	public static void log_array(int[] input) {
		for (int i=0;i<input.length;i++)
		System.out.print(input[i]+",");
	}
	
	public  void case1(int[] input) {
		// case1
				/**
				 * Simple_Case reverse = new Simple_Case();
				int[] input = new int[] { 1, 2, 3, 4 ,5,6,7,8};
				reverse.reverse(input);
				for (int i = 0; i < input.length; i++)

				{
					log(input[i]);
				}
				**/
				
	}
	
	public  void case2(int[] input) {
		Simple_Case simp_obj = new Simple_Case();
		int num=simp_obj.max(input);
		log("the max value is " + num);	
	}
	
	public  void case3(int[] input) {
		Simple_Case simp_obj = new Simple_Case();
		log_array(input);
		simp_obj.move1(input);
		System.out.println();
		log_array(input);
	}
	
	public static float case4(int[] input,Simple_Case simp_obj) {
		float average=0;
		/**
		 * case 4 cauculate the average
		 */
		ArrayList<Integer> output=new ArrayList<Integer>();
		average=simp_obj.average(input, output);
		/*
		for (int i=0;i<output.size();i++)
		{
			System.out.println(output.get(i));
		}
		*/
		output.sort(null);
		Collections.reverse(output);  
		for(int s:output){
			System.out.print(s+",");
		}
		return average;
	}
	

	public static void main(String[] args) {
		System.out.println("Practice makes perfect!!");
		Simple_Case simp_obj = new Simple_Case();
		int[] input={0,3,4,0,2,0,1,0,5,0};
	//	simp_obj.looplist(input, 2);
	//	simp_obj.maxsubstring("amazon mobile");
	//	simp_obj.max_secondmax(input);
	//	simp_obj.minmax(input);
		simp_obj.reorder(input);
		
	//	Solution leecode = new Solution();
		//leecode.test("twoSum");
		//leecode.test("threeSum");
		//leecode.test("hammingDistance");
		//leecode.test("insert_sort"));
		//leecode.test("largestPalindrome");
	//	leecode.test("removeDuplicates");

		
		//Order order=new Order();
		//order.insert_sort();
		
		
		/*
		Simple_Case simp_obj = new Simple_Case();
		int[] input = new int[10]; 
		System.out.println("the inout array is ");
		for (int i =0; i<input.length; i++){	
			input[i] = (int)(100*Math.random());
			log_line(input[i] +",");
			}
		*/
		//case4 begin
		//float average_val=case4(input,simp_obj);
		//log("the average value is "+ average_val);
		
		//reverse case
		/*
		simp_obj.reverse(input);
		log_array(input);
		*/
		
		/**
		 * case6: 
		 * 6,要求定义一个int型数组a,包含100个元素,保存100个随机的4位数。再定义一个int型数组b，包含10个元素。统计a数组中的元素对10求余等于0的个数，保存
到b[0]中；对10求余等于1的个数，保存到b[1]中，……依此类推。
		 
		
		int[] case6=new int[100];
		for (int i =0; i<case6.length; i++){	
			//case6[i] = (int)(1000*Math.random());
			case6[i] = 2;
			log_line(case6[i] +",");
			}
			
		simp_obj.mod(case6);
		*/
		
		
		
		
		
	}

}
