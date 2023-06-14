package Others.OCA.abiten.Q004;

public class Q004 {

    public static void main(String[] args) {



        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        do {
            idx++;
        } while (idx < size - 1);
        System.out.print("The top element: " + stack[idx]);     //idx =2--> The top element: 30




        System.out.println("a");        //idx =1--> The top element: 20
        do {
            idx++;
        } while (idx >= size);
        System.out.print("The top element: " + stack[idx]);
        System.out.println("\n");



//        System.out.println("b");        //idx =3--> ArrayIndexOutOfBoundsException
//        while(idx < size){
//            idx++;
//        }
//        System.out.print("The top element: " + stack[idx]);
//        System.out.println("\n");



        System.out.println("c");        //idx =2--> The top element: 30
        do {
            idx++;
        }while(idx < size-1);
        System.out.print("The top element: " + stack[idx]);
        System.out.println("\n");



//        System.out.println("d");        //idx =4--> ArrayIndexOutOfBoundsException
//        do {
//            idx++;
//        }while(idx <= size);
//
//        System.out.print("The top element: " + stack[idx]);
//        System.out.println("\n");


//        System.out.println("e");        //idx =3--> ArrayIndexOutOfBoundsException
//        while(idx <= size -1){
//            idx++;
//
//        }
//        System.out.print("The top element: " + stack[idx]);


}}