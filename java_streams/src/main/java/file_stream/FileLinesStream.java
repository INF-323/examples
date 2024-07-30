package file_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileLinesStream {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/sandro/Documents/work/cursos/inf323/examples/java_streams/src/main/java/file_stream/Streams.txt");

        // Tenta abrir o arquivo e processar as linhas
        try (Stream<String> lines = Files.lines(path)) {
            // Filtra as linhas que contêm a palavra "Java"
            List<String> filteredLines = lines
                .filter(line -> line.contains("Java"))
                .collect(Collectors.toList());

            // Exibe as linhas filtradas
            filteredLines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
