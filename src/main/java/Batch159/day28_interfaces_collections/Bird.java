package Batch159.day28_interfaces_collections;

public class Bird {

int price=50;
Bird(){

}

public Bird(int price){

    this.price=price;

}

    public static void main(String[] args) {

    Bird b1 =  new Bird(50);
        System.out.println(b1.price);
    }
}
