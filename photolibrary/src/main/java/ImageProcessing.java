//package PhotoLibrary;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

public class ImageProcessing {

    public static void main(String[] args) {
        try {
            // Example image files array; adjust the paths as necessary
            File folder = new File("/Users/sandro/Documents/work/cursos/inf323/examples/photolibrary/src/main/resources/images");
            File[] listOfFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg"));

            if (listOfFiles == null) {
                System.out.println("No image files found.");
                return;
            }

            List<File> imageFiles = Arrays.asList(listOfFiles);

            // Process images sequentially
            long startTime = System.currentTimeMillis();
            ProcessST(imageFiles);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Execution time: " + executionTime + " milliseconds");

            // Process images using multiple threads
            long startTimeMT = System.currentTimeMillis();
            ProcessMT(imageFiles);
            long endTimeMT = System.currentTimeMillis();
            long executionTimeMT = endTimeMT - startTimeMT;
            System.out.println("Execution time (MT): " + executionTimeMT + " milliseconds");

            // Process images using tasks
            long startTimeTasks = System.currentTimeMillis();
            ProcessTasks(imageFiles);
            long endTimeTasks = System.currentTimeMillis();
            long executionTimeTasks = endTimeTasks - startTimeTasks;
            System.out.println("Execution time (Tasks): " + executionTimeTasks + " milliseconds");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void ProcessST(List<File> imageFiles) {
        for (File imageFile : imageFiles) {
            ProcessImage(imageFile);
        }
    }

    public static void ProcessMT(List<File> imageFiles) {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (File imageFile : imageFiles) {
            executor.submit(() -> ProcessImage(imageFile));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ProcessTasks(List<File> imageFiles) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (File imageFile : imageFiles) {
            executor.submit(() -> ProcessImage(imageFile));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void ProcessImage(File imageFile) {
        try {
            BufferedImage image = ImageIO.read(imageFile);
            if (image == null) {
                System.out.println("Could not read image: " + imageFile.getPath());
                return;
            }

            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    Color pixel = new Color(image.getRGB(x, y));
                    int grayScale = (int) (pixel.getRed() * 0.3 + pixel.getGreen() * 0.59 + pixel.getBlue() * 0.11);
                    Color grayColor = new Color(grayScale, grayScale, grayScale);
                    image.setRGB(x, y, grayColor.getRGB());
                }
            }

            File outputFolder = new File("/Users/sandro/Documents/work/cursos/inf323/examples/photolibrary/src/main/resources/output");
            if (!outputFolder.exists()) {
                outputFolder.mkdirs();
            }
            File outputFile = new File(outputFolder, imageFile.getName());
            ImageIO.write(image, "jpg", outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the image " + imageFile.getPath() + ": " + e.getMessage());
        }
    }
}