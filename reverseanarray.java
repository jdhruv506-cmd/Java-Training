public class reverseanarray {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 35, 45, 50};
        int[] reversedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("The reversed array is:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }
    
}
