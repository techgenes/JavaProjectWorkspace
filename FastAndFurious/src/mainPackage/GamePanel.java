package mainPackage;

import com.sun.org.apache.xpath.internal.operations.Div;
import object.DivideRect;
import utilities.Constant;

import javax.swing.*;
import java.awt.*;

/**
 * Created by achalgupta on 4/11/2016.
 */
public class GamePanel extends JPanel {
    DivideRect rect1,rect2,rect3,rect4,rect5,rect6,rect7,rect8,rect9,rect10;
    public GamePanel() {
         rect1=new DivideRect(250*600/Constant.WIDTH,0,Constant.WIDTH/100,Constant.WIDTH/10);
         rect2=new DivideRect(250*600/Constant.WIDTH,2*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
         rect3=new DivideRect(250*600/Constant.WIDTH,4*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
         rect4=new DivideRect(250*600/Constant.WIDTH,6*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
         rect5=new DivideRect(250*600/Constant.WIDTH,8*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
        rect6=new DivideRect(350*600/Constant.WIDTH,0,Constant.WIDTH/100,Constant.WIDTH/10);
        rect7=new DivideRect(350*600/Constant.WIDTH,2*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
        rect8=new DivideRect(350*600/Constant.WIDTH,4*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
        rect9=new DivideRect(350*600/Constant.WIDTH,6*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);
        rect10=new DivideRect(350*600/Constant.WIDTH,8*Constant.HEIGHT/10,Constant.WIDTH/100,Constant.WIDTH/10);

    }

    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(0,0, Constant.WIDTH,Constant.HEIGHT);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(Constant.WIDTH/4,0,Constant.WIDTH/2,Constant.HEIGHT);
        g.setColor(Color.WHITE);
        //All the rectangles in first line
        g.fillRect(rect1.x,rect1.y,rect1.width,rect1.height);
        g.fillRect(rect2.x,rect2.y,rect2.width,rect2.height);
        g.fillRect(rect3.x,rect3.y,rect3.width,rect3.height);
        g.fillRect(rect4.x,rect4.y,rect4.width,rect4.height);
        g.fillRect(rect5.x,rect5.y,rect5.width,rect5.height);
        //All the rectangles in second line
        g.fillRect(rect6.x,rect6.y,rect6.width,rect6.height);
        g.fillRect(rect7.x,rect7.y,rect7.width,rect7.height);
        g.fillRect(rect8.x,rect8.y,rect8.width,rect8.height);
        g.fillRect(rect9.x,rect9.y,rect9.width,rect9.height);
        g.fillRect(rect10.x,rect10.y,rect10.width,rect10.height);
        //called update of all rectangle so that they could move
        rect1.update();
        rect2.update();
        rect3.update();
        rect4.update();
        rect5.update();
        rect6.update();
        rect7.update();
        rect8.update();
        rect9.update();
        rect10.update();
    }
}
