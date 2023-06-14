package Others.OCA.abiten.Q066;

public class Q066 {

    // And the code fragment:
    public static void main(String[] args) {

        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2;
        I t = obj1;
        t.displayI();
        s.displayC2();
    }
}


//What is the result?
//A. C1C2
//B. C1C1
//C. Compilation fails.
//D. C2C2
//Answer: A