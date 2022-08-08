public class FlyingRat extends Bird implements Flying{
    @Override
    public String eat() {
        return "food???????..";
    }
    @Override
    public String takeOff() {
        return "Run...Jump...";
    }

    @Override
    public String flying() {
        return "flapping...";
    }

    @Override
    public String landing() {
        return "Slow...land.";
    }
}
