package io.github.manuelosorio;

/**
 * This class handles the base functionality for the Fibonacci classes.
 * Inherit by the Recursive and Iterative classes.
 * @see Recursive
 * @see Iterative
 */
public abstract class FibonacciBase {
    private final long startTime;
    private final long endTime;

    /**
     * This is the constructor for the FibonacciBase class.
     * @param n The number to calculate the Fibonacci sequence to.
     */
    public FibonacciBase (int n) {
        super();
        this.startTime = System.nanoTime();
        int result = this.fibonacci(n);
        this.endTime = System.nanoTime();
        System.out.println("Number: " + n + " " + this.getClass().getSimpleName() + " Result: "
                + result + " Execution Time: " + this.getExecutionTime() + " nanoseconds");
    }
    /**
     * This method gets the execution time for the Fibonacci sequence.
     * @return The execution time for the Fibonacci sequence.
     */
    public long getExecutionTime() {
        return this.endTime - this.startTime;
    }

    /**
     * This method is the abstract method for the Fibonacci sequence.
     * @param n The number to calculate the Fibonacci sequence to.
     * @return The result of the Fibonacci sequence.
     */
    public abstract int fibonacci(int n);
}
