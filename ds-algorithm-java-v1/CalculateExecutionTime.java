public class CalculateExecutionTime {
    public static void main(String[] args) {
        //calculate execution time

        long start = System.nanoTime();

        // ------program ---------
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        // -----------------------

        long duration = (System.nanoTime() - start) / 1000000; //to get in milliseconds
        System.out.println(duration + " ms");
    }
}
