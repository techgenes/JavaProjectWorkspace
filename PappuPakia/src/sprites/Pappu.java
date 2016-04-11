package sprites;

import mainCode.PanelClass;

import java.awt.image.BufferedImage;

/**
 * Created by achalgupta on 4/8/2016.
 */
public class Pappu {
    public BufferedImage image;
    public BufferedImage image1;
    public BufferedImage image2;
    public BufferedImage image3;
    public BufferedImage image4;
    public BufferedImage[] images;
    //BufferedImage image5;
    public int x,y,i=0,j=0,velocityY=10,accelerationY=5,sizeX=60,sizeY=50;

    public Pappu(int x, int y) {
        this.x=x;
        this.y=y;
        image= PanelClass.loadImage("/images/pappu1.png");
        image1= PanelClass.loadImage("/images/pappu1.png");
        image2= PanelClass.loadImage("/images/pappu2.png");
        image3= PanelClass.loadImage("/images/pappu3.png");
        image4= PanelClass.loadImage("/images/pappu4.png");
       // image5= PanelClass.loadImage("/images/pappu1.png");
        images=new BufferedImage[]{image1,image2,image3,image4};
    }

    public void update(){
        //image=images[i];
        if(j%5==0) {
            i++;
            if (i % 4 == 0) {
                i = 0;
            }
            velocityY=Math.max(velocityY+accelerationY,-30);

            y+=velocityY;
        }
        j++;
    }

    public void updateAnimation(){
        image=images[i];
        if(j%5==0) {
            i++;
            if (i % 4 == 0) {
                i = 0;
            }
       }
        j++;
    }
}


