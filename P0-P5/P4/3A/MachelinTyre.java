public class MachelinTyre implements Tyre {
    private int pressure;

    public MachelinTyre(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String getTyreName() {
        return "Machelin";
    }

    @Override
    public int getTyrePressure() {
        return this.pressure;
    }

    @Override
    public int getTyreWidth() {
        return 200;
    }
}
