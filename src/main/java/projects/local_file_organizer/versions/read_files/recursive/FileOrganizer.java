/**
 * READ FILES - NIO / RECURSIVE
 * --------------------------------------------------
 * Scan all subfolders
 */

package projects.local_file_organizer.versions.read_files.recursive;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileOrganizer {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/catalin/Downloads");      

        try (Stream<Path> paths = Files.walk(dir)) {  // Look Here
            paths
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
