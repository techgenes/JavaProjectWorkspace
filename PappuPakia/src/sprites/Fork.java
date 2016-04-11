package sprites;

import mainCode.PanelClass;
import util.Constants;

/**
 * Created by achalgupta on 4/8/2016.
 */
public class Fork extends SpriteSuper{
    public Fork(int x, int y) {
        super(x, y);
        image= PanelClass.loadImage("/images/fork_handle.png");
    }

    public void update(){
        this.x-=10;
        if(this.x< 0){
            this.x=Constants.width;
            if(Constants.random.nextInt(2)==0){
                this.y=Constants.height/2;
            }
            else{
                this.y=0;
            }
        }
    }
}
