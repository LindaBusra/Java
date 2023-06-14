package Others.OCA.abiten.Q179;

public class Test {


    static int count = 0;
    int i=0;

    public void changeCount(){
        while(i<5) {
            i++;
            count++;
        }
    }


    public static void main(String[] args) {

        Test check1 = new Test();
        Test check2 = new Test();

        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);
    }

}



/*
What is the result?
A. 5 : 5
B. 10 : 10   +
C. 5 : 10
D. Compilation fails.
Answer: B
 */