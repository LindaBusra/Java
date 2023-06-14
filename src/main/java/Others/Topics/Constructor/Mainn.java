package Others.Topics.Constructor;

class Mainn {

    String language;

    // constructor with no parameter
    Mainn() {
        this.language = "Java";
    }

    // constructor with a single parameter
    Mainn(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        Mainn obj1 = new Mainn();

        // call constructor with a single parameter
        Mainn obj2 = new Mainn("Python");

        obj1.getName();
        obj2.getName();
    }
}