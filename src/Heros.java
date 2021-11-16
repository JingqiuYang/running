import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Heros<lastTime, time> extends AnimatedThing {
    private double xpos;
    private static ImageView sprite;
    private double vx;
    private double ax;
    private double ypos;
    private double vy = 0;
    private double ay = 0;
    private Image spriteSheet;
    public static long lastTime;
    private double gravity = 3;
    private int jumpindex = 0;
    private int upFloorDown = 0;
    private int attitude = 0;


    public Heros(int x, int y, String file) {
        super(250, 250, "heros.png", 0, 0, 100, 85);
        xpos = x;
        ypos = y;
        spriteSheet = new Image(file);
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20, 0, 65, 100));
        sprite.setX(xpos);
        sprite.setY(ypos);
    }

    public static ImageView getSprite() {
        return sprite;
    }

    public void update(long time) {
        double elapsedTime = (time - lastTime) / 10000000;
        int index = (int) (Math.floor((time / 100000000)) % 6);
        sprite.setViewport(new Rectangle2D(8 + index * 83, 0, 78, 100));
        sprite.setX(xpos);
        sprite.setY(ypos);
        System.out.println(attitude);

        switch (attitude) {
            case 0: //running
                xpos = xpos + 3;
                sprite.setX(xpos);
                break;
            case 1: //jumping up
                if (ypos > 150) {
                    ypos = ypos - gravity;
                    xpos = xpos + 3;
                    System.out.println(ypos);
                    //System.out.println(xpos);
                    sprite.setViewport(new Rectangle2D(24, 165, 70, 100));
                    sprite.setY((int) ypos);
                    sprite.setX((int) xpos);
                } else {
                    attitude = 2;
                }
                break;
            case 2: //falling down
                if (ypos < 250) {
                    ypos = ypos + gravity;
                    xpos = xpos + 3;
                    sprite.setViewport(new Rectangle2D(95, 165, 70, 100));
                    sprite.setY(ypos);
                    sprite.setX(xpos);
                } else {
                    attitude = 0;
                }
                break;
        }

    }

    public void jump() {

        attitude = 1;
    }
}



