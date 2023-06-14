package Others.OCA.abiten.Q120;

class Cart {
    Product p;  //null
    double totalAmount; //0.0
}

class Product {
    String name;
    Double price;
}



class Shop {

    public static void main(String[] args) {
        Cart c = new Cart();
        System.out.println(c.p + ":" + c.totalAmount);

    }
}

/*
What is the result?
A. null:null:0.0
B. null:null
C. <<HashCode>>:0.0
D. null:0.0   ++
Answer: D
 */