package JavaLessons.day10_dowhileloop;

public class WhileLoops01 {
    public static void main(String[] args) {



//Type code to print integers from 3 to 6

//use for loop

    for(int i=3; i<7; i++) {
        System.out.print(i + " ");
    }
        System.out.println();


    //use while

    int i = 3;

    while(i<7) {
        System.out.print(i +" ");
        i++;
    }
    System.out.println();





//Example: Type code to print odd integers from 12 to 67 in the same line with a space betweeen them

        int j=12;
        while(j<68) {
            if(j%2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();





//Type Hello 5 times on the console with while


        int m=1;
        while(m<6) {

            System.out.println("Hello");
            m++;
        }
        System.out.println();

















    }
}
