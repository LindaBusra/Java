package JavaLessons.day12_StaticBlock;

public class AbC {

    //What is the output?

    public AbC()    { System.out.println("Constructor initialised");
    }

    { System.out.println("Instance Initializer block"); }

    public static void main(String args[])

    {AbC obj = new AbC (); }

}

