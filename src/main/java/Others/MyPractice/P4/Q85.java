package Others.MyPractice.P4;

import java.util.LinkedList;

public class Q85 {
    public static void main(String[] args) {


//Task: If the number of characters is more than 4 and starts with "M", remove them from the LinkedList
//Interview Question

        LinkedList<String> name = new LinkedList<>();
        name.add("Tom");
        name.add("Jane");
        name.add("Mary");
        name.add("Madonna");
        name.add("Terje");
        name.add("Emily");
        name.add("Marianne");
        name.add("Einar");
        name.add("Mila");



        //1.way
        name.removeIf(t-> t.length()>4 && t.startsWith("M"));
        System.out.println(name);




        //2.way
        for(int i=0; i<name.size(); i++) {

            if(name.get(i).length()>4 && name.get(i).charAt(0)=='M') {
                name.remove(name.get(i));       //since removing one element we should decrease the index
                                                // while the indexes will change after every iteration
                i--;
            }
        }

        System.out.println(name);







//        for(int i =0; i<name.size(); i++){
//
//            if(name.get(i).length()>4){
//                name.remove(name.get(i));
//                i--;             //since the indexes will change after every iteration
//            }
//        }
//        System.out.println(name);// [Tom, Jane, Mary, Ali]
    }
}
