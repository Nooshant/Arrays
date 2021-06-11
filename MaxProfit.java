
public class MaxProfit {

	public static void main(String[] args) {
		
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = {7,6,4,3,1};
		int price[] = {10, 22, 5, 75, 65, 80};
		maxProfit(arr);
		maxProfit(arr1);
		maxProfit(arr2);
		maxProfit(price);
	}

	private static void maxProfit(int[] arr) {
		int pIndex = 0;
		int sIndex = 0;
		int sum = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] < arr[i]) {
				sIndex = i;
			} else if (arr[i - 1] > arr[i]) {
				if (sIndex > pIndex) {
					sum = sum + arr[sIndex] - arr[pIndex];
				}
				pIndex = i;
				sIndex = i;
			}
		}

		System.out.println("Maximum Profit:" + sum);
	}
}
