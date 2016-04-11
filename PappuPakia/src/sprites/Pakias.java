package sprites;

import javafx.scene.layout.Pane;
import mainCode.PanelClass;

import java.awt.image.BufferedImage;

/**
 * Created by achalgupta on 4/9/2016.
 */
public class Pakias {
    public int x=50,y=650,velY=-1000,accY=1;
    public BufferedImage pakiaImage;

    public Pakias(int x, int y) {
        this.x = x;
        this.y = y;
        pakiaImage= PanelClass.loadImage("/images/angry_pakia.png");
    }

    public void update(){
        y+=velY;
        velY+=accY;
    }
}
