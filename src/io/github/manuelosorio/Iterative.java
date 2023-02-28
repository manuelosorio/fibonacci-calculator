package io.github.manuelosorio;

/**
 * This class handles the iterative method for the Fibonacci sequence.
 * @see FibonacciBase
 */
public class Iterative extends FibonacciBase {
    /**
     * This is the constructor for the Iterative class.
     * @param n The number to calculate the Fibonacci sequence to.
     */
    public Iterative (int n) {
        super(n);
    }

    /**
     * This method is the iterative method for the Fibonacci sequence.
     * @param n The number to calculate the Fibonacci sequence to.
     * @return The result of the Fibonacci sequence.
     */
    @Override
    public int fibonacci(int n) {
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i<= n; i++) {
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
        return prev2;
    }

}
