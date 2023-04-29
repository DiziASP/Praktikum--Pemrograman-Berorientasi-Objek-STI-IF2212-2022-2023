public class DonlupTyre implements Tyre {
    private int pressure;
    private int width;

    public DonlupTyre(int pressure, int width) {
        this.pressure = pressure;
        this.width = width;
    }

    @Override
    public String getTyreName() {
        return "Donlup";
    }

    @Override
    public int getTyrePressure() {
        return this.pressure;
    }

    @Override
    public int getTyreWidth() {
        return this.width;
    }
}
