public class binarysearch {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 35, 45, 50};
        int target = 50;
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                found = true;
                System.out.println("Element " + target + " found at index: " + mid);
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    
}
