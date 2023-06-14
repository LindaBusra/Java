package Others.Topics.Class.WithConstructor;

public class Car {

//I defined fields, properties.
    private String color;
    private String model;
    private double engine;
    private int doors;

    private String owner;


    public Car(String color, String model){
        this(color, model,0, 0, null);
    }



    public Car() {
//        this.color="No any info";
//        this.model="No any info";
//        this.engine=0;
//        this.doors=0;
//        this.owner="No any info";
        //veya

        this("No any info","No any info",0,0,"No any info");  //I called the mothed which is bellow, like this



    }



    public Car(String color, String model,double engine,int doors, String owner ) {

        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;
        this.owner=owner;

    }


    public void showInfos() {
        System.out.println("The owners of car: "  + this.owner);
        System.out.println("The colors of car: "  + this.color);
        System.out.println("The model of car: "  + this.model);
        System.out.println("The engine of car: "  + this.engine);
        System.out.println("The doors of car: "  + this.doors);

    }

}
