package task2;

    public class Task3_24 {

        private boolean x = true;
        private boolean y = true;
        private boolean z = true;

        public static void main(String[] args) {
            Task3_24 task = new Task3_24();
            task.runTests();
        }

        private void runTests() {
            for(int i = 0; i < 2; i++) {
                y = true;
                for(int j = 0; j < 2; j++) {
                    z = true;
                    for(int k = 0; k < 2; k++) {
                        System.out.println("x =" + x + ", y = " + y + ", z = " + z + ", Result = " + taskX(x, y, z));
                        System.out.println("x =" + x + ", y = " + y + ", z = " + z + ", Result = " + taskY(x, y, z));
                        System.out.println("x =" + x + ", y = " + y + ", z = " + z + ", Result = " + taskZ(x, y, z));
                        z = false;
                    }
                    y = false;
                }
                x = false;
            }
        }

        private boolean taskX(boolean x, boolean y, boolean z) {
            return !(y || !x && x) || z;
        }

        private boolean taskY(boolean x, boolean y, boolean z) {
            return x && !(!y || z) || y;
        }

        private boolean taskZ(boolean x, boolean y, boolean z) {
            return !(x || y && z) || !x;
        }
    }




