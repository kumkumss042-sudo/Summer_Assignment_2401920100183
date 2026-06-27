package week4.oops;

class Point{
    private int x,y;

    //Default constructor
    public Point(){
        x=0;
        y=0;
    }

    public Point(int x,int y){
       this.x=x;
       this.y=y;
    }

    public void setX(int x){
    this.x=x;
    }

    public void setY(int y){
    this.y=y;
    }

    public void setXY(int x,int y){
    this.x=x;
    this.y=y;
    }
    
    public void display(){
        System.out.println("x:"+x+" ,y:"+y);
    }
}


public class problem3{
    public static void main(String[] args) {
        Point p1=new Point();
        p1.display();

        Point p2=new Point(5,10);
        p2.display();

        p2.setY(20);
        p2.display();

        p2.setXY(2,3);
        p2.display();
    }
}
