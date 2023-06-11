package com.dev.lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        /*File file = Path.of("resources", "writer.txt").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
            fileWriter.newLine();
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }*/

        /** Класс - Files. */

        Path path = Path.of("resources", "writer2.txt");
        Files.write(path, List.of("Hello world!", "Java"));

        /*try (BufferedWriter fileWriter = Files.newBufferedWriter(file)) {
            fileWriter.newLine();
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }*/
    }
}
