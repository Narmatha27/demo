package addon_dsa;

public class FrequencyCountBinarySearch {
    public static int firstOccurrence(int[] arr, int target) 
    {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) 
            {
                result = mid;
                high = mid - 1;  
            } else if (arr[mid] < target) 
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int frequencyCount(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        if (first == -1) return 0;  
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 5, 12, 24, 35, 77};  
        int target = 5;

        int count = frequencyCount(arr, target);
        System.out.println("Frequency of " + target + " is: " + count);
    }
}



