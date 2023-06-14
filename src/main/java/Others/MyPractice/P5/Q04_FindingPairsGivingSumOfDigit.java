package Others.MyPractice.P5;

public class Q04_FindingPairsGivingSumOfDigit {

    public static void main(String[] args) {



 /* Create a method from a given array and find all pairs of the integers whose
 sum is a given number
 {4,6,5,-10,8-5,20} ==>   */

        int given = 10;
        int arr[] = {4, 6, 5, -10, 7, 8, 5, 20};

        findPairs(arr, 11);


    }
        public static void findPairs(int []arr, int number) {


            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == number) {

                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }

            }


        }
    }




