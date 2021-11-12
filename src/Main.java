// add any useful package line

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

  public class Main extends Application{
 // private static final Image SCENERY = new Image("desert.png",800,400,true,true);
  //final private ImageView ImageViewSceneryLeft=new ImageView(SCENERY);//显示图片//
    public void start(Stage primaryStage){
        primaryStage.setTitle("run baby run");
        Group root = new Group();
        GameScene scene = new GameScene(root, 600, 400);//显示窗口大小//
        primaryStage.setScene(scene);
        primaryStage.show();//显示窗口//
    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}

