import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number of elements: ");
        int num = sc.nextInt();
        int[] array = new int[num];

        System.out.println("Enter " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int target = sc.nextInt();
        for (int i = 0; i < num; i++) {

            if (array[i]==target) {
                System.out.println("Found at: "+i);
                return;
            }}
        System.out.println("Not Found");

        }
    }
