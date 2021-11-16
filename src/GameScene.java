import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class GameScene<foe> extends Scene {

    private Camera camera;
    private staticThing background;
    private ImageView Sprite;
    private Heros hero;
    private staticThing imageleft;
    private staticThing imageright;
    private AnimationTimer timer;
    private Foe foe;



    public void render(){ //Move the BackGround
        double offset = camera.getX()%800;
        imageleft.getSprite().setViewport(new Rectangle2D(offset,0,imageleft.getX(),imageleft.getY()));
        imageright.getSprite().setViewport(new Rectangle2D(0,0,imageright.getX(),imageright.getY()));
        imageright.getSprite().setX(imageright.getX()-offset);

    }

    public ImageView getSprite() {
        return Sprite;
    }
    public GameScene(Group root,double length,double width) {
        super(root, length, width);
        hero = new Heros(150, 250, "heros.png");//hero的位置
        imageleft = new staticThing(800, 400, "desert.png");
        imageright = new staticThing(800, 400, "desert.png");
        foe = new Foe(400, 290, "ghost-Sheet.png");

        root.getChildren().add(imageleft.getSprite());
        root.getChildren().add(imageright.getSprite());
        root.getChildren().add(Heros.getSprite());
        root.getChildren().add(Foe.getSprite());

        camera = new Camera(0, 0, hero);
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                hero.update(l);
                foe.update(l);
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
                     hero.jump();
                 }

             }
         });
      }


}
