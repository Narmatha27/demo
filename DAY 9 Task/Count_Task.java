package addon_dsa;

public class Count_Task {
	 public static int lowerBound(int[] nums, int target) {
	        int left = 0, right = nums.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target)
	                left = mid + 1;
	            else
	                right = mid;
	        }
	        return left;
	    }

	    public static int upperBound(int[] nums, int target) {
	        int left = 0, right = nums.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] <= target)
	                left = mid + 1;
	            else
	                right = mid;
	        }
	        return left;
	    }

	    public static int countOccurrences(int[] nums, int target) {
	        return upperBound(nums, target) - lowerBound(nums, target);
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 4, 4, 5, 6};
	        int target = 4;
	        int count = countOccurrences(arr, target);
	        System.out.println("Count of " + target + ": " + count); 
	    }

}
