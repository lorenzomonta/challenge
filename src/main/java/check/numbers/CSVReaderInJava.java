package check.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderInJava {

    public List<Number> readBooksFromCSV(String fileName) {
        List<Number> numbers = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Number number = createNumber(attributes);

                // adding number into ArrayList
                numbers.add(number);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
        return numbers;
    }

    private Number createNumber(String[] metadata) {
        String prefix = metadata[0];
        String number = metadata[1];

        // create and return number of this metadata
        return new Number(prefix, number);
    }

}