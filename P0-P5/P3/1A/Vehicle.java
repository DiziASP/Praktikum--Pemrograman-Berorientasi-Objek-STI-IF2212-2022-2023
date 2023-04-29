public interface Vehicle {
    int getNumberOfWheels();
    int getMaxSpeed();
    String getFuelType();
    void start();
    void stop();
    void turn(String direction);
}
