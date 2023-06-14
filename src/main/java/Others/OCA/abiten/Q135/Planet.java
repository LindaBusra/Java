package Others.OCA.abiten.Q135;

public class Planet {
    public String name;
    public int moons;

    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

//    @Override                                      //to print ut we should use @override
//    public String toString() {
//        return "Planet{" +
//                "name='" + name + '\'' +
//                ", moons=" + moons +
//                '}';
//    }

    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2),

        };


//        System.out.println(Arrays.toString(planets));      //to print ut we should use like that
        System.out.println(planets);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);


        //What is the output?
    }
}