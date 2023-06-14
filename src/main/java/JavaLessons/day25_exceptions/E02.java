package JavaLessons.day25_exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = { "A", "C", "B", "Z"};

        String r1 = getElement(a, 2);
        System.out.println(r1);//B

        String r2 = getElement1(a, 5);//ArrayIndexOutOfBoundsException  ==> There is no index 5 in the array


    }

    //Create a method to get any element from an Arrays04
    public static String getElement(String a[], int idx){

        return  a[idx] ;
    }

    //for unexpected issue:
    public static String getElement1(String a[], int idx){

        String s = "";
        try {
            s = a[idx];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occurred in array indexes"); //This one is the message of the programmer
            //If you want you can get the message from Java ==> e.getMessage()
            System.out.println(e.getMessage());  //gives technical message about the exception

            e.printStackTrace(); //It will print all the steps in Exception ==> It will give detailed technical message about exception
        }
        return s;
    }

//at JavaLessons.day25_Exceptions.E02.getElement1(E02.java:27)-->start line for un-expected issue
//at JavaLessons.day25_Exceptions.E02.main(E02.java:12)..>visible line for un-expected issue
}