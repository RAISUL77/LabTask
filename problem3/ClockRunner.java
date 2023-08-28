package problem3;

public class ClockRunner {
    public static void main(String[] args) {
        Clock lock = new Clock(10, 20, 10);

        lock.turnRight(10);
        lock.turnLeft(20);
        lock.turnRight(10);

        boolean isOpen = lock.open();
        if (isOpen) {
            System.out.println("Lock is open!");
        } else {
            System.out.println("Incorrect combination.");
        }
    }
}
