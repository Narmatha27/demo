package addon_dsa;

public class Upper_Bound {

	
		
		    public static int upperBound(int[] nums, int target) {
		        int left = 0, right = nums.length; 
		        while (left < right) {
		            int mid = left + (right - left) / 2;
		            if (nums[mid] <= target) {
		                left = mid + 1;
		            } else {
		                right = mid; 
		            }
		        }
		        return left;
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 4, 4, 5, 6};
		        int target = 4;
		        int index = upperBound(arr, target);
		        System.out.println("Upper bound index: " + index);  
		    }
		}

