import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class staticThing{
    private int x;
    private int y;
    private ImageView sprite ;
    public ImageView getSprite(){return sprite;}

    public staticThing (int x,int y,String filename){
        this.x=x;
        this.y=y;
        Image b=new Image(filename);
        sprite=new ImageView(b);
        //sprite.setViewport(new Rectangle2D(x,x,800,400));
        //sprite.setX(this.x);
        //sprite.setY(this.y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }




}
