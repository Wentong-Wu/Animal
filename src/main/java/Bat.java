public class Bat extends Mammal implements Flying{
    @Override
    public String eat() {
        return "Blood..???";
    }
    @Override
    public String takeOff() {
        return "Drop...Flap";
    }

    @Override
    public String flying() {
        return "Flapping...very fast...";
    }

    @Override
    public String landing() {
        return "Upside Down.....";
    }
}
