public class TwoStrokeEngine implements Engine {
    private int engineCapacity;

    public TwoStrokeEngine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    @Override
    public String sound() {
        return "taktaktak";
    }
}
