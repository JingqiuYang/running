import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
abstract public class AnimatedThing {
    private static ImageView sprite;
    private static double x;
    private double y;
    private int attitude;
    private int index;
    private double duration;
    private  int maximumindex;
    private int offset;

    public  double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static ImageView getSprite() {
        return sprite;
    }

    public static void setX(double x) {
        AnimatedThing.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public AnimatedThing(double xpos, double ypos, String filename, Integer x, Integer y, Integer length, Integer width) {
        this.x=xpos;
        this.y=ypos;
        Image spriteSheet=new Image(filename);
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(x,y,width,length));
        sprite.setX(xpos);
        sprite.setY(ypos);

    }
}
