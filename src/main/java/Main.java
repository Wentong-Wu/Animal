import com.tsi.wu.wentong.animal.*;

public class Main {
    public static void main(String[] args)
    {
        Cat Tommy = new Cat("Tommy", true, 10);
        Tommy.setName("Tommy");
        System.out.print(Tommy.kill());
        Bat vamp = new Bat("vamp",true);
        System.out.println(vamp.takeOff());
        System.out.println(Tommy.Sleep());
        Tommy.Attack(vamp);
    }
}
