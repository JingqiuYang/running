import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Heros<lastTime, time> extends AnimatedThing {
     private double xpos;
     private static ImageView sprite;
     private double vx;
     private double ax;
     private double ypos;
     private double vy=0;
     private double ay=0;
     private Image spriteSheet;
     private long lastTime;
     private  double gravity=200;


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
          if (lastTime != 0) {


               if (ypos<250) {ay=ay+gravity;} //when the hero is not on the ground, the gravity is applied to him
               if (vy!=0&&ypos>249.9) {ay=0; vy=0; }
               vy = vy + elapsedTime * ay;
               ypos = ypos + elapsedTime * vy;
               // Move
               ax = 0;
               vx = 6;
               vx = vx + elapsedTime * ax;
               xpos = xpos + elapsedTime * vx;
               this.setX(xpos);

               // Animation
               int index = (int) (Math.floor((time / 100000000)) % 6);
               sprite.setViewport(new Rectangle2D(8 + index * 83, 0, 78, 100));
          }
          lastTime=time;
     }

     public void jump() {
          ay=ay-300; //acceleration, the more important is the value behind the sign the more important the jump will be
          //vy=30;
     }



}