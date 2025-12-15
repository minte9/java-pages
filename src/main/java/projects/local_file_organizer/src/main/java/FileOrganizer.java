/**
 * READ FILES / GROUP BY EXTENSION
 * -------------------------------
 *  - Strings
 *  - Collections
 *  - Streams
 *  - Lambdas
 *  - Method references
 */

package projects.local_file_organizer.src.main.java;

import java.io.File;
import java.util.Arrays;
import java.util.Set;

public class FileOrganizer {
    public static void main(String[] args) {

        File dir = new File(System.getProperty("user.home"), "Downloads");

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Not a directory");
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) return;

        Set<String>extensions = Set.of("pdf", "sql");

        Arrays.stream(files)
              .filter(File::isFile)
              .map(File::getName)
              .filter(name -> {
                    int dot = name.lastIndexOf(".");
                    return dot != -1 &&
                           extensions.contains(name.substring(dot + 1).toLowerCase());
              })
              .forEach(System.out::println);
    }
}
