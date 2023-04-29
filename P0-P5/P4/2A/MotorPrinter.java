import java.util.ArrayList;
import java.util.List;

public class MotorPrinter {
    private List<Motor> motorList = new ArrayList<Motor>();
    private Motor testMotor;

    public void addMotor(Motor newMotor) {
        motorList.add(newMotor);
    }

    public List<Motor> getMotorList() {
        return motorList;
    }

    public Motor getTestMotor(){
        return this.testMotor;
    }

    public void setTestMotor(String motorType){
        if (motorType.equals("Motor")){
            this.testMotor = new Motor(2,3);
        }else if (motorType.equals("FCX")){
            this.testMotor = new FCX(2, 6, 10, true);
        } else if (motorType.equals("Fespa")){
            this.testMotor = new Fespa(2, 2, "Red", false);
        }
    }
    
    public void printMotorList() {
        for (Motor motor : this.motorList) {
            if (motor instanceof FCX) {
                System.out.println("FCX: " + motor.sound());
            } else if (motor instanceof Fespa) {
                System.out.println("Fespa: " + motor.sound());
            } else{
                System.out.println("Motor: " + motor.sound());
            }
            System.out.println(motor.printDescription());
        }
    }    
}
