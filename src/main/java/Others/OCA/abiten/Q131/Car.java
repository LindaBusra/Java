package Others.OCA.abiten.Q131;

public class Car extends Vehicle {

    int y;

    Car() {
        super();
//        this(20);   // line n2
    }

    Car(int y) {
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main (String[] args) {
       Vehicle y = new Car(20);
       System.out.println(y);
    }

}

/*
What is the result?
A. 10:20
B. 0:20
C. Compilation fails at line n1
D. Compilation fails at line n2  +
Answer: D
 */