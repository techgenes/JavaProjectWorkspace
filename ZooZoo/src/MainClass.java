/**
 * Created by achalgupta on 4/4/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Lion lion1=new Lion();
        Tiger tiger=new Tiger();
        Elephant elephant=new Elephant();
        Wolf wolf=new Wolf();
        //Animal animal=new Animal();

        elephant.jump();
        lion1.jump();
        tiger.jump();
        wolf.jump();

        elephant.loadImage();

    }
}
