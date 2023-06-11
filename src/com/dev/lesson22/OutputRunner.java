package com.dev.lesson22;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "Hello World!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
        
        /** FileOutputStream -> append: true - означает что мы должны добавлять новый текст,
         *  а не перезаписывать его. */
        /*try (FileOutputStream outputStream = new FileOutputStream(file, true);) {
            String value = "Hello World!";
            outputStream.write(value.getBytes());
            outputStream.write("\n".getBytes());
        }*/

    }
}
