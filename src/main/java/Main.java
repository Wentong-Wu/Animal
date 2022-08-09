import com.tsi.wu.wentong.animal.*;

public class Main {
    public static void main(String[] args)
    {
        Cat Tommy = new Cat("Tommy", true,true, 10);
        Cat Timmy = new Cat("Timmy", true,false, 10);
        Bat vamp = new Bat("vamp",true);
        Tommy.Attack(vamp);
        System.out.println("vamp: "+vamp.scream());
        System.out.println("vamp health: "+vamp.getHealth());
        Cat Tammy = (Cat) Tommy.breed(Timmy);
        System.out.println(Tammy);
    }
}
