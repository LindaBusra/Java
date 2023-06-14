package Others.OCA.abiten.Q037;

public class Q037 {

    public static void main(String[] args) {

        int data [] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {
            if (e !=key) {
                continue;
//				count++;   //gives error with red line: delete unreachable statement
            }
        }
        System.out.println(count + " Found");


//What is the result?
//A.	Compilation fails.
//B.	0 Found
//C.	1 Found
//D.	3 Found




        System.out.println("\nVersion 2");
        count = 0;
        for (int e : data) {
            if (e !=key) {
                count++;
                continue;
            }
        }
        System.out.println(count + " Found");





        System.out.println("\nVersion 3");
        count = 0;
        for (int e : data) {
            if (e !=key) {
                count++;
                break;
            }
        }
        System.out.println(count + " Found");





        System.out.println("\nVersion 4");
        count = 0;
        for (int e : data) {
            if (e !=key) {
                continue;
            }
        }
        System.out.println(count + " Found");
        count++;

    }

}

