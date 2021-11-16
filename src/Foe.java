import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Foe extends   AnimatedThing{
    private double xpos;
    private static ImageView sprite;
    private double ypos;
    private Image spriteSheet;
    private double x;
    private double y;
    public static long lastTime;

    public Foe(int x, int y, String file) {
        super(0, 50, "ghost-Sheet.png", 400, 0, 130, 450);
        xpos=x;
        ypos=y;
        spriteSheet = new Image(file);
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(1, 2, 31, 29));
        sprite.setX(xpos);
        sprite.setY(ypos);
    }
    public static ImageView getSprite() {
        return sprite;
    }
    public void update(long time) {
        double elapsedTime = (time - lastTime) / 1000000000;
        int index = (int) (Math.floor((time / 100000000)) % 4);
        sprite.setViewport(new Rectangle2D(index * 32, 0.5, 30, 30));
        sprite.setX(xpos);
        sprite.setY(ypos);
        xpos=xpos-5;
        if(xpos<1){
            xpos=500;
        }
        sprite.setX(xpos);
        System.out.println(xpos);
    sprite.setFitHeight(60);
    sprite.setFitWidth(60);
    }
    }

