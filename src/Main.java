// add any useful package line

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

  public class Main extends Application{
      public void start(Stage primaryStage){
        primaryStage.setTitle("run baby run");
        Group root = new Group();
        GameScene scene = new GameScene(root, 600, 400);//show the size of window//
        primaryStage.setScene(scene);
        primaryStage.show();//show the window//
    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}

