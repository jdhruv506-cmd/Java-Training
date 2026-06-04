import java.util.Scanner;
public class Sumofarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Enter " +size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("The sum of the numbers in the array is: " + sum);
        scanner.close();
    }
    
}
