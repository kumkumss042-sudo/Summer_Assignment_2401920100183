import java.util.*;

abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        return "First Class:Please Maintain silence and Comfort.";
   } 
}
class Ladies extends Compartment{
    public String notice(){
        return "Ladies Class:Reserved for womens.";
    }
}
class General extends Compartment{
    public String notice(){
        return "General class:Cooperate with fellow passengers.";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "Luggage Class:For luggages and goods only.";
    }
}
public class testCompartment{
    public static void main(String[] args) {
        Compartment compartments[]=new Compartment[10];
        Random rand=new Random();

        for(int i=0;i<compartments.length;i++){
        int choice=rand.nextInt(4)+1;

        switch(choice){
            case 1:
                compartments[i]=new FirstClass();
                break;

            case 2:
                compartments[i]=new Ladies();
                break;

            case 3:
                 compartments[i]=new General();
                break;
            case 4:
                 compartments[i]=new Luggage();
                break;
        }
        }

        System.out.println("Compartment Notices:");

        for(Compartment c:compartments){
            System.out.println(c.notice());
        }
    }
}
