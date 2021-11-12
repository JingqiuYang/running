import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Movingthing<x> {
    private double x;
    private double y;

    public ImageView getSprite() {
        return sprite;
    }

    private ImageView sprite;
    public Movingthing(double xpos,double ypos,String file,Integer x,Integer y,Integer length,Integer width){
      this.x=xpos;
      this.y=ypos;
      Image spriteSheet=new Image(file);
      sprite = new ImageView(spriteSheet);


    }


}
