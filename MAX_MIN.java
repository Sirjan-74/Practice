import java.util.*;

public class MAX_MIN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is:");
        for (int i =0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr,0,size);//SORTING arr from 0 index to the size i.e last index
        System.out.println("\nThe sorted Array is:");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nMinimum value is: " + arr[0]);
        System.out.println("\nMaximum value is: " + arr[size-1]);
        sc.close();
    }
}
