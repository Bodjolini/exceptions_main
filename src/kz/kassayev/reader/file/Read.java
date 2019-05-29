package kz.kassayev.reader.file;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

/**
 * class where i read file and fix errors
 */
public class Read {
    private String nameOfFile;
    private double[] numbers;

    public Read(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    /**
     * this method read digits from file
     * numbers separated ","
     * @return read digits
     */
    public double[] getReadNumbers() throws RuntimeException {
        try {
            Path path = Paths.get(nameOfFile);
            try {
                numbers = lines(path)
                        .flatMap(e -> Stream.of(e.split(",")))
                        .mapToDouble(Double::parseDouble)
                        .toArray();

            } catch (NumberFormatException e) {
                System.out.println("Write only digits please : " + e);
            }
        } catch (NoSuchFileException e) {
            System.out.println("file not found : " + e);
        } catch (IOException e) {
            System.out.println("Problems with write file : " + e);
        }
        return numbers;
    }
}
