package Others.OCA.abiten.Q134;

public class A2 {           //it was private class A2, compile time error

    private static int i;
    private A2(){

    }
}

/*
We can not declare top level class as private. Java allows only public and
default modifier for top level classes in java. Inner classes can be private.
 */