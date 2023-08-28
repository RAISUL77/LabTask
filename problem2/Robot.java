package problem2;

    import java.awt.Point;

    public class Robot {
        private Point location;
        private String direction;

        public Robot() {
            location = new Point(0, 0);
            direction = "N"; // Initial direction: North
        }

        public void turnLeft() {
            switch (direction) {
                case "N":
                    direction = "W";
                    break;
                case "E":
                    direction = "N";
                    break;
                case "S":
                    direction = "E";
                    break;
                case "W":
                    direction = "S";
                    break;
            }
        }

        public void turnRight() {
            switch (direction) {
                case "N":
                    direction = "E";
                    break;
                case "E":
                    direction = "S";
                    break;
                case "S":
                    direction = "W";
                    break;
                case "W":
                    direction = "N";
                    break;
            }
        }

        public void move() {
            switch (direction) {
                case "N":
                    location.translate(0, 1);
                    break;
                case "E":
                    location.translate(1, 0);
                    break;
                case "S":
                    location.translate(0, -1);
                    break;
                case "W":
                    location.translate(-1, 0);
                    break;
            }
        }

        public Point getLocation() {
            return new Point(location);
        }

        public String getDirection() {
            return direction;
        }
    }

