package Others.OCA.abiten.Q177;

class Bird {
    public void fly() {
        System.out.println("Fly.");
    }



    public static void main(String[] args) {

//	/* insert code snippet here */

Bird b = new Peacock ();
Peacock p = (Peacock) b;

        p.fly();
        p.dance();

    }}

/*
Which code snippet can be inserted to print Fly.Dance. ?
A. Bird p = new Peacock();
B. Bird b = new Bird();Peacock p = (Peacock) b;
C. Peacock b = new Peacock ();Bird p = (Bird) b;
D. Bird b = new Peacock ();Peacock p = (Peacock) b;   +
Answer: D
 */