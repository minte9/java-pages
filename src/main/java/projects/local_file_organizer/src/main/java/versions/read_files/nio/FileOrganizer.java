/**
 * READ FILES - FROM A DIRECTORY - NIO
 * --------------------------------------------------
 * Modern way, how it should be used in real projects.
 * Why this is better:
 *  - Clear exception handling
 *  - Safer resource management
 *  - More powerful API
 */

package projects.local_file_organizer.src.main.java.versions.read_files.nio;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileOrganizer {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/catalin/Downloads");      

        try (Stream<Path> paths = Files.list(dir)) {
            paths
                .filter(Files::isRegularFile)
                .forEach(x -> System.out.println(x.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
