package day_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_CSV {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\gagan\\OneDrive\\Documents\\SampleCSV1.csv"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String val : values) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader: " + e.getMessage());
            }
            System.out.println("CSV reading completed.");
        }
    }
}
