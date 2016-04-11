package sprites;

import util.Constants;

import java.awt.image.BufferedImage;

/**
 * Created by achalgupta on 4/8/2016.
 */
public class BackTrees extends SpriteSuper {

    public BackTrees(int x,int y) {
        super(x,y);
        image=mainCode.PanelClass.loadImage("/images/back_trees.png");
    }

}
