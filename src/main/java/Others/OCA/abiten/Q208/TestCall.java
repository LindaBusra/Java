package Others.OCA.abiten.Q208;

public class TestCall {

    public static void main(String[] args) {


        Caller c = new Caller();
//        c.start();      //line n1
//        c.init();       //line n2
    }
}


/*
What is the result?
A. Compilation fails at line n1.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails at line n2.
Answer: D         but actually Compilation fails at line n1 and line n2.
 */