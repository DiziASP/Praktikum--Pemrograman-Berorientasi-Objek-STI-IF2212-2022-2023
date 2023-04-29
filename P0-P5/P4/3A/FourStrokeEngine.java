public class FourStrokeEngine implements Engine {
    private int engineCapacity;

    public FourStrokeEngine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    @Override
    public String sound() {
        return "brumbrum";
    }
}
