package JavaLessons.day13_arrays;

import java.util.Scanner;

public class Array38 {

    public static void main(String[] args) {



//Example - Ask the user to give number for multidimensional array, and write an md array with the given names


        Scanner klavye = new Scanner(System.in);
        System.out.println("Enter the value");
        int[][] tablo = new int[4][4];
        int k, j;

        System.out.print("[0,0]:");
        tablo[0][0] = klavye.nextInt();

        System.out.print("[0,1]:");
        tablo[0][1] = klavye.nextInt();

        System.out.print("[0,2]:");
        tablo[0][2] = klavye.nextInt();

        System.out.print("[0,3]:");
        tablo[0][3] = klavye.nextInt();

        System.out.print("[1,0]:");
        tablo[1][0] = klavye.nextInt();

        System.out.print("[1,1]:");
        tablo[1][1] = klavye.nextInt();

        System.out.print("[1,2]:");
        tablo[1][2] = klavye.nextInt();

        System.out.print("[1,3]:");
        tablo[1][3] = klavye.nextInt();

        System.out.print("[2,0]:");
        tablo[2][0] = klavye.nextInt();

        System.out.print("[2,1]:");
        tablo[2][1] = klavye.nextInt();

        System.out.print("[2,2]:");
        tablo[2][2] = klavye.nextInt();

        System.out.print("[2,3]:");
        tablo[2][3] = klavye.nextInt();

        System.out.print("[3,0]:");
        tablo[3][0] = klavye.nextInt();

        System.out.print("[3,1]:");
        tablo[3][1] = klavye.nextInt();

        System.out.print("[3,2]:");
        tablo[3][2] = klavye.nextInt();

        System.out.print("[3,3]:");
        tablo[3][3] = klavye.nextInt();

        System.out.println("Your salg table is like that:");
        System.out.println("Samsung-Iphone-General Mobile-Huawei");

        for (k = 0; k <= 3; k++) {
            for (j = 0; j <= 3; j++) {
                System.out.print(tablo[k][j] + " ");
            }
            System.out.println();
        }

    }
}
