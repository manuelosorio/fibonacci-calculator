package io.github.manuelosorio;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CsvWriter extends FileWriter {

    /**
     * This method appends a string to the file.
     * @param fileName The name of the file to write to.
     */
    public CsvWriter(String fileName) throws IOException {
        super(fileName);

        if (!fileName.endsWith(".csv")) {
            throw new IOException("File must be a CSV file");
        }

        this.init();
    }
    /**
     * This is the default constructor for the CsvWriter class.
     * It will create a file with the current date and time.
     * For example: 2020-01-01_12-00.csv
     */
    public CsvWriter() throws IOException {
        super(new SimpleDateFormat("yyyy-MM-dd_HH-mm")
                .format(new Date()) + ".csv");
        this.init();
    }
    /**
     * This method initializes the CSV file.
     * It will add the headers to the file.
     */
    private void init() throws IOException {
        this.append("Input size,Recursive time (ns),Iterative time (ns)\n");

    }
}
