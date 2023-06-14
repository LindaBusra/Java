package Others.OCA.abiten.Q095;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(10, "IceCream"));
        list.add(new Product(11, "Chocolate"));

        Product p1 = new Product(10, "IceCream");
        System.out.println(list.indexOf(p1));


        //Answer is -1





    }
}
