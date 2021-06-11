package top.question;

public class LargestNumber {

	public void largestNumber(int[] nums) {
		
		String result = ""+nums[0];

		for (int i = 1; i < nums.length; i++) {
			String str1 = result + nums[i];
			String str2 = nums[i] + result;

			if (str1.compareTo(str2) > 1) {
				result = str1;
			} else {
				result = str2;
			}
		}
		System.out.println("Lagrest number: "+result);
	}

	public static void main(String[] args) {
		LargestNumber obj = new LargestNumber();
		int []nums = {3,30,34,5,9};
		obj.largestNumber(nums);
	}

}
