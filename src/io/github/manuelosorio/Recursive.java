package io.github.manuelosorio;

/**
 * This class handles the recursive method for the Fibonacci sequence.
 *
 * @see FibonacciBase
 */
public class Recursive extends FibonacciBase {
    /**
     * This is the constructor for the Recursive class.
     * @param n The number to calculate the Fibonacci sequence to.
     */
    public Recursive (int n) {
        super(n);
    }

    /**
     * This method is the recursive method for the Fibonacci sequence.
     * @param n The number to calculate the Fibonacci sequence to.
     * @return The result of the Fibonacci sequence.
     */
    @Override
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
        }
    }
}
