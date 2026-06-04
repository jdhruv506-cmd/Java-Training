public class prefixsum {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 35, 45, 50};
        int[] prefixSum = new int[numbers.length];

        prefixSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        System.out.println("The prefix sum array is:");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.println(prefixSum[i]);
        }
    }
    
}
