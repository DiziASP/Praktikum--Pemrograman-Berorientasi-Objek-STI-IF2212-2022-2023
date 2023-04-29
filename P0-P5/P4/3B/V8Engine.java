public class V8Engine implements Engine {
    private int engineCapacity;
    private Boolean isSupercharged;

    public V8Engine(int engineCapacity, Boolean isSupercharged) {
        this.engineCapacity = engineCapacity;
        this.isSupercharged = isSupercharged;
    }

    @Override
    public int getEngineCapacity() {
        if (isSupercharged) {
            return this.engineCapacity + 250;
        }

        return this.engineCapacity;
    }

    @Override
    public String sound() {
        return "ngengngeng";
    }
}
