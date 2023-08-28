package problem2;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new Robot();

        System.out.println("Initial Location: " + robot.getLocation() + ", Direction: " + robot.getDirection());

        robot.turnRight();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();

        System.out.println("Final Location: " + robot.getLocation() + ", Direction: " + robot.getDirection());
    }
}
