public class DonlupTyre implements Tyre {
    private int pressure;
    private int width;
    private Boolean isSlick;

    public DonlupTyre(int pressure, int width, Boolean isSlick) {
        this.pressure = pressure;
        this.width = width;
        this.isSlick = isSlick;
    }

    @Override
    public int getTyrePressure() {
        return this.pressure;
    }

    @Override
    public int getTyreWidth() {
        return this.width;
    }

    @Override
    public Boolean isSlickTyre() {
        return this.isSlick;
    }
}
