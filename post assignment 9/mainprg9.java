package addon_dsa;

public class mainprg9 {


		    public static int findRank(int[] nums, int target) {
		        int left = 0, right = nums.length;
		        while (left < right) {
		            int mid = left + (right - left) / 2;
		            if (nums[mid] <= target)
		                left = mid + 1;
		            else
		                right = mid;
		        }
		        return left;  	    }

		    public static void main(String[] args) {
		        int[] arr = {10, 20, 30, 30, 40, 50};
		        int target = 30;
		        int rank = findRank(arr, target);
		        System.out.println("Rank of " + target + ": " + rank); 
		    }
		}


