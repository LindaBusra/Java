package Others.OCA.abiten.Q143;

public class Fieldint { //Public class Fieldinit


    char c;
    boolean b;
    float f;
    double d;
    Character e;
    void printAll() {
        System.out.println("c= "+c);//c=
        System.out.println("b= "+b);//b=false
        System.out.println("f= "+f);//f=0.0
        System.out.println("d= "+d);//d=0.0
        System.out.println("e= "+e);//e=null
    }
    public static void main(String[] args) {
        Fieldint f=new Fieldint();
        f.printAll();
    }

}


//Answer: c=
//		b = false
//		f = 0.0