package file_stream;

import java.io.File;
import java.util.Arrays;


public class FileStream {
    public static void main(String[] args) {
        File directory = new File("/Users/sandro/Documents/work/cursos/inf323/examples/java_streams/src/main/java/file_stream/");

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            Arrays.stream(files)
                    .map(File::getName)
                    .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
