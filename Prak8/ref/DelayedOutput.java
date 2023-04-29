package Prak8.ref;

public class DelayedOutput {
    static class DelayThread extends Thread {
        private int delayMillisec;
        private String output;

        public DelayThread(int delayMillisec, String output) {
            this.delayMillisec = delayMillisec;
            this.output = output;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(delayMillisec);
            } catch (InterruptedException e) {

            }
            System.out.println(output);
        }
    }

    public static void printDelayed(int delayMillisec, String output) {
        Thread t = new DelayThread(delayMillisec, output);
        t.start();
    }
}