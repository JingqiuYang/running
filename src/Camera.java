public class Camera {

   private double x;
   private double y;
   //private  AnimatedThing  f;
   private Heros f;

   public Camera(Integer x, Integer y, Heros f) {
      this.x = x;
      this.y = y;
      this.f = f;
   }

   public void update () {
      x = x + 3;
      f.getSprite().setX(f.getSprite().getX()-x+50);


   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   @Override
   public String toString(){
      return "("+x+";"+y+")";
      //"是string要加上tostring
   }

}
