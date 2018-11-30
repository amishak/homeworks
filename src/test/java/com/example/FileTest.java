package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileTest {

    private static String fileSeparator = System.getProperty("file.separator");
    private static String FILE_PATH = "src" + fileSeparator + "main" + fileSeparator + "java" + fileSeparator
    + "com" + fileSeparator + "example" + fileSeparator + "docs" + fileSeparator + "Mickiewicz.txt";

    @Test
    public void testReadFileByScanner() {

        File fileInput = new File(FILE_PATH);
        Scanner in = null;
        try {
            in = new Scanner(fileInput);
//            in.useDelimiter("\n");
            while (in.hasNext()) {
                System.out.println("in.next() = " + in.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

    }

    @Test
    public void testReadFileByScannerWithResources() {

        File fileInput = new File(FILE_PATH);
        try (Scanner in = new Scanner(fileInput)) {
//            System.out.println("file is directory: " + fileInput.isDirectory());
            while (in.hasNext()) {
                System.out.println("in.next() = " + in.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testReadFileByLines() {
        Path path = Paths.get(FILE_PATH);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println("line = " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testCountEmptyLines() {
        Path path = Paths.get(FILE_PATH);
        int counter = 0;
        int counterAll = 0;
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                if (line.isEmpty()) {
                    counter++;
                }
                counterAll++;
//                System.out.println("line = " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("counter = " + counter);
        System.out.println("counterAll = " + counterAll);
    }

    @Test
    public void testFindLongestLine() {
        Path path = Paths.get(FILE_PATH);
        String longestLine = null;
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println("line = " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(longestLine);
    }
}
