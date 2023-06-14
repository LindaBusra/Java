package Others.OCA.abiten.Q149;

public class Q149 {

    public static void main(String[] args) {

        Boolean[] bool = new Boolean[2];

        bool[0] = new Boolean(Boolean.parseBoolean("true"));        //System.out.println(bool[0]);        //"true"
        bool[1] = new Boolean(null);        //        System.out.println(bool[1]);    //"false"

        System.out.println(bool[0] + " " + bool[1]);


        //Note
        //parseBoolean =Returns the value of this {@code Boolean} object as a boolean primitive.
        //new Boolean(null);  new Boolean(Boolean.parseBoolean("1"));  is false, because they are not boolean values
        Boolean[] booll = new Boolean[2];

        booll[0] = new Boolean(Boolean.parseBoolean("1"));
        System.out.println(booll[0]);


    }
}


/*
What is the result?
A. True false   +
B. True null
C. Compilation fails
D. A NullPointerException is thrown at runtime
Answer: A
 */