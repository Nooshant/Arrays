package com.duke.array;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int[] A = { 1, 2, 5, 6, 3, 2 };
		int[] B = { 2, 2 };
		 
        System.out.println("The duplicate element is " + findDuplicate(B));
	}

	private static int findDuplicate(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		int len = arr.length;
		int summation = len * (len + 1) / 2;
		System.out.println(summation + "  " + sum);

	    int slow = arr[0];
	    int fast = arr[0];
	    do
	    {
	        slow = arr[slow];
	        fast = arr[arr[fast]];
	    } while (slow != fast);
	    
	    int ptr1 = arr[0];
	    int ptr2 = slow;
	    while (ptr1 != ptr2)
	    {
	        ptr1 = arr[ptr1];
	        ptr2 = arr[ptr2];
	    }
	 
	    return ptr1;
	}

}
