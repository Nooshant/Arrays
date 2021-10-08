
public class SearchIndexOfOneInZeroOneArray {

    public static void searchIndexOfOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == 1 && arr[mid - 1] == 0) {
                System.out.println("index: " + mid);
                return;
            }
            if (arr[mid] == 1) {
                j = mid - 1;
            } else if (arr[mid] == 0) {
                i = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
		searchIndexOfOne(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    }

}
