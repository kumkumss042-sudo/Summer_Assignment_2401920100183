package week4.oops;

class box{
  double length;
  double breadth;
  box(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
  }
   double area(){
    return length*breadth;
   }
}
class box3D extends box{
  double height;
  box3D(double length,double breadth,double height){
    super(length,breadth);
    this.height=height;
  }

  double volume(){
    return length*breadth*height;
  }
}
public class problem4{
    public static void main(String[] args) {
        box3D obj1=new box3D(5,10,3);
        System.out.println("Area:"+ obj1.area());

        System.out.println("Volume:"+obj1.volume());
    }
}
