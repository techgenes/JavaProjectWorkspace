package object;

import utilities.Constant;

/**
 * Created by achalgupta on 4/11/2016.
 */
public class DivideRect {
    public int x,y,width,height;


    public DivideRect(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //this method will change the value of y coordinate of rectangle
    public void update(){
        //change the value of y coordinate of rectangle
        this.y++;
        //if any rectangle y value becomes greater than screen height it again makes it zero
        if(this.y> Constant.HEIGHT){
            this.y=0;
        }
    }
}
