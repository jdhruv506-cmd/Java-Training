public class linearsearch {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 35, 45, 50};
        int target = 50;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    
}
