public class PoliceCar implements TrackableVehicle{
    private String plateNumber;
    private Point gpsPosition;
    private int speed;
    private String direction;
    private int wheel;
    private String fuelType;
    private boolean started;

    public PoliceCar(String plateNumber, Point gpsPosition, int speed, int wheel, String fuelType) {
        this.plateNumber = plateNumber;
        this.gpsPosition = gpsPosition;
        this.speed = speed;
        this.wheel = wheel;
        this.fuelType = fuelType;
        this.direction = "North";
        this.started = false;
    }

    @Override
    public int getNumberOfWheels() {
        return this.wheel;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public void start() {
        this.started = true;
    }

    @Override
    public void stop() {
        this.started = false;
    }

    @Override
    public void turn(String direction) {
        this.direction = direction;
    }

    @Override
    public String getPlateNumber() {
        return this.plateNumber;
    }

    @Override
    public Point getGPSPosition() {
        return this.gpsPosition;
    }

    public String getDirection() {
        return this.direction;
    }

    public Boolean getStarted() {
        return this.started;
    }
}
