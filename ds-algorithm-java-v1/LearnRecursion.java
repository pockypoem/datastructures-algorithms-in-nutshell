public class LearnRecursion {
    public static void main(String[] args) {
        walk(5); //5 steps
    }

    private static void walk(int steps) {
        //recursion -> repetition of internal process

        //Simple example illustration of recursion
        // for(int i = 0; i < steps; i++) {
        //     System.out.println("You take a step");
        // }

        //With recursion, we need a base case that's what we do when we would like to stop.
        //And a recursive case when we would like to continue

        //our base case:
        if(steps < 1) return ;
        System.out.println("You take a step!");

        //recursive case:
        walk(steps - 1);

        /*
        This program has a data structure called call stack
        */
    }
}
