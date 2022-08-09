import com.tsi.wu.wentong.animal.*;

public class Main {
    public static void main(String[] args)
    {
        Cat Tommy = new Cat("Tommy",100, true, 10);
        Tommy.setName("Tommy");
        Bat vamp = new Bat("vamp",100,true);
        Tommy.Attack(vamp);
        System.out.println("vamp: "+vamp.scream());
        System.out.println("vamp health: "+vamp.getHealth());
    }
}
