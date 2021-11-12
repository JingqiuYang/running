import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class GameScene extends Scene {

    private Camera camera;
    private staticThing background;
    private ImageView Sprite;
    private Heros hero;
    private staticThing c;
    private staticThing d;
    private staticThing b;
    private AnimationTimer timer;

    public void render(){ //Move the BackGround
        double offset = camera.getX()%800;
        c.getSprite().setViewport(new Rectangle2D(offset,0,c.getX(),c.getY()));
        d.getSprite().setViewport(new Rectangle2D(0,0,d.getX(),d.getY()));
        d.getSprite().setX(d.getX()-offset);
        //hero.getSprite().setX(hero.getX()-camera.getX());

        //c.getSprite().setX(0-offset);
    }

    public ImageView getSprite() {
        return Sprite;
    }
    public GameScene(Group root,double length,double width){
         super(root,length,width);
         hero = new Heros(150,250,"heros.png");//hero的位置
         c=new staticThing(800,400,"desert.png");
         d=new staticThing(800,400,"desert.png");

         root.getChildren().add(c.getSprite());
         root.getChildren().add(d.getSprite());
         //root.getChildren().add(ImageViewSceneryLeft);
         root.getChildren().add(Heros.getSprite());

         camera = new Camera(0,0,hero);
         timer = new AnimationTimer() {
             @Override
             public void handle(long l) {
                 hero.update(l);
               camera.update();
              render();
             }
         };
         timer.start();
         this.setOnKeyPressed(new EventHandler<KeyEvent>() {
             @Override
             public void handle(javafx.scene.input.KeyEvent keyEvent) {
                 if(keyEvent.getText().equals(""));{
                     System.out.println("Hero Jump");

                 }

             }
         });
      }


}
