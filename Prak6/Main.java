import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RobotPrinter printer = new RobotPrinter();

        Robot robot1 = new Robot("Robot 1");
        Transformer robot2 = new Transformer("Robot 2", 2);
        Baymax robot3 = new Baymax("Robot 3");
        Bumblebee robot4 = new Bumblebee("Robot 4", 4);

        printer.addRobot(robot4);
        printer.addRobot(robot3);
        printer.addRobot(robot2);
        printer.addRobot(robot1);

        List<Transformer> transformers = new ArrayList<>();
        transformers.add(robot2);
        transformers.add(robot4);

        List<Bumblebee> bumblebees = new ArrayList<>();
        bumblebees.add(robot4);

        printer.printListOfRobot(transformers);
        printer.printListOfTransformer(bumblebees);
        printer.printClassNameOfList(printer.robots);
    }
}
