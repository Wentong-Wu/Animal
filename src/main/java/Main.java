import com.tsi.wu.wentong.animal.*;

public class Main {
    public static void main(String[] args)
    {
        Cat Cat1 = new Cat("Tommy", true,true, 10);
        Cat Cat2 = new Cat("Timmy", true,true, 10);
        Bat Bat1 = new Bat("vamp",true,true);
        Cat1.Attack(Bat1);
        System.out.println("vamp: "+Bat1.scream());
        System.out.println("vamp health: "+Bat1.getHealth());
    }
}
