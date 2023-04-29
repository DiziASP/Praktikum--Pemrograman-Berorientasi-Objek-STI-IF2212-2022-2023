import java.util.ArrayList;
import java.util.List;

public class CarPrinter {
    private List<Car> carList = new ArrayList<Car>();
    private Car testCar;

    public void addCar(Car newCar) {
        carList.add(newCar);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public Car getTestCar(){
        return this.testCar;
    }

    public void setTestCar(String carType){
        if (carType.equals("Car")){
            this.testCar = new Car(4,5);
        }else if (carType.equals("Bus")){
            this.testCar = new Bus(6, 10, 20, true);
        } else if (carType.equals("Perari")){
            this.testCar = new Perari(4, 20, 50, false);
        }
    }
    
    public void printCarList() {
        for (Car car : this.carList) {
            if (car instanceof Bus) {
                System.out.println("Bus: " + car.sound() + " " + car.honk());
            } else if (car instanceof Perari) {
                System.out.println("Perari: " + car.sound() + " " + car.honk());
            } else{
                System.out.println("Car: " + car.sound() + " " + car.honk());
            }
            System.out.println(car.printDescription());
        }
    }    
}
