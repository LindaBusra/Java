package Others.OCA.abiten.Q153;

public class FieldInit {

    Character c;
    boolean b;
    float f;
    char e;

    void printAll(){
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("e = " + e);
    }


    public static void main(String[] args) {

        FieldInit f = new FieldInit();
        f.printAll();
    }
}

/*
What is the result
c = null
b = false
f = 0.0
e =

 */