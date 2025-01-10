import java.util.Arrays;

public class SortingAlgo {

    public static void mySelectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minPos]) {
                    minPos = j;
                }
            }
            int temp = nums[i]; // swapping the min elem with i
            nums[i] = nums[minPos];
            nums[minPos] = temp;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 6, 1, 2, 1, 8, 5, 1};
    }
}
