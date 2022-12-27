package JavaLessons.day18_datetime_class_vararrgs.BuildClass01;

import java.awt.*;

public class Tree {

    //Classes only represent a general blueprint
    //you use constructor to bring your blueprint to life


    //attributes
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;          //ENUM
    static  Color Trunk_Color = new Color(102, 51, 0);


    //Constructor -->we use constructor to build instances
    Tree(double heightFt,double trunkDiameterInches, TreeType treeType ){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    //behaviours
    void  grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }


    static void  announceTree(){
        System.out.println("Look out for that " + Trunk_Color + " tree!");
    }


    void annonceTallTree(){

        if(this.heightFt > 100) {
            System.out.println("That is a tall " + this.treeType + " tree!");
        }


    }

}
