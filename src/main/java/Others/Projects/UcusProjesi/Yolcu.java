package Others.Projects.UcusProjesi;

public class Yolcu {
    String city;
    String flytype;
    int age;

    public Yolcu(String city, String flytype) {
        this.city = city;
        this.flytype = flytype;
    }

    public Yolcu(String city, String flytype, int age) {
        this.city = city;
        this.flytype = flytype;
        this.age = age;
    }
}