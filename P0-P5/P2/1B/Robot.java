/**
 * Robot.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public abstract class Robot {

    private int numberOfParts;
    private boolean isActive;

    public Robot(int numberOfParts, boolean isActive) {
        this.numberOfParts = numberOfParts;
        this.isActive = isActive;
    }

    public int getNumberOfParts() {
        return this.numberOfParts;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setActivation(boolean isActive) {
        this.isActive = isActive;
    }

    public String toString() {
        return String.format(
            "Number of Parts: %d, IsActive: %b",
            this.numberOfParts,
            this.isActive
        );
    }

    public abstract long getPrice();
}
