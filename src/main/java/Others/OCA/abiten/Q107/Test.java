package Others.OCA.abiten.Q107;

public class Test {

    public static void main(String[] args) {


        boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        System.out.println(a + " " + b);


    }
}

/*
And given the commands
javac Test.java
java Test 1 null

What is the result
A. 1 null
B. true false
C. false false    ++   I think the result is this one
D. true true
E. A ClassCastException is thrown at runtime.
Answer: D

 */