public class Camera {

   private double x;
   private double y;
   private  AnimatedThing  f;

   public Camera(Integer x,Integer y, AnimatedThing  f) {
      this.x = x;
      this.y = y;
      this.f = f;
   }

   public void update () {
      x=f.getX()-100;

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
