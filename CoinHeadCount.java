import java.util.Arrays;

public class CoinHeadCount {
	
	private static void headFacedCoinCount(int number) {
		int[] arrangement = new int[number+1];
		Arrays.fill(arrangement, 1);
		for (int i = 2; i < arrangement.length;i++) {
			for (int j = i; j < arrangement.length; j=j+i) {
				if (arrangement[j] == 0) {
					arrangement[j] = 1;
				} else if (arrangement[j] == 1) {
					arrangement[j] = 0;
				}
			}
		}
		int headCount=0;
		for (int i = 1; i < arrangement.length; i++) {
			 if (arrangement[i] == 1) {
				 headCount++;
			}
		}
		System.out.println("Coin with Head faced... count:"+headCount);
	}	
	
	public static void main(String[] args) {
		headFacedCoinCount(50);
	}
}
