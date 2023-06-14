package Others.OCA.abiten.Q175;

public class App {

    int foo;
    static int bar;

    static void process(){
//        foo += 10;    //it must be static
        bar += 10;
    }

    public static void main(String[] args) {
        App firstObj = new App();
        App.process();
        System.out.println(firstObj.bar);


        App secondObj = new App();
        App.process();
        System.out.println(secondObj.bar);

    }
}

/*
What is the result?
A. 10 * 20
B. A compile time error occurs
C. 20 * 20
D. 10 *10

Answer: B
 */
