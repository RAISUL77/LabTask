package problem3;


    public class Clock{
        private int secret1;
        private int secret2;
        private int secret3;
        private int dialPosition;
        private int turnCount;

        public Clock(int secret1, int secret2, int secret3) {
            this.secret1 = secret1;
            this.secret2 = secret2;
            this.secret3 = secret3;
            this.dialPosition = 0;
            this.turnCount = 0;
        }

        public void reset() {
            dialPosition = 0;
            turnCount = 0;
        }

        public void turnLeft(int ticks) {
            dialPosition = (dialPosition + 40 - ticks) % 40;
            turnCount++;
        }

        public void turnRight(int ticks) {
            dialPosition = (dialPosition + ticks) % 40;
            turnCount++;
        }

        public boolean open() {
            if (turnCount != 3) {
                reset();
                return false;
            }

            boolean success = (dialPosition == secret1 && turnCount == 1)
                    || (dialPosition == secret2 && turnCount == 2)
                    || (dialPosition == secret3 && turnCount == 3);

            reset();
            return success;
        }
    }


