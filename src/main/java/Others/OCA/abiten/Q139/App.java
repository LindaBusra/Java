package Others.OCA.abiten.Q139;

public class App {

     int count;     //it must be static int count for w can call it from a static method

    public static void displayMsg(){
//        System.out.println("Welcome Visit Count: " + count++);  //line n1

    }


    public static void main(String[] args) {

        App.displayMsg();
        displayMsg();           //line 2
    }
}

/*
What is the result?
A. Welcome Visit Count:0Welcome Visit Count: 1
B. Compilation fails at line n2.
C. Compilation fails at line n1.        +
D. Welcome Visit Count:0Welcome Visit Count: 0
Answer: C
 */


