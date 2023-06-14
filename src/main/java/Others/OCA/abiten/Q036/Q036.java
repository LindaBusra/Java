package Others.OCA.abiten.Q036;

public class Q036 {
    public static void main(String[] args) {

        System.out.println("------version 1--------------");

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " " );
            if (arr[i].equals("A")) {
                continue; // it means go out from loop and continue
            }
            System.out.println("Work Done");
            break;
        }
//What is the result?
//A B Work Done


//----------------------------------------------------------------------------------------------


        System.out.println("------version 2--------------");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " " );
            if (arr[i].equals("C")) {
                continue; //
            }
            System.out.println("Work Done");
            break;
        }

//What is the result?
//A Work Done

//----------------------------------------------------------------------------------------------


        System.out.println("------version 3--------------");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " " );
            if (arr[i].equals("A")) {
                continue;
            }
            System.out.println("Work Done");

        }

/*
A
B
Work Done
C
Work Done
D
Work Done
 */



//----------------------------------------------------------------------------------------------


        System.out.println("------version 4--------------");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " " );
            if (arr[i].equals("A")) {
                break;
            }
            System.out.println("Work Done");
            continue;
        }


//A


//----------------------------------------------------------------------------------------------


        System.out.println("------version 5--------------");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " " );
            if (arr[i].equals("D")) {
                continue;
            }
            System.out.println("Work Done");
            continue;
        }

/*
A
Work Done
B
Work Done
C
Work Done
D
 */





//----------------------------------------------------------------------------------------------

    }
}



