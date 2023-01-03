package JavaLessons.day23_encapsulation_abstraction.BuildClass01;

import java.awt.*;

public class Tree {

    //Classes only represent a general blueprint
    //you use constructor to bring your blueprint to life


    //attributes
    protected  static  Color Trunk_Color = new Color(102, 51, 0);

    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;          //ENUM


    //Constructor -->we use constructor to build instances
    public Tree(double heightFt,double trunkDiameterInches, TreeType treeType ){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }


    public static Color getTrunk_Color() {
        return Trunk_Color;
    }

    public static void setTrunk_Color(Color trunk_Color) {
        Trunk_Color = trunk_Color;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }


    void  grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }
}
