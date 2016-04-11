package sprites;

import mainCode.PanelClass;

/**
 * Created by achalgupta on 4/8/2016.
 */
public class Ground extends SpriteSuper{
    public Ground(int x, int y) {
        super(x, y);
        image= PanelClass.loadImage("/images/ground.png");
    }
}
