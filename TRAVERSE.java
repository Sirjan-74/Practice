import java.util.*;
public class TRAVERSE {
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

        System.out.println("\nThe reversed array is:");
        for (int i =size-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
//without scanner 
//public class TRAVERSE {
//    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4, 5};
//        System.out.println(num[2]);
//        for (int i :num) {
//            System.out.println(i);
//        }
//    }}
//public class TRAVERSE {
//    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4, 5};
//        System.out.println(num[2]);
//        for (int i=num.length- 1; i>=0;i--) {
//            System.out.println(num[i]);
//        }
//    }
//}
