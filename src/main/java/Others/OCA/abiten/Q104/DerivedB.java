package Others.OCA.abiten.Q104;

 class DerivedB extends DerivedA{

    public void test(){
        System.out.println("DerivedB");
    }


    public static void main(String[] args) {

        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3;       //new DerivedB();

        b1= (Base) b2;      //new DerivedA();
        b1.test();          //new DerivedA();
        b4.test();          //new DerivedB();
    }
}

/*
DerivedA
DerivedB
 */