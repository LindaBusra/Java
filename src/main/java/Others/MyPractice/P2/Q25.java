package Others.MyPractice.P2;

import java.util.Arrays;
import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {



/*   Put all zeros to end in an integer array. You can change order of elements.
     {3, 0, 4, 2, 0} ==> {2, 3, 4, 0, 0}
     {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
 */

    int arr1 [] ={3, 0, 4, 2, 0};
        Arrays.sort(arr1);


    int arr2[]  = new int[arr1.length];
    int k = 0;

    for(int i=arr1.length-1; i>=0; i--) {

        arr2[k] = arr1[i];
        k++;
    }

        System.out.println(Arrays.toString(arr2));





/*   Ask user to enter arrays element. And put the zeros to the end without change order the other elements
     Put all zeros to end in an integer array
     {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
     {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Arrays04");
        int length = scanner.nextInt();
        System.out.println("Enter elements of array");
        int[] arr = new int[length];

        int arrNew[] = new int[length];


        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] != 0) {

                arrNew[idx] = arr[i];
                idx++;
            }
        }


        System.out.println(Arrays.toString(arrNew));









    }
}
