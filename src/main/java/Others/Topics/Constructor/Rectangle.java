package Others.Topics.Constructor;

public class Rectangle {
    int length;
    int breadth;
    String color;
    //constructor 1
    Rectangle( int l , int b){
        length = l;
        breadth = b;
        color = "Green";
    }
    //constructor 2
    Rectangle(int l, int b, String c){
        length = l;
        breadth = b;
        color = c;
    }
    void display(){
        System.out.println("Length-" + length + "Breadth-" + breadth+ "Color" + color);

    }
    public static void main(String args[]){
        Rectangle obj1 = new Rectangle(2,4 );
        Rectangle obj2 = new Rectangle(2,4, "Green");
        obj1.display();
        obj2.display();


    }
}