package top.question;

public class PermuatationOfArray {
	
	public void permutation(int[] arr, int pos)
	{
		if(pos == arr.length-1)
		{
			printArray(arr);
			return;
		}
		for (int i = pos; i < arr.length; i++)
		{
			swap(arr,pos,i);
			permutation(arr,pos+1);
			swap(arr,pos,i);
		}
	}

	private void printArray(int[] arr) 
	{
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]\n");
	}
	
	
	private void swap(int[] arr, int pos, int i) {
		int temp = arr[pos];
		arr[pos] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) {
		PermuatationOfArray obj = new PermuatationOfArray();
		int[] arr = {1,2,3};
		obj.permutation(arr, 0);
	}

}
