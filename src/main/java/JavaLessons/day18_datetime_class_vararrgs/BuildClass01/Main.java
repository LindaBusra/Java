package JavaLessons.day18_datetime_class_vararrgs.BuildClass01;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

       Tree myFavoriteOakTree =  new Tree(120, 12, TreeType.OAK);
       Tree myFavoriteMapleTree =  new Tree(90, 30, TreeType.MAPLE);

       myFavoriteOakTree.annonceTallTree();

       myFavoriteMapleTree.annonceTallTree();

       System.out.println(myFavoriteOakTree.treeType);

       System.out.println(Tree.Trunk_Color);

       Tree.announceTree();


       //----------------------------------------------------

        Color myTrunkColor = Tree.Trunk_Color;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;

        Color brighterBlue = myDefaultBlue.brighter();






    }
}
