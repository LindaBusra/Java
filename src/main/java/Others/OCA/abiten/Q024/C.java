package Others.OCA.abiten.Q024;

public class C extends B{

    public C(){
        System.out.print("C ");
    }


    public static void main(String[] args) {

        C c = new C();  // A B C
        A a = new A();  //A B C A
    }
}
