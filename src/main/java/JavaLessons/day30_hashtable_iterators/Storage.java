package JavaLessons.day30_hashtable_iterators;

public class Storage {



    int quantity;

    String color;

    double price;

    String productOwner;

    int order;

    public static int productId=1;


    public Storage(int quantity, String color, double price, String productOwner, int order) {

        this.quantity = quantity;
        this.color = color;
        this.price = price;
        this.productOwner = productOwner;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Storage[ ProductId:" + productId++ +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", price=" + price +
                "$, productOwner='" + productOwner + '\'' +
                ", order=" + order +
                ']';
    }
}





