package irfan_FileProcessor;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileProcessor {

    public static void processFile(String sourceFile, String destinationFile) {
        File inputFile = new File(sourceFile);
        File outputFile = new File(destinationFile);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace spaces with underscores
                String modifiedLine = line.replace(' ', '_');
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("File processing completed successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred during file processing: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileProcessor <sourceFile> <destinationFile>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        processFile(sourceFile, destinationFile);
    }
}