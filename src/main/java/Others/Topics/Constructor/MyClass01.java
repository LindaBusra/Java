package Others.Topics.Constructor;

public class MyClass01 {

        int num1;
        String name = "Ali";
        MyClass01(){
            char letter = 'c';
        }
        MyClass01(int num1){
            this();
            this.num1 = num1;
        }
        void MyClass01(){
            num1++;
        }

        public static int increase(int num2){
            return num2++;

        }

    public static void main(String[] args) {

        System.out.println(Add(5,3));
        selamlama();
        System.out.println(increase(5));

        int a =5;
        int b= a++;

        System.out.println(a);      //6
        System.out.println(b);      //5

    }

    public static int Add(int a, int b) {
            return a+b;
    }

    public static void selamlama() {
        System.out.println("Hei");
    }
    }


