package sprites;

import util.Constants;

import java.awt.image.BufferedImage;

/**
 * Created by achalgupta on 4/8/2016.
 */
public class SpriteSuper {
    public int x,y;
    public BufferedImage image;
    public SpriteSuper(int x,int y) {
        this.x = x;
        this.y = y;
        //image=mainCode.PanelClass.loadImage("/images/front_trees.png");
    }
    public void update(){
        this.x-=10;
        if(this.x< -Constants.width){
            this.x=Constants.width;
        }
    }
}
