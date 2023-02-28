package io.github.manuelosorio;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This is the main class for the Fibonacci program.
 * It will run the recursive and iterative methods for the Fibonacci sequence.
 * And get the execution time for each method to compare them
 * and write the results to a CSV file.
 * @see Recursive
 * @see Iterative
 * @see CsvWriter
 * @author Manuel Osorio
 * @version 1.0
 */
public class FibonacciCalculator {

    public static void main(String[] args) throws IOException {
        CsvWriter csvWriter = new CsvWriter();
        int[] testNumberSet = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        AtomicReference<Long> recursiveTime = new AtomicReference<>(null);
        AtomicReference<Long> iterativeTime = new AtomicReference<>(null);

        for (int number : testNumberSet) {
            Thread recursionThread = new Thread(() ->
                    recursiveTime.set((new Recursive(number)).getExecutionTime()));
            Thread iterationThread = new Thread(() ->
                    iterativeTime.set((new Iterative(number)).getExecutionTime()));
            recursionThread.start();
            iterationThread.start();
            try {
                recursionThread.join();
                iterationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           try {
               csvWriter.append(number + "," + recursiveTime + "," + iterativeTime + "\n");
              } catch (IOException e) {
               System.out.println("Error: " + e.getMessage());
           }
        }
        csvWriter.close();
    }
}
